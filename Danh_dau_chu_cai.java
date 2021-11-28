/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Danh_dau_chu_cai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(i<s1.length()-1) s2+=(s1.charAt(i)+" ");
            else s2+=s1.charAt(i);
        }
        String [] arr=s2.split("\\s+");
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String x: arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        int dem=0;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
                dem++;
        }
        System.out.println(dem);
    }
    
}
