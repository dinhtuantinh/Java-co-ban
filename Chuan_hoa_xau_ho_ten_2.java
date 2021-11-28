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
public class Chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            s=s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] res= s.split(" ");
            s="";
            for(int i=0;i<res.length;i++) {
                s+=String.valueOf(res[i].charAt(0)).toUpperCase() + res[i].substring(1);
                if(i<res.length-1) // nếu tempt[i] không phải từ cuối cùng
                    s+=" ";   // cộng thêm một khoảng trắng
            }
//            String ho = ", ";
//            String ten = "";
            int k = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    k=i;
                    break;
                }
            }
            for(int i=k+1;i<s.length();i++){
                System.out.print(s.charAt(i));
            }
            System.out.print(", ");
            String ho="";
            for(int i=0;i<k;i++){
               ho+=s.charAt(i);
            }
            ho=ho.toUpperCase();
            System.out.println(ho);
        }
    }
}
