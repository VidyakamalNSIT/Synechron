/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_2;
/*
========================================================
//2. Program for nth node from the end of a Linked List
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
class QN_2 {
    Node head;
  private int length;

    QN_2 ()
  {
    this.length = 0;
  }

  QN_2 (int data)
  {
    this.head = new Node (data);
    length++;
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
  
  public void Nth_from_last(int n){
      Node f_count = head;
      Node l_count = head;
      try {
      while(n-->0){
              l_count = l_count.next;
          }
      while(l_count!=null){
          l_count = l_count.next;
          f_count = f_count.next;
      }
      System.out.println("Nth element from last: "+f_count.data);
      }catch(NullPointerException e) {
        System.out.println("LinkedList Have Less Element");
    }
  }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		QN_2 list = new QN_2();
		while(len-->0){
		    list.add(sc.nextInt());
		}
		System.out.println("Wnat Data At: ");
		list.Nth_from_last(sc.nextInt());
	}
}
