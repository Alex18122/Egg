/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author gbeni
 */
public class EjemploArrayList {

    public static void main(String[] args) {

        //Arrays
        String[] nombresArray = new String[5];

        for (int i = 0; i < nombresArray.length; i++) {

            nombresArray[i] = "kali " + (i + 1);

        }

//        for (String var : nombresArray) {
//
//            System.out.println(var);
//
//        }

        //collecciones
        //no hace falta indicar el tamaño, se va a grandando mientras se le agregan objetos.
        ArrayList<String> nombresArrayList = new ArrayList(); //en mascotapp hay mas ejemplos 

        for (int i = 0; i < 10; i++) {

            nombresArrayList.add("Kali " + (i + 1));

        }

        System.out.println(nombresArrayList.size());

        nombresArrayList.remove(2);

        System.out.println(nombresArrayList);

        System.out.println(nombresArrayList.size());

        List<String> akalist = new ArrayList(Arrays.asList(nombresArray)); //toma un array y lo vuelve un arraylist
        
        List<String> akalist2 = new ArrayList();
        
        akalist2.addAll(akalist); //agrega una arraylist a otro arraylist, se le puede poner indice para que rellene desde ese punto
        
    }

}
