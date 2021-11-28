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
public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int m=1;
        while(t-->0){
            System.out.println("Test "+m+":");
            int n = in.nextInt();
            int k=0;
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            } 
            for(int i=0;i<n;i++){
                int ok=1;
                for(int j=0;j<k;j++){
                    if(a[i]==b[j]){
                        ok=0;
                        break;
                    }
                }
                if(ok==1){
                    System.out.print(a[i]+" xuat hien ");
                    int dem=1;
                    for(int x=i+1;x<n;x++){
                        if(a[x]==a[i]){
                            dem++;
                        }
                    }
                    System.out.println(dem+" lan");
                    b[k]=a[i];
                    k++;
                }
                else continue;
            }
            m++;
        }
    }
}
