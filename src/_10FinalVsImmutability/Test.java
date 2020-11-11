/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _ZFinalVsImmutability;

/**
 *
 * @author DELL-PC
 */
public class Test {
   public static void main(String args[])
   {
       final StringBuffer sb1=new StringBuffer("ashvin");
       System.out.println(sb1);
       sb1.append(" srivastava");
       System.out.println(sb1); //Final variable is unchangale then also we can append because 
                                //Final variable can't be assigned again
       //  sb1=new StringBuffer("Madhav"); This is not allowed as final variable can't be assigned again
       
   }
}
