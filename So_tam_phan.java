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
public class So_tam_phan {

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
            int check=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'){
                    continue;
                }
                else{
                    check=0;
                    break;
                }
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
