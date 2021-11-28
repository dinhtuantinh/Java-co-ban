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
public class Sap_xep_noi_bot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
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
            System.out.print("Buoc "+(i+1)+": ");
            for(int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
