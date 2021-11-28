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
public class Tong_so_nguyen_lon_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        in.nextLine();
//        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c ;
            c=a.add(b);
            System.out.println(c);
        }
    //}
}
