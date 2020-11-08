/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3EqualVsDoublEqual;

/**
 *
 * @author DELL-PC
 */
public class TEst {
    public static void main(String args[])
    {
       System.out.println("\t\t\tString-Testing");
       String s1=new String("Ashvin");
       String s2=new String("Ashvin");
       System.out.println(s1==s2);       // == operator returns true if both are having same references
       System.out.println(s1.equals(s2));  // .equals() returns true if both are havng same content
       System.out.println("\t\t\tString Buffer Testing");
       StringBuffer sb1=new StringBuffer("Ashvin");
       StringBuffer sb2=new StringBuffer("Ashvin");
       System.out.println(sb1==sb2);  // == operator returns true for same reference
       System.out.println(sb1.equals(sb2));
       /*
       Here give special attention. In StringBuffer equals method will always return false for same content because originally .equls() method belongs to object which means if address is same then true
       but when String override it then changes its definition and works on content...but String Buffer doesnt change its definition
       
     */  
    }
    
}
