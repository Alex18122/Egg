/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;
import java.util.Scanner;
/**
 *
 * @author gbeni
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
    
        String a ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escriba una frase o palabra ");
        
        a = s.nextLine();
        
        if(a.substring(0, 1).equals("A")){
        
            System.out.println("Correcto");
            
        }else{
        
            System.out.println("Incorrecto");
        
        }
    
    
    }
    
    
}
