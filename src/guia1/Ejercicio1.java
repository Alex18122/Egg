/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;
import java.util.Scanner;

/**
 *
 * @author gbeni
 */
public class Ejercicio1 {
    
    public static void main(String[] args){
    
        int a,b ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        System.out.println("numero 1 : ");
        a = s.nextInt();
        System.out.println("numero 2 : ");
        b = s.nextInt();
        
        System.out.println("la suma de los dos numeros es igual a " + (a+b));
        
        
    }
    
}
