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
public class Sap_xep_doi_cho_Liet_ke_nguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            int x=1;
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            ArrayList<String>res = new ArrayList<>();
            for(int i=0;i<n-1;i++){
                String s = "Buoc "+x+": ";
                for(int j=i+1;j<n;j++){

                    if(a[i]>a[j]){
                        int tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                    }
                }
                for(int k=0;k<n;k++){
                    s = s+" "+a[k];
                }
                res.add(s);
                x++;
            }
            Collections.reverse(res);
            for(String s:res){
                System.out.println(s);
            }
        }
    }
}
