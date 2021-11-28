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
public class Liet_ke_to_hop_2 {
    private int i,n,k,a[],stop=0;
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        do{
            this.n = in.nextInt();
            this.k = in.nextInt();
        }while(this.n < 0 || this.k > this.n);
        a = new int[n+1];
        for (int j = 1; j <= this.k; j++)
            a[j] = j;
    }
    public void Xuat() {
        for (int j = 1; j <= k; j++)
            System.out.print(a[j]);
        System.out.print(" ");
    }
    public void sinhToHop() {
        int dem=0;
        do {
            Xuat();
            dem++;
          this.i = this.k;
          while (this.i > 0 && a[i] == this.n -this.k + i) -- i;
          if (this.i > 0) {
              a[i]++;
              for (int j = i + 1; j <= this.k; j++) {
                  a[j] = a[j-1] + 1;
              }
          }
          
        } while (this.i != 0);
        System.out.println("\nTong cong co "+dem+" to hop");
    }
    public static void main(String[] args) {
        Liet_ke_to_hop_2 tohop = new Liet_ke_to_hop_2();
        tohop.Nhap();
        tohop.sinhToHop();
        System.gc();
    }
}
