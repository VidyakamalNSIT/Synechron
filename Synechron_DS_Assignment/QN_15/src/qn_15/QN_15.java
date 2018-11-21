/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_15;

/**
 *
 * @author Vidyakamal
 */
import java.util.Scanner;

public class QN_15 {
	int maxSubArraySum(int a[], int size) { 
		int max_so_far = a[0]; 
		int curr_max = a[0];
	
		for (int i = 1; i < size; i++){ 
			curr_max = Math.max(a[i], curr_max+a[i]); 
			max_so_far = Math.max(max_so_far, curr_max); 
		} 
		return max_so_far; 
	} 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n ];
		
		QN_15 q = new QN_15();
		int max_sum = q.maxSubArraySum(a, n); 
		System.out.println("Maximum contiguous sum is "+ max_sum); 
	} 
} 

