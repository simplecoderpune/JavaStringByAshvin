/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2StringBuffer;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Ashvin");
        sb.append("Srivastava"); // No New object is created because here object is changable
        System.out.println(sb);
    }
}
