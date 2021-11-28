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
public class So_khong_lien_ke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check1=1, check2=1;
            int sum=0;
            for(int i=0; i<s.length(); i++){
                sum+=(s.charAt(i)-'0');
            }
            if(sum%10!=0) check1=0;
            for(int i=0;i<s.length()-1;i++){
                if(Math.abs((s.charAt(i+1)-'0')-(s.charAt(i)-'0'))!=2) check2=0;
            }
            if(check1==1&&check2==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
