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
public class Danh_sach_ke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a=new int[n+5][n+5];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print("List("+i+") = ");
            for(int j=1;j<=n;j++){
                if(a[i][j]==1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
