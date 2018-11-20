/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_19;
import java.util.Scanner;

class QN_19 { 
    static void spiralPrint(int m, int n, int a[][]){ 
        int i, k = 0, l = 0; 
        while (k < m && l < n){ 
            for (i = l; i < n; ++i){ 
                    System.out.print(a[k][i]+" "); 
            } 
            k++; 
            for (i = k; i < m; ++i){ 
                    System.out.print(a[i][n-1]+" "); 
            } 
            n--; 
            if ( k < m){ 
                for (i = n-1; i >= l; --i){ 
                        System.out.print(a[m-1][i]+" "); 
                } 
                m--; 
            } 
            if (l < n){ 
                for (i = m-1; i >= k; --i){ 
                        System.out.print(a[i][l]+" "); 
                } 
                l++;	 
            }		 
        } 
    } 
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); 
        int C = sc.nextInt(); 
        int[][] arr = new int[3][6];
        for(int i=0;i<R;i++){
            for(int j=0; j<C; j++)
                arr[i][j] = sc.nextInt();
        }
        spiralPrint(R,C,arr); 
    } 
} 
