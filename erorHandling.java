/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Error;

/**
 *
 * @author 62823
 */

public class erorHandling {
    public static void main(String[] args) {
       
        try{
            int a = 5;
            int b = a/0;
        }catch(ArithmeticException err) {
            System.out.println("Terdapat eror : "+err);
        }
        
        try{
            Integer nilai = null;
            nilai.toString();
        }catch(NullPointerException err){
            System.out.println("Terdapat eror : "+err);
        }
        
        try{
            String s="abc";  
            int i=Integer.parseInt(s);
        }catch(NumberFormatException err){
            System.out.println("Terdapat eror : "+err);
        }
        
        try{
            int a[]=new int[5];  
            a[10]=50;
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Terdapat eror : "+err);
        }
    } 
}
