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
public class Chu_so_4_va_chu_so_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int t = in.nextInt();
       // in.nextLine();
       // while(t-->0){
            String s = in.nextLine();
            
            int dem4=0,dem7=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='4'){
                    dem4+=1;
                }
                if(s.charAt(i)=='7'){
                    dem7+=1;
                }
            }
            if((dem4+dem7)==4||(dem4+dem7)==7) System.out.println("YES");
            else System.out.println("NO");
       // }
    }
}
