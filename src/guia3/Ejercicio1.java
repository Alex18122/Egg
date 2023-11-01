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
public class Ejercicio1 {
    
    public static void main (String[] args){
    
        int a, b;
        int cont = 1;
        int menu;
        String yn ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para la operacion");
        
        System.out.print("num 1 : ");
        
        a = s.nextInt();
        
        System.out.print("num 2 : ");
        
        b = s.nextInt();
        
        
        System.out.println("--------------------------------------------------");
        
        do{
            
            System.out.println("Elija la operacion que desea realizar");
            System.out.println("");
            System.out.println("[1].Suma");
            System.out.println("[2].Resta");
            System.out.println("[3].Multiplicacion");
            System.out.println("[4].Division");
            System.out.println("");
            
            menu = s.nextInt();
            
            switch(menu){
            
                case 1 :
                    
                    Suma(a,b);
                    
                    break;
                    
                case 2 :
                    
                    Resta(a,b);
                    
                    break;
                    
                case 3 :
                    
                    Multi(a,b);
                    
                    break;
                    
                case 4 :
                    
                    Div(a,b);
                    
                    break;
                    
                default :
                    
                    System.out.println("Opcion incorrecta");
             
            }
            
            System.out.println("Desea continuar? Y/N");
            
            yn = s.next();
            
            if((yn.toUpperCase()).equals("N")){
                
                break;
            
            }
        
        }while(cont == 1);
    
    }
    
    public static void Suma(int a,int b){
    
        System.out.println("Resultado : " + (a+b));
    
    }
    
    public static void Resta(int a,int b){
   
        System.out.println("Resultado : " + (a-b));
    
    }
    public static void Multi(int a,int b){
   
        System.out.println("Resultado : " + (a*b));
    
    }
    
    public static void Div(int a,int b){
        
        double c = a/b ;
  
        System.out.println("Resultado : " + (c));
    
    }
    
    
}
