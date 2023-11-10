/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4;

import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9
 */
/**
 *
 * @author gbeni
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        //usar contadores
        String aux;
        int[][] matriz = new int[3][3];

        Scanner s = new Scanner(System.in);

        System.out.println("ingrese los valores de la matriz");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print("\nM[" + i + "]" + "[" + j + "]" + " = ");
                matriz[i][j] = s.nextInt();

            }
        }
        
        for (int[] fila : matriz) {

            aux = "";

            for (int elem : fila) {

                aux += "  " + elem;

            }

            System.out.println(aux);

        }

        int contFila = 0;
        int contelem = 0;
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;

        int columna1 = 0;
        int columna2 = 0;
        int columna3 = 0;

        int diagonalP = 0;

        for (int[] fila : matriz) {
            
            contelem = 0;

            for (int elem : fila) {

                if (contelem == contFila) {

                    diagonalP += elem;

                }

                switch (contFila) {

                    case 0:

                        fila1 += elem;

                        break;

                    case 1:

                        fila2 += elem;

                        break;

                    case 2:

                        fila3 += elem;

                        break;

                    default:

                        break;
                }
                
                
                 switch (contelem) {

                    case 0:

                        columna1 += elem;

                        break;

                    case 1:

                        columna2 += elem;

                        break;

                    case 2:

                        columna3 += elem;

                        break;

                    default:

                        break;
                }

                contelem++;

            }

            contFila++;

        }
        
        System.out.println("suma de los elementos por filas, columnas y diagonal principal");
        
        System.out.println(columna1);
        System.out.println(columna2);
        System.out.println(columna3);

        System.out.println(fila1);
        System.out.println(fila2);
        System.out.println(fila3);

        System.out.println(diagonalP);
        
        
        
        for (int[] fila : matriz) {

            aux = "";

            for (int elem : fila) {

                aux += "  " + elem;

            }

            System.out.println(aux);

        }

    }

}
