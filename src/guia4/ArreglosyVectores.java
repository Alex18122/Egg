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
        int[] vector = {1, 2};
        // se inicializa por defecto con el valor 0 para los enteros
        //vector = new int[3];
        // se le da un tamaño

        //int[][] matriz = new int [2][3];
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}};
        //otra forma para inicializar y dar valor a los arreglos
        //int a[] = {1,2,3};
        //int b[][] = {{1,2},{3,4}}; 
        // System.out.println(a[0]);

        /* System.out.println("Ingrese los valores para el vector de tamaño " + vector.length);
        
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
         */
        //for mejorado
        // for(tipo elemento: arreglo)
        int[] producto = new int[3];

        int sum;
        //mismas reglas que para multiplicar matrices en algebra.
        for (int j = 0; j < matriz[0].length; j++) {

            sum = 0;
            for (int i = 0; i < vector.length; i++) {

                sum += vector[i] * matriz[i][j];

            }
            producto[j] = sum;
        }

        String aux = "";
        System.out.println("\n* vector");

        for (int elem : vector) {

            aux = aux + " " + elem;

        }

        System.out.println(aux);

        System.out.println("\n* Matriz");

        for (int[] fila : matriz) {

            aux = "";

            for (int elem : fila) {

                aux += " " + elem;

            }

            System.out.println(aux);

        }

        aux = "";
        System.out.println("\n vector*matriz");

        for (int elem : producto) {

            aux += " " + elem;

        }

        System.out.println(aux);

    }

    public static int[][] rellenarMatriz(int[][] a) {
        
        
        System.out.println("rellenando matriz");
        
        for(int i = 0; i < a.length; i++) {


            for (int j = 0; j < a[0].length; j++) {

                a[i][j] = (int) (Math.random() * 10);

            }
            
        }
        
        return a;

    }

}
