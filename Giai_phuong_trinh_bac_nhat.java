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
public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            //double nghiem;
            if(a==0){
                if(b==0){
                    System.out.println("VSN");
                }
                else{
                    System.out.println("VN");
                }
            }
            else{
                double nghiem =(double)-b/(double)a;
                System.out.printf("%1.2f", nghiem);
            }
//        }
    }
}
