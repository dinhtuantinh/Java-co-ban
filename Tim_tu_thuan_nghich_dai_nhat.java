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
public class Tim_tu_thuan_nghich_dai_nhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String ds[]=new String[1000];
        int dem[]=new int[100], n=0;
        while(in.hasNext()){
            String tmp = in.next();
            if(TN(tmp)){
                int t=tim(tmp,ds,n);
                if(t==-1){
                    ds[n]=tmp;
                    dem[n]=1;
                    n++;
                }
                else dem[t]++;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(ds[i].length()>max){
                max=ds[i].length();
            }
        }
        for(int i=0;i<n;i++){
            if(ds[i].length()==max){
                System.out.println(ds[i]+" "+dem[i]);
            }
        }
    }
    public static boolean TN(String s){
        StringBuilder rs=new StringBuilder(s);
        rs.reverse();
        return s.equals(rs.toString());
    }
    public static int tim(String s, String ds[], int n) {
        for(int i=0;i<n;i++){
            if(ds[i].equals(s)) return i;
        }
        return -1;
    }
    
}
