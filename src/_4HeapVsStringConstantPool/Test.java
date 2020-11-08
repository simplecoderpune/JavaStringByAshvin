/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4HeapVsStringConstantPool;

/**
 *
 * @author DELL-PC
 */
public class Test {
    
   public static void main(String args[])
   {
       String s1=new String("ABC");
       String s2=new String("ABC");
       System.out.println(s1==s2);     //s1 and s2 two new objects are created using new keyword hence thier reference/address is different hence it will return false 
       
       String s3="ABC";
       System.out.println(s1==s3);        //Yes it will also return false as s3 is pointing to SCP where ABC object is already present
       String s4="ABC";
       System.out.println(s3==s4);  //true as s4 will also point to same object
       
       String s5="AB"+"C";
       System.out.println(s4==s5); //true as content is same so both variables will point to same content in SCP
       
       
       String s6="AB";
       String s7=s6+"C";
       System.out.println(s4==s7);
       
        final String s8="AB";
       String s9=s8+"C";
       System.out.println(s4==s9);
       
   }
    
}
