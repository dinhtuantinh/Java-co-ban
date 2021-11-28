/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            System.out.println(lcm(n));
        }
    }
    static long gcd(long a, long b)
    {
        if(a%b != 0)
           return gcd(b,a%b);
        else
           return b;
    }
    static long lcm(long n){
       long ans = 1;
       for(long i=1; i<=n; i++)
           ans = (ans * i)/(gcd(ans, i));
       return ans;
    }
}
