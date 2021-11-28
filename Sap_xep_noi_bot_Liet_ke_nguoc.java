/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sap_xep_noi_bot_Liet_ke_nguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            ArrayList<String>res = new ArrayList<>();
            for(int i=0;i<n;i++){
                int t=0;
                for(int j=0;j<n-1-i;j++){
                    if(a[j]>a[j+1]){
                        int tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                        t=1;
                    }
                }
                if(t==0) break;
                String s = "Buoc "+(i+1)+": ";
                for(int k=0;k<n;k++){
                    s = s+" "+a[k];
                }
                res.add(s);
               // System.out.println();
            }
            Collections.reverse(res);
            for(String s:res){
                System.out.println(s);
            }
        }
    }
}
