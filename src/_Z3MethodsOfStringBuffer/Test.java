/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Z3MethodsOfStringBuffer;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Ashvin");
        System.out.println(sb.length());  // length of StringBuffer
        System.out.println(sb.capacity()); //Capacity of StringBuffer
        
        sb.setCharAt(1, 'b');  //Set 'b' at index 1
        
        System.out.println(sb);
        
        
         //Append method is overloaded with all the data types
        sb.append(3.14);
        sb.append(true);
        sb.append("Ashvin");
        sb.append(2250);
        
          System.out.println(sb);
          
          StringBuffer sb1=new StringBuffer("Srivastava");
          sb1.insert(1, "RAJ");
          sb1.insert(1, 28);
          sb1.insert(1, 5.14);
          System.out.println(sb1);
          
          System.out.println(sb1.delete(1, 3)); //deletes two character from 1 to 2 index
          
          StringBuffer sb3=new StringBuffer("Sashtri");
          System.out.println(sb3.reverse());
    }
    
}
