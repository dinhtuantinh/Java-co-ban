package javaapplication1;
import java.util.Scanner;
public class Tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t=1;t<=T;t++){
            int n = in.nextInt();
            int m = in.nextInt();
            long[][] a=new long[n+5][m+5];
            long[][] b=new long[m+5][n+5];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=in.nextInt();
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=a[j][i];
                }
            }
            long c[][]=new long[n+5][n+5];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    c[i][j]=0;
                    for(int k=0;k<m;k++){
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            System.out.print("Test "+ t +":\n");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
