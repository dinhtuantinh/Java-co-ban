/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Kiem_tra_so_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            //if(n<0) System.out.println("NO");
           // else{
            if(n==0) System.out.println("YES");
            else{
                long f0=0,f1=1,fn=0,dem=0;
                while(fn<n){
                    fn=f0+f1;
                    f0=f1;
                    f1=fn;
                    if(fn==n) dem+=1;
                }
                if(dem==1) System.out.println("YES");
                else System.out.println("NO");
           }
            
        }
    }
}
