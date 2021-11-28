/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Giao_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int dem1 = 0;
        int A[]=new int[n];
        HashMap<Integer, Boolean> mp1 = new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp1.get(a[i])==null){
                A[dem1]=a[i];
                dem1++;
                mp1.put(a[i], true);
            }
        }
        int dem2=0;
        int B[]=new int[m];
        HashMap<Integer, Boolean> mp2 = new HashMap<>();
        for(int i=0; i<m; i++){
            if(mp2.get(b[i])==null){
                B[dem2]=b[i];
                dem2++;
                mp2.put(b[i], true);
            }
        }
        for(int i=0;i<dem1;i++){
            for(int j=0;j<dem2;j++){
                if(A[i]==B[j]){
                    System.out.print(A[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
