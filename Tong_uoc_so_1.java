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
public class Tong_uoc_so_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while(t-->0){
            long n = in.nextLong();
            long tong=0;
            while(n-->0){
                long k = in.nextLong();
                long tongtich=0;
                for(long i=2;i<=sqrt(k);i++){
                    long dem=0;
                    if(k % i == 0 && snt(i)){
                        //tongtich+=i;
                        while(k%i==0){
                            dem+=1;
                            k/=i;
                        }
                        tongtich = tongtich + i * dem;
                    }
                    
                }
                if(k>1) tongtich+=k;
                tong+=tongtich;
            }
            System.out.println(tong);
        //}
    }
    static boolean snt(long n){
       if(n<2) return false;
       for(long i=2; i<=sqrt(n); i++)
           if(n%i==0) return false;
       return true;
    }
}
