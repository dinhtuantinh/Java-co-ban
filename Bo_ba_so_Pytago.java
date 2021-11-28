/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.util.Arrays;
import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bo_ba_so_Pytago {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[100005];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            if(check(a,n)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static int check(int a[], int n) {
        for(int i=0;i<n;i++) a[i]=a[i]*a[i];
        Arrays.sort(a);
        for(int i=n-1;i>=2;i--){
            int l=0;
            int r=i-1;
            while(l<r){
                if(a[l]+a[r]==a[i])
                    return 1;
                else if(a[l]+a[r]<a[i])
                    l++;
                else
                    r--;
            }
        }
        return 0;
    }
    
}