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
public class Ejercicio8 {
    
    public static void main(String[] args){
    
        Scanner s = new Scanner(System.in);
        
        int a,i,j ;
        
        
        System.out.println("Ingrese el tamaño del cuadrado");
        
        a = s.nextInt();
        System.out.println("");
        
        for(i = 0; i < a ; i++){
        
            for(j = 0 ; j < a ; j++){
            
                if(i < a-1 && i > 0){
                    
                    if(j > 0 && j < a-1){
                    
                        System.out.print("  ");
                        
                    }else{
                    
                        System.out.print("* ");
                    
                    }
                
                }else{
                
                    System.out.print("* ");
                
                }
                

            }
            
            System.out.println("");
        
        }
    
    }
    
}
