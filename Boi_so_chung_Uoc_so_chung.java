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
public class Boi_so_chung_Uoc_so_chung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long a = in.nextInt();
            long b = in.nextInt();
            long BCNN = (a*b)/__gcd(a,b);
            System.out.println(BCNN+" "+(__gcd(a,b)));
        }
    }

    private static long __gcd(long a, long b) {
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b; // a = a - b
            }else{
                b -= a;
            }
        }
        return a;
    }
}
