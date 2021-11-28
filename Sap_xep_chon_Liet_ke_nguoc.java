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
public class Sap_xep_chon_Liet_ke_nguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int min;
        ArrayList<String>res = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            String s = "Buoc "+(i+1)+": ";
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int x=a[i];
                a[i]=a[min];
                a[min]=x;
            }
            for(int k=0;k<n;k++){
                s = s+" "+a[k]; 
            }
            res.add(s);
            //System.out.println();
        }
        Collections.reverse(res);
        for(String s:res){
            System.out.println(s);
        }
    }
}
