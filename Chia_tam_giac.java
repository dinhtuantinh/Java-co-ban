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
public class Chia_tam_giac {
//    static void findPoint(int n, int h)
//    {
// 
//        // Iterate over the range [1, n - 1]
//        for (int i = 1; i < n; i++)
//            System.out.printf("%1.6f ",h*Math.sqrt((double)i/n));
//             //   ,Math.sqrt(i / (n * 1.0)) * h   
//    }
 
    // Driver code
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //in.nextLine();
        while(t-->0){
            // Given N
            int n = in.nextInt();

            // Given H
            int h = in.nextInt();
            
            // Function call
            for (int i = 1; i < n; i++)
            System.out.printf("%.6f  ",h*Math.sqrt((double)i/n));
             //   ,Math.sqrt(i / (n * 1.0)) * h   
            //findPoint(n, h);
            System.out.println();
        }
    }
}
