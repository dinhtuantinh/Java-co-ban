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
public class Sap_xep_chon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int min;
        for(int i=0;i<n-1;i++){
            System.out.print("Buoc "+(i+1)+": ");
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
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
