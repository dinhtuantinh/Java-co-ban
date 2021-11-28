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
public class So_dep_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check1=1, check2=1;
            for(int i=0; i<s.length(); i++){
                int k = s.charAt(i)-'0';
                if(Nto(k)==0) check1=0;
            }
            int l=s.length()-1;
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i)-'0') != (s.charAt(l-i)-'0')) check2=0;
            }
            if(check1==1&&check2==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
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
