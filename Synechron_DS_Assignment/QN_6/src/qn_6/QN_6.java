/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_6;

/**
 * Java program to sort an array of 0, 1 and 2 
 * @author Vidyakamal
 */

import java.util.Scanner; 

class QN_6 {  
    void Sort(int arr[], int arr_size) 
	{ 
		int lo = 0; 
		int hi = arr_size - 1; 
		int mid = 0,temp=0; 
		while (mid <= hi) 
		{ 
			switch (arr[mid]) 
			{ 
			case 0: 
			{ 
				temp = arr[lo]; 
				arr[lo] = arr[mid]; 
				arr[mid] = temp; 
				lo++; 
				mid++; 
				break; 
			} 
			case 1: 
				mid++; 
				break; 
			case 2: 
			{ 
				temp = arr[mid]; 
				arr[mid] = arr[hi]; 
				arr[hi] = temp; 
				hi--; 
				break; 
			} 
			} 
		} 
	} 
	void printArray(int arr[], int arr_size){ 
		int i; 
		for (i = 0; i < arr_size; i++) 
			System.out.print(arr[i]+" "); 
		System.out.println(""); 
	} 
	public static void main (String[] args) { 
		QN_6 obj = new QN_6(); 
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0; i<n; i++){
    	    arr[i]=sc.nextInt();
    	}
		obj.Sort(arr, n); 
		System.out.println("Array after Sorting "); 
		obj.printArray(arr, n); 
	} 
} 
