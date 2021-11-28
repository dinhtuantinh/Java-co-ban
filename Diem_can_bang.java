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
public class Diem_can_bang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int tong=0;
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
                tong+=arr[i];
            }
            int tongnua=0, res = -1;
            for(int i=0;i<n-1;i++){
                tongnua+=arr[i];
                if(tongnua==(tong-tongnua-arr[i+1])){
                    res=i+2;
                    break;
                }
            }
            if(res<0){
                System.out.println("-1");
            }
            else{
                System.out.println(res);
            }
        }
    }
}
