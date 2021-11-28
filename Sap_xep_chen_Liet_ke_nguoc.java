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
public class Sap_xep_chen_Liet_ke_nguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = 1;
        while(test-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            ArrayList<String>res = new ArrayList<>();
            int key, j, dem=0;
            for(int i=0;i<n;i++){
                String s = "Buoc "+i+": ";
                j=i;
                key=a[i];
                while(j>0&&key<a[j-1]){
                    a[j]=a[j-1];
                    j=j-1;
                }
                dem+=1;
                a[j]=key;
                for(int k=0;k<dem;k++){
                    s = s+" "+a[k];
                }
                res.add(s);
            }
            Collections.reverse(res);
            for(String s:res){
                System.out.println(s);
            }
        }
    }
}
