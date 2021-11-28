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
public class Mang_doi_xung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int ok=1;
            for(int i=0;i<n;i++){
                if(arr[i]!=arr[n-i-1]){
                    System.out.println("NO");
                    ok=0;
                    break;
                }
            }
            if(ok==1){
                System.out.println("YES");
            }
        }
    }
}
