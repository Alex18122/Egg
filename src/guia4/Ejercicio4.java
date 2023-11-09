/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4;


/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
/**
 *
 * @author gbeni
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = (int) (Math.random() * 10);
                traspuesta[j][i] = matriz[i][j];
            }

        }

        String aux;

        System.out.println("\n-Matriz");

        for (int[] fila : matriz) {

            aux = "";

            for (int elem : fila) {

                aux += "  " + elem;

            }

            System.out.println(aux);

        }

        System.out.println("\n-Traspuesta");

        for (int[] fila : traspuesta) {

            aux = "";

            for (int elem : fila) {

                aux += "  " + elem;

            }

            System.out.println(aux);

        }

    }
}
