/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_5;

/**
 * Find third largest number in array without sorting in java
 * @author Vidyakamal
 */
import java.util.Scanner;
class QN_5 { 
    
    void thirdLargest(int arr[],int size) { 
	if (size < 3) { 
		System.out.printf(" Invalid Input "); 
		return; 
	}  
	int first = arr[0]; 
	for (int i = 1; i < size ; i++) 
		if (arr[i] > first) 
			first = arr[i]; 
	int second = Integer.MIN_VALUE; 
	for (int i = 0; 
			i < size ; i++) 
		if (arr[i] > second && 
			arr[i] < first) 
			second = arr[i]; 
	int third = Integer.MIN_VALUE; 
	for (int i = 0;i < size ; i++) 
		if (arr[i] > third && arr[i] < second) 
			third = arr[i]; 
	System.out.printf("Third Largest " + 
				"element "+ third); 
} 
public static void main(String []args) 
{ 
	QN_5 obj = new QN_5(); 
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr = new int[n];
	for(int i=0; i<n; i++){
	    arr[i]=sc.nextInt();
	}
	obj.thirdLargest(arr, n); 
} 
} 

