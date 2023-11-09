/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4;

import static java.lang.Math.floor;
import java.util.Scanner;
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

/**
 *
 * @author gbeni
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        double aux;
        
        System.out.println("Ingrese el tamaño del vector : ");

        n = s.nextInt();
        
        int[] vector = new int[n];
        
        System.out.println("Ingrese los valores en el vector");
        
        for(int i = 0 ; i < vector.length ; i++){
        
            System.out.print("\n V[" + i + "] = ");
            
            vector[i] = s.nextInt();
            
            aux = vector[i]/10;
            
            if(aux < 1){
            
                cont1++;
            
            }else if(aux < 10 && aux >= 1){
            
                cont2++;
            
            }else if(aux < 100 && aux >= 10){
            
                cont3++;
            
            }else if(aux < 1000 && aux >= 100){
            
                cont4++;
                
            }else if(aux <10000 && aux >= 1000){
            
                cont5++;
            
            }
        
        }
        
        
        System.out.println("cantidad de numeros segun su cantidad de cifras");
        
        System.out.println("1 cifra :" + cont1);
        System.out.println("2 cifra :" + cont2);
        System.out.println("3 cifra :" + cont3);
        System.out.println("4 cifra :" + cont4);
        System.out.println("5 cifra :" + cont5);

    }

}
