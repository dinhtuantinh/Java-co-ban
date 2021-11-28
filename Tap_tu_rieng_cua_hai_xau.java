/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s1=in.nextLine();
            String s2=in.nextLine();
            s2+=' ';
            String res="";
            for(int i=0;i<s2.length();i++){
                if(s2.charAt(i)==' '){
                    res+=' ';
                    s1=s1.replace(res,"");
                    res="";
                }
                else{
                    res+=s2.charAt(i);
                }
            }
            String [] arr=s1.split("\\s+");
            Map<String,Integer> map=new HashMap<String,Integer>();
            for(String x: arr){
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }else{
                    map.put(x,1);
                }
            }
            for(Map.Entry<String,Integer> entry: map.entrySet()){
                System.out.print(entry.getKey()+" ");
            }
            System.out.println();
        }
    }
}
