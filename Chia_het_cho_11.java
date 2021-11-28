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
public class Chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int Schan=0, Sle=0;
            for(int i=0;i<s.length();i++){
                if(i%2==0) Schan += s.charAt(i)-'0';
                else Sle+= s.charAt(i)-'0';
            }
            int k=Schan-Sle;
            if(k%11==0) System.out.println("1");
            else System.out.println("0");
        }
    }
}
