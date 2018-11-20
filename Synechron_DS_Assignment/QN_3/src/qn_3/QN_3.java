/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_3;

/*
========================================================
3. Program to find the middle element of a linked list.
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
class QN_3 {
    Node head;
  private int length;

    QN_3 ()
  {
    this.length = 0;
  }

  QN_3 (int data)
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
  
  public void middle(){
      Node f_count = head;
      Node l_count = head;
      try {
      while(l_count.next!=null){
          l_count = l_count.next.next;
          f_count = f_count.next;
      }
      System.out.println("Middle element : "+f_count.data);
      }catch(NullPointerException e) {
        System.out.println("NullPointerException");
    }
  }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		QN_3 list = new QN_3();
		while(len-->0){
		    list.add(sc.nextInt());
		}
		list.middle();
	}
}