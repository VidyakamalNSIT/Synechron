/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_13;

/**
 *
 * @author Vidyakamal
 */
import java.util.Scanner;
class QN_13 { 
	void Sort(int arr[], int n){ 
		int count = 0;
		for (int i = 0; i < n; i++) { 
			if (arr[i] == 0) 
				count++; 
		} 
		for (int i = 0; i < count; i++) 
			arr[i] = 0; 
		for (int i = count; i < n; i++) 
			arr[i] = 1; 
	} void print(int arr[], int n) 
	{ 
		System.out.print("Array after segregation is "); 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " ");	 
	} 
	public static void main(String[] args) 
	{ 
		QN_13 obj = new QN_13(); 
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++){
    	    arr[i]=sc.nextInt();
    	}
		obj.Sort(arr, n); 
		System.out.println("Array after Sorting "); 
		obj.print(arr, n); 
	} 
} 
