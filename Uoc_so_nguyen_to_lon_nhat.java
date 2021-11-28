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
public class Uoc_so_nguyen_to_lon_nhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            long n = in.nextLong();
            long res = -1;
            for(int i=2;i<=sqrt(n);i++){
                while(n%i==0){
                    n/=i;
                    if(n>1) res=n;
                }
            }
            if(res>0) System.out.println(res);
            else System.out.println(n);
        }
    }
}
