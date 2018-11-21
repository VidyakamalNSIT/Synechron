/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qn_8;

/**
 *
 * @author Vidyakamal
 */
import java.util.Scanner;
public class QN_8 {
    int len;
    int[] arr;
    int start;
    int end;
    QN_8(int len){
        this.len = len;
        arr = new int[len];
        this.start = -1;
        this.end = len;
    }
    
    void push_1(int data){
        if(start<end-1){
            start++;
            arr[start] = data;
        }
        else{ 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        }
    }
    
    void push_2(int data){
        if(start<end-1){
            end--;
            arr[end] = data;
        }
        else{ 
            System.out.println("Stack Overflow"); 
            System.exit(1); 
        }
    }
    
    int pop_1() 
    { 
        if (start >= 0) 
        { 
            int x = arr[start]; 
            start--; 
            return x; 
        } 
        else
        { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
        } 
        return 0; 
    }
    
    int pop_2(){
        if(end < len) 
        { 
            int x =arr[end]; 
            end++; 
            return x; 
        } 
        else
        { 
            System.out.println("Stack Underflow"); 
            System.exit(1); 
  
        } 
        return 0; 
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Max Length: ");
        int len = sc.nextInt();
        int c=1;
        QN_8 obj = new QN_8(len);
        do{
            System.out.println("Select Stack: 1 or 2");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Pop=1 or push=2");
                int ch2= sc.nextInt();
                if(ch2==1)
                System.out.println(obj.pop_1());
                else
                obj.push_1(sc.nextInt());
            }
            else{
                System.out.println("Pop=1 or push=2");
                int ch3= sc.nextInt();
                if(ch3==1)
                System.out.println(obj.pop_2());
                else
                obj.push_2(sc.nextInt());
            }
            System.out.println("Do you want to cont...... press 1 else 0");
            c =sc.nextInt();
        }while (c==1) ;
    }
}
