/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _5StringConstructors;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        
      String s1=new String();
      String s2=new String("Ashvin");
      StringBuffer sb1=new StringBuffer("Ashvin");
      String s3=new String(sb1); 
      StringBuilder sb2=new StringBuilder("Ashvin");
      String s4=new String(sb2);

      char ch[]={'j','a','v','a'};
      String s5=new String(ch);
      System.out.println(s5);
    }
}
