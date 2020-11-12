/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Z4MethodChaining;

/**
 *
 * @author DELL-PC
 */

//As most of the methods in StringBuffer/StringBuilder returns String Data Type so we can form Method Chaining

public class Test {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("Ashvin");
        System.out.println(sb.append("Srivastava").reverse().insert(1,"Ab").delete(1,3));  //Method Chaining
        
    }
    
}
