/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _8trim;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        String s="   Lucknow   ";
        if(s.equalsIgnoreCase("Reached Lucknow"))
        {
            System.out.println("Lucknow");
        }
        else
        {
            System.out.println("Not Reached Lucknow");
        }
        String s1="  lucknow  ";
        String s2=s1.trim();
        if(s2.equalsIgnoreCase("lucknow"))
        {
            System.out.println("Reached Lucknow");
        }
    }
}
