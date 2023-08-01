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
public class EstructurasDeControl {
    
    public static void main (String [] args){
        
        int cont = 0;  
        
        Scanner s = new Scanner(System.in);
        int a = 2;
        
        if(a == 1){
            
            System.out.println("a = 1");
        
        }else if(a == 2){
        
            System.out.println("a != 1");
        
        }else{
        
            System.out.println("a = 0");
        
        }
        
        
        
        switch(a) {

            case 1 :
                System.out.println("a = 1");
                
                break;
            
            case 2 : 
                
                System.out.println("a = 2");
                
                break;
                
            case 3 : 
                System.out.println("a = 3");
                
                break;
            default :
                
                System.out.println("a = 0");
                 
        }
        
        while(a != 0){
            
            System.out.println("asd");
            cont++;
            
            if(cont == 2){
            
                System.out.println(cont);
            
                continue;
            }else if (cont == 5){
            
                break;
            }
        
            if(cont == 6 ){
            
                a = 0;
                
            }
        
        }
        
        do{
        
            System.out.println("asdasd");
            a = 2;
                    
        }while(a == 0);
        
        
        for(a = 0 ; a < 10; a++){
            
            System.out.println("nashe" + a);
        
        }
        
        
    }

}
