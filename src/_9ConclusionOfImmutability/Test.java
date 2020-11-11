/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _9ConclusionOfImmutability;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        String s1=new String("ABC");
        String s2=new String("AB");
        String s3=new String ("C");
        String s4=s2+s3;
        System.out.println(s1==s4); // At runtime new object is created in heap area
        
        String s5="ABC";
        final String s6="AB";
        final String s7="C";
        String s8=s6+s7;
        System.out.println(s5==s8); // At compile time value of final variable is set so s8 will resemble with s5 so its reference will be returned
        
        String s9=new String("ashvin");
        String s10=s9.toUpperCase();
        String s11=s9.toLowerCase();
        System.out.println(s9==s10);
        System.out.println(s9==s11);//It will return true even though object is present in heap area but after applying changes if content is same then same reference is returned
        
        
        String s13="    ashvin";         //s13 is different from s9 even though content is same 
        String s14=s13.trim();      
        System.out.println(s9==s14);
        
    }
}
