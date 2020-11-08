/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1String;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        String s=new String("Ashvin");   // New String object will be created with content "Ashvin" which is immutable we can't change it
        s.concat("Software");   //Here also a new Object created with "Ashvin Software" and there is no reference hence this object will pass to Garbage Collector 
        System.out.println(s); // Ashvin will be printed only
        String d=s.concat("Srivastava"); // Here new object will be created with content as Srivastava
        System.out.println(d);
    }
}
