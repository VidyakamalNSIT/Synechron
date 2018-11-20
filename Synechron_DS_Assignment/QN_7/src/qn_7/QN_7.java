/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_7;

/*
========================================================
7. Reverse a linked list.
========================================================
*/
import java.util.*;
class Node
{
  int data;
  Node next;
    Node (int data)
  {
    this.data = data;
    this.next = null;
  }
}
class QN_7 {
    Node head;
  private int length;

    QN_7 ()
  {
    this.length = 0;
  }
  public void add (int data)
  {
    Node node = new Node (data);
    if (head == null)
      {
	head = node;
	length++;
      }
    else
      {
	Node temp = head;
	while (temp.next != null)
	  temp = temp.next;
	temp.next = node;
	length++;
      }
  }
  
public void reverse(){
    Node prev = null; 
    Node current = head; 
    Node next = null; 
    while (current != null) { 
        next = current.next; 
        current.next = prev; 
        prev = current; 
        current = next; 
    }
    head = prev;
}
void print(){
    Node current = head;
    while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
    }
}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		QN_7 list = new QN_7();
		while(len-->0){
		    list.add(sc.nextInt());
		}
		list.reverse();
		list.print();
	}
}