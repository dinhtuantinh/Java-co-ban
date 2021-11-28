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
public class Uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int dem=0;
            for(int i=1;i<=sqrt(n);i++){
                if(n%i==0){
                    if(i*i==n&&i%2==0) dem++;
                    else{
                        if(i%2==0) dem++;
                        if((n/i)%2==0) dem++;
                    }
                }
            }
            System.out.println(dem);
        }
    }
}
