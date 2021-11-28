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
public class Dao_tu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s=in.nextLine();
            String res="";
            s+=" ";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    String tmp = new StringBuilder(res).reverse().toString();
                    System.out.print(tmp+" ");
                    res="";
                }
                else{
                    res+=s.charAt(i);
                }
            }
            System.out.println();
        }
    }
    
}
