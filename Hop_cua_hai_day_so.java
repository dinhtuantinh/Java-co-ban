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
public class Hop_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k=n+m;
        int a[]=new int[k];
        for(int i=0;i<k;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int dem=0;
        int A[]=new int[k];
        HashMap<Integer, Boolean> res = new HashMap<>();
        for(int i=0;i<k;i++){
            if(res.get(a[i])==null){
                A[dem]=a[i];
                dem++;
                res.put(a[i], true);
            }
        }
        for(int i=0;i<dem;i++){
            System.out.print(A[i]+" ");
        }
    }
}
