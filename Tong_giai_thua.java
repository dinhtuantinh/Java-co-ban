/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tong_giai_thua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum=0;
        long gt=1;
        for(long i=1; i<=n;i++){
            gt *= i;
            sum += gt;
        }
        System.out.println(sum);
    }
}
