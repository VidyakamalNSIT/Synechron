
package qn_18;

import java.util.Scanner;

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
class LinkedList
{
  Node head;
  private int length;

    LinkedList ()
  {
    this.length = 0;
  }

  LinkedList (int data)
  {
    this.head = new Node (data);
    length++;
  }

  public int getLength ()
  {
    return length;
  }

  public Node getHead ()
  {
    return head;
  }

  void insertAtBigin (int data)
  {
    Node NewNode = new Node (data);
    if (length == 0)
      {
	head = NewNode;
	length++;
	return;
      }
    NewNode.next = head;
    head = NewNode;
    length++;
  }

  public void PrintList ()
  {
    Node temp = this.head;
    while (temp != null)
      {
	System.out.print (temp.data + " ");
	temp = temp.next;
      }
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

  public String ToString ()
  {
    String result = "[";
    if (head == null)
      return result + "]";
    result += head.data;
    Node Temp = head.next;
    while (Temp != null)
      {
	result += "," + Temp.data;
	Temp = Temp.next;
      }
    return result + "]";
  }

  void insetAt (int p, int data)
  {
    Node NewNode = new Node (data);
    Node preNode = head;
    if (p == 0)
      {
	NewNode.next = head;
	head = NewNode;
	length++;
	return;
      }
    for (int i = 1; i < p; i++)
      {
	preNode = preNode.next;
      }
    NewNode.next = preNode.next;
    preNode.next = NewNode;
    length++;
  }
  void deletAtEnd(){
        Node preNode=head,Temp=head;
        while(Temp.next != null){
            preNode=Temp;
            Temp=Temp.next;
        }
        preNode.next=null;
        length--;
    }
void deletAtBeging(){
        if(length==0){
            System.out.print("Empty List");
        }
        else{
        head = head.next;
        length--;
        }
    }
    void deletAt(int p){
    Node preNode=head,Temp=head;
        while(p >= 0){
            preNode=Temp;
            Temp=Temp.next;
            p--;
        }
        preNode.next=null;
        length--;
    }
}

public class QN_18_LinkedList {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
      LinkedList list = new LinkedList (12);
      list.add (4);
      list.add (6);
      list.add (10);
      list.add (8);
      list.PrintList();
      System.out.println ("ToString: "+list.ToString ());
      System.out.println ("length: "+list.getLength ());
      list.deletAtBeging();
      System.out.println ("ToString: "+list.ToString ());
      System.out.println ("length: "+list.getLength ());
    }
    
}
