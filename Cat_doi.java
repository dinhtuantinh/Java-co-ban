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
public class Cat_doi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check1=0;
            int check2=1;
            int k=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    check1=1;
                    k=i;
                    break;
                }
            }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'){
                    check2=0;
                    break;
                }
            }
            if(check1==0||check2==0){
                System.out.println("INVALID");
            }
            else{
                String res="";
                for(int i=k;i<s.length();i++){
                    if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9'){
                        res+='0';
                    }
                    if(s.charAt(i)=='1'){
                        res+='1';
                    }
                }
                System.out.println(res);
            }
        }
    }
}
