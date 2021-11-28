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
public class tim_so_du {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            long n=in.nextLong();
            System.out.println(fnMod(n));
        }
    }
    static int fnMod(long n)
    {
        // calculate res based on value of n
        return (n % 4 != 0) ? 0 : 4;
    }
}
