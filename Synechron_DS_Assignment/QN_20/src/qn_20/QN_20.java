/*

 */
package qn_20;

import java.util.Scanner;
class QN_20{ 
    void search(int[][] mat, int n, int x) { 
		int i = 0, j = n-1;
		while ( i < n && j >= 0 ) 
		{ 
			if ( mat[i][j] == x ) 
			{ 
				System.out.print("n Found at "+ i + " " + j); 
				return; 
			} 
			if ( mat[i][j] > x ) 
				j--; 
			else 
				i++; 
		} 
		
		System.out.print("n Element not found"); 
		
	} 
		public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(); 
        int C = sc.nextInt(); 
        int[][] arr = new int[3][6];
        for(int i=0;i<R;i++){
            for(int j=0; j<C; j++)
                arr[i][j] = sc.nextInt();
        }
        int k = sc.nextInt();
        QN_20 q = new QN_20();
        q.search(arr,C,k);
	} 
}
