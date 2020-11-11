/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Z1StringBufferCapacity;

/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());     //Initial Capacity of every StringBuffer is 16 initially.....
        sb.append("AshvinSrivastava");   // 16 characters added
        System.out.println(sb.capacity());  //Capacity is 16 still
        
        //**************Now we are adding 17th Character******************//
        
        sb.append("s");  //A new StringBufferObject will be created with larger capacity and all the contents will be copied there and reference is returned to same variable
        System.out.println(sb.capacity()); //Now Capacity=34 (CurrentCapacity+1)*2 => (16+1)*2=34 
        sb.append("asasasasasasasasasasasasasasasasasasasass");
        System.out.println(sb.capacity());// Now capacity is 70 as(34+1)*2
        
    }
}
