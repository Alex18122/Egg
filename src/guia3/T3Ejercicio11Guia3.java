/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;
/**
 *
 * @author gbeni
 */
public class T3Ejercicio11Guia3 {
    
    public static void main (String[] args){
    
        Scanner s = new Scanner(System.in);
        String a ;
        String b ;
        
        System.out.println("Ingrese un texto : ");
        
        a = s.nextLine();
        
        System.out.println(a);
        
        System.out.println("");
        
        b = CambioDeChar(a);
        
        System.out.println(b);
        
    }
    
    public static String CambioDeChar(String a){
        
        a = a.replace("a","@");
        a = a.replace("e","#");
        a = a.replace("i","$");
        a = a.replace("o","%");
        a = a.replace("u","*");
        a = a.replace("A","@");
        a = a.replace("E","#");
        a = a.replace("I","$");
        a = a.replace("O","%");
        a = a.replace("U","*");
        
        return a;
    
    }
    
}
