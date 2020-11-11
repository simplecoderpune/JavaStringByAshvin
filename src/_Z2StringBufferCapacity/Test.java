/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Z2StringBufferCapacity;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer(100);  //Suppose we want to store string with 100 characters so no need to go from 16-->34-->70-->142------ //We can Declare sb with initial capacity 100
        sb.append("Ashvin"); 
        System.out.println(sb.capacity());
        
        StringBuffer sb1=new StringBuffer("Ashvin");
        System.out.println(sb1.capacity());    // Guess here  what will be the capacity so in this case formula is (s.length()+16) so 22 will be answer
    }
}
