/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_9;

/**
 *
 * @author Vidyakamal
 */

import java.util.*;
class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
class QN_9 {
    static Node head;
    private int length;
    QN_9 (){
        this.length = 0;
    }

    QN_9 (int data){
        this.head = new Node (data);
        length++;
    }
    public void add (int data){
        Node node = new Node (data);
        if (head == null){
        	head = node;
        	length++;
        }
        else{
        	Node temp = head;
        	while (temp.next != null)
        	temp = temp.next;
        	temp.next = node;
        	length++;
        }
    }

    String check(){
        Node temp = head;
        Stack<Integer> St = new Stack<>();
        while(temp!=null){
            St.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data != St.pop()){
                return "NOT palindrome";
                
            }
            temp = temp.next;
        }
        return "palindrome";
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		QN_9 list = new QN_9();
		while(len-->0){
		    list.add(sc.nextInt());
		}
		System.out.println(list.check());
	}
}
