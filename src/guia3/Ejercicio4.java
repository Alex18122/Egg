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
public class Ejercicio4 {
    
    public static void main(String[] args){
    
        Scanner s = new Scanner(System.in);
        int a;
        
        System.out.println("Ingrese un numero");
        
        a = s.nextInt();
        
        System.out.println("--------------------------------");
        
        PrimoOno(a);
        
    }
    
    public static void PrimoOno(int a){
        
        int i;
        int div = 0;
        
        for(i = 1 ; i <= a ; i ++){
        
            if((a % i) == 0){
            
               div ++; 
            
            }
            
        }
        
        if(div == 2){
        
            System.out.println("El numero es primo");
        
        }else{
        
            System.out.println("El numero NO es primo");
        
        }
      
    }
    
}
