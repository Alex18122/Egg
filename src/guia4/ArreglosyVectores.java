/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;
import java.util.Scanner;
/**
 *
 * @author gbeni
 */
public class ArreglosyVectores {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //int i ;
        // para inicializar un arreglo
        int[] vector;
        // se inicializa por defecto con el valor 0 para los enteros
        vector = new int[3];
        // se le da un tamaño
        
        int[][] Matriz = new int [2][3];
        
        //otra forma para inicializar y dar valor a los arreglos
        int a[]= {1,2,3};
        
        // System.out.println(a[0]);
        
        System.out.println("Ingrese los valores para el vector de tamaño " + vector.length);
        
        for(int i = 0 ; i < vector.length ;i++ ){
        
            System.out.print("v[" + i + "] = ");
            vector[i] = s.nextInt();
            
        }
        
        System.out.print("v[3] ={");
        
        for(int i = 0 ; i < vector.length ;i++ ){
        
            System.out.print(vector[i]);
            
            if(i < 2){
            
                System.out.print(",");
            
            }
        
        }
        
        System.out.print("} ");
        System.out.println("");

    }

}
