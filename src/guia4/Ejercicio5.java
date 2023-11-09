/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4;


/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas 
por columnas (o viceversa).
 */
/**
 *
 * @author gbeni
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] traspuesta = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};
        int cont = 0;
        
        
        if (matriz[0][0] == 0 && matriz[1][1] == 0 && matriz[2][2] == 0) {

           for(int i = 0 ; i < matriz.length ; i++){
           
               for(int j = 0 ; j < matriz.length ; j++){
               
                   System.out.println("\n"+matriz[i][j]+" " + traspuesta[i][j]);
               
                   if(traspuesta[i][j] == -matriz[i][j]){
                   
                       cont++;
                   
                   }
                   
               }
           
           }

        }
        
        if(cont == 9){
        
            System.out.println("la matriz es antisimetrica");
        
        }else{
        
            System.out.println("la matriz NO es antisimetrica");
        
        }

    }

}
