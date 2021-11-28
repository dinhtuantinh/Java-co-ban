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
public class So_dep_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check1=1, check2=1, check3=1;
            int sum=0;
            for(int i=0; i<s.length(); i++){
                sum+=s.charAt(i)-'0';
            }
            if(sum%10!=0) check1=0;
            int l=s.length()-1;
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i)-'0') != (s.charAt(l-i)-'0')) check2=0;
            }
            if(s.charAt(l) != '8' && s.charAt(0) != '8') check3=0;
            if(check1==1&&check2==1&&check3==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
