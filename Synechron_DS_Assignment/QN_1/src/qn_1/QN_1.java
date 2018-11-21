/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_1;

import java.util.Scanner;

/*
========================================================
Design a stack that supports getMin() in O(1) time and O(1) auxiliary space.
========================================================
*/
class Stack_min 
{ 
	Stack<Integer> s; 
	Integer minValue; 

	Stack_min() { s = new Stack<Integer>(); } 

	void getMin() 
	{ 
		if (s.isEmpty()) 
			System.out.println("Stack is empty"); 
		else
			System.out.println("Minimum Element  " + minValue); 
	} 
	void peek() 
	{ 
		if (s.isEmpty()) 
		{ 
			System.out.println("Stack is empty "); 
			return; 
		} 

		Integer temp = s.peek(); 
		System.out.print("Top Element: "); 
 
		if (temp < minValue) 
			System.out.println(minValue); 
		else
			System.out.println(temp); 
	} 

	void pop() 
	{ 
		if (s.isEmpty()) 
		{ 
			System.out.println("Stack is empty"); 
			return; 
		} 

		System.out.print("Removed: "); 
		Integer temp = s.pop(); 
		if (temp < minValue) 
		{ 
			System.out.println(minValue); 
			minValue = 2*minValue - temp; 
		} 

		else
			System.out.println(temp); 
	} 

	void push(Integer x) 
	{ 
		if (s.isEmpty()) 
		{ 
			minValue = x; 
			s.push(x); 
			System.out.println("Inserted: " + x); 
			return; 
		} 
		if (x < minValue) 
		{ 
			s.push(2*x - minValue); 
			minValue = x; 
		} 

		else
			s.push(x); 

		System.out.println("Inserted: " + x); 
	} 
}; 

public class QN_1 
{ 
	public static void main(String[] args) 
	{ 
		Stack_min s = new Stack_min(); 
		s.push(3); 
		s.push(5); 
		s.getMin(); 
		s.push(2); 
		s.push(1); 
		s.push(8); 
		s.getMin(); 
		s.pop(); 
		s.getMin();
		s.pop(); 
		s.getMin(); 
		s.pop(); 
		s.getMin(); 
		s.pop(); 
		s.getMin(); 
	} 
} 

