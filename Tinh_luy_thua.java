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
public class Tinh_luy_thua {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int t = in.nextInt();
        //in.nextLine();
        //int t=0;
        while(true){
            int a = in.nextInt();
            long b = in.nextLong();
            if(a == 0 && b == 0) break;
            long M = 1000000007;
            System.out.println(mu(a,b,M));
        }
    }
    public static long mu(int a, long b, long M) {
        if(b == 1) return a;
        if(b == 0) return 1;
        long c = mu(a,(long) b/2, M);
        if(b % 2 == 0){
            return (c%M * c%M) % M;
        }
        return (c%M * c%M * a%M) % M;
    }
}
