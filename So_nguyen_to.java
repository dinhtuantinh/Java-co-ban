/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class So_nguyen_to {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n=in.nextInt();
            if(Nto(n)==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    public static int Nto(long n){
        if(n<2) return 0;
        else{
            for(long i=2;i<=sqrt(n);i++){
                if(n%i==0) return 0;
            }
        }
        return 1;
    }
}
