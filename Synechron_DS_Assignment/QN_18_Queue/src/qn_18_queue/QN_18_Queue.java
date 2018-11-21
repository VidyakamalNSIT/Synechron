/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_18_queue;

/**
 *
 * @author Vidyakamal
 */
import java.util.Scanner;
public class QN_18_Queue  {
	
    int front=0,rear=-1,size=0;
    int capacity;
    int arr[];
    
    QN_18_Queue(int capacity)
    {
        this.capacity=capacity;
       
        arr=new int[capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (size == capacity){
            status = true;
        }
        return status;
    }
    public void enqueue(int data)
    {
        if(isQueueFull())
        {
            System.out.println("overflow");
        }
        else{
            rear++;
           
            arr[rear] = data;
            size++;
            
        
        }
    }
     public boolean isQueueEmpty(){
        boolean status = false;
        if (size == 0){
            status = true;
        }
        return status;
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Pop operation done, removed: "+arr[front-1]);
                front = 0;
            } else {
                System.out.println("Pop operation done, removed: "+arr[front-1]);
            }
            size--;
        }
    }
    public  void printQueue()
    {
        if(isQueueEmpty())
        {
            System.out.println("queue is empty");
        }
       else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
       
        System.out.println();
        
    }
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of queue");
        int l=sc.nextInt();
        QN_18_Queue q=new QN_18_Queue(l);
        System.out.println("enter the data into queue");
        for(int i=0;i<l;i++){
            q.enqueue(sc.nextInt());
        }
        q.printQueue();
        
    }
    
}
