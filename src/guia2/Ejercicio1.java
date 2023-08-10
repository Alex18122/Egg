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
public class Ejercicio1 {
    
    public static void main(String[] args){
    
        int a ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        
        a = s.nextInt();
        
        if(a%2 == 0){
        
            System.out.println("su numero es par");
        
        }else{
        
            System.out.println("su numero es impar");
            
        }
        
    }
    
}
