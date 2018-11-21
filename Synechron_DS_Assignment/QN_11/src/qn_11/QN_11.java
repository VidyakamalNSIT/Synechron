/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_11;

/**
 *
 * @author Vidyakamal
 */
import java.util.Scanner;
class QN_11 
{ 
	static int binarySearch(int arr[], int l, int r, int x) 
	{ 
		if (r>=l) 
		{ 
			int mid = l + (r - l)/2; 
			if (arr[mid] == x) 
				return mid; 
			if (arr[mid] > x) 
				return binarySearch(arr, l, mid-1, x); 
			return binarySearch(arr, mid+1, r, x); 
		} 
		return -1; 
	} 
	static int findPos(int arr[],int key)	 
	{ 
		int l = 0, h = 1; 
		int val = arr[0]; 
		while (val < key) 
		{ 
			l = h;	 
			h = 2*h;	 
			val = arr[h]; 
		}  
		return binarySearch(arr, l, h, key); 
	} 
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
        } 
        int k = sc.nextInt();
		int ans = findPos(arr,k); 
		
		if (ans==-1) 
			System.out.println("Element not found"); 
		else
			System.out.println("Element found at index " + ans); 
	} 
} 

