package qn_10;
/*
QN 10. Find first non-repeating character in a String.
*/

import java.util.*;
public class QN_10{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    LinkedHashMap<Character,Integer> HM = new LinkedHashMap<>();
    System.out.println("Enter String");
    String str = sc.nextLine();
    for (char c : str.toCharArray()) {
        HM.put(c, HM.containsKey(c) ? HM.get(c) + 1 : 1); 
    }
    boolean flag = true;
    for (Map.Entry<Character,Integer> entry : HM.entrySet()) {
        if (entry.getValue() == 1) {
            System.out.println("first non-repeating character in a String: "+entry.getKey());
            flag = false;
            break;
        } 
    }
    if(flag){
        System.out.println("No Such charcter present in String");
    }
  }
}

