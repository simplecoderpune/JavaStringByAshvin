/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7StringSomeMoreMethod;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        //**************** indexOf() ****************************//
        String s="AshaRam";
        System.out.println(s.indexOf('a'));
        String s1="AshaRam";
        System.out.println(s1.indexOf('z'));
        //prints index of first occurrence if not present then -1 is returned
        //*******************************************************//
        
        //**************** lastIndexOf() ****************************//
        String s2="AshaRam";
        System.out.println(s2.lastIndexOf('a'));
        String s3="AshaRam";
        System.out.println(s3.lastIndexOf('z'));
        //prints index of last occurrence if not present then -1 is returned
        //*******************************************************//
        
        //************toUpperCase() **********  toLowerCase() ************//
        String s4="AshfgbVBC";
        String s5=s4.toLowerCase();
        System.out.println(s5);
        String s6="AshfgbVBC";
        String s7=s6.toUpperCase();
        System.out.println(s7);
        // tolowercase() converts the word to all small letter
        //**************************************************************//       
    }
}
