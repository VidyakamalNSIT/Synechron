/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_4;

/*
========================================================
4. Program to detect and remove a loop in the linked list.
========================================================
*/
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
class QN_4 {
    static Node head;
    private int length;
    QN_4 (){
        this.length = 0;
    }

    QN_4 (int data){
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
    void DetectLoop() { 
		Node slow= head; 
		Node fast= head;
		boolean flag = true;
		while (slow != null && fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next; 
			if (slow == fast) { 
			    System.out.println("\nLoop Presnt And after removing the linkedList Is:");
				removeLoop(slow); 
				flag = false;
			} 
		} 
		if(flag)
		System.out.println("No Loop");
	} 
	void removeLoop(Node loop) { 
		Node fast = null, slow = null; 
		fast = head; 
		while (1 == 1) { 
			slow = loop; 
			while (slow.next != loop && slow.next != fast) { 
				slow = slow.next; 
			} 
			if (slow.next == fast) { 
				break; 
			} 
			fast = fast.next; 
		} 
		slow.next = null; 
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
		QN_4 list1 = new QN_4();
		while(len-->0){
		    list1.add(sc.nextInt());
		}
		list1.DetectLoop();
		list1.print();
	// Condition Input for Loop
	    GFG list = new GFG(); 
        list.head = new Node(50); 
        list.head.next = new Node(20); 
        list.head.next.next = new Node(15); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(10); 
  
        // Creating a loop for testing  
        head.next.next.next.next.next = head.next.next.next;
        list.DetectLoop();
		list.print();
	}
}
