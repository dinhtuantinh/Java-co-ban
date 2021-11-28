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
public class Xau_doi_xung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String str = in.nextLine();
            int count=0;
            int n = str.length();
            if(n%2==0){
                for (int i = 0; i < n/2; i++)
                    if (str.charAt(i) != str.charAt(n - i - 1))
                        count++;
                if (count==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else{
                for (int i = 0; i < n/2; i++)
                    if (str.charAt(i) != str.charAt(n - i - 1))
                        count++;
                if (count<=1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
