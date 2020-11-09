/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _6StringMethod;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        //**********************isEmpty()**************************************//
        String s=new String();
        System.out.println(s.isEmpty());
        
        String s1=new String("Ashvin");
        System.out.println(s1.isEmpty());
        //Checks if String is Empty or not
        //********************************************************************//
        
        //*********************length()**************************************//
        String s2="Raj is angry";
        System.out.println(s2.length());
        //length() returns the size of String
        //******************************************************************//
        
        //********replace(old,new)*****************************************//
        String s3="abcdefg";
        String s4=s3.replace('a','b');
        System.out.println(s4);
        String s5="Ashvin Srivastava";
        String s6=s5.replace("As","Ds");
        System.out.println(s6);
        // Replcaes old String with new string
        //***************************************************************//
        
        //******************* substring(int begin) substring(int begin,int end) ***********************//
        
        String s7="Ashvin Srivastava";
        String s8=s7.substring(2);
        String s9=s7.substring(3,6);
        System.out.println(s8);
        System.out.println(s9);
        
        
    }
            
}
