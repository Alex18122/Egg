/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gbeni
 */
public class EjemploArrayList {

    public static void main(String[] args) {

        //Arrays
        String[] nombresArray = new String[5];
        ArrayList<ArrayList<String>> matriz = new ArrayList(); //asi se representa una matriz con arraylists
        

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
        
//        List<String> nombres = new ArrayList();
//        nombres.add("Lola");
//        nombres.add("Lalo");
//        nombres.add("Lilo");
//        //iterator es un patron que se implemento para recorrer distintos tipos de datos
//        Iterator<String> it = nombres.iterator();
//        
//        while(it.hasNext()) {
//        
//            String aux = it.next();
//            if (aux.equals("Lola")){
//                
//                it.remove();
//            
//            }
//            
//        }
        
//        nombres.forEach((e) -> System.out.println(e));
        
        
        
        
        

//        for (String aux : nombres) {
//
//            if (aux.equals("Lola")) {
//
//                nombres.remove(aux);
//
//           } //no puedo eliminar elementos con un forEach porque se rompe la iteracion
//
//        }
//        for (int i = 0; i < nombres.size(); i++) {
//
//            String m = nombres.get(i);
//            if (m.equals("Lola")) {
//
//                nombres.remove(m);
//
//            }
//
//        }
//        nombres.forEach((e) -> System.out.println(e)); // investigar forEach
//        
//       nombres.stream().count(); // investigar Stream()
//
//        System.out.println(nombres.toString());
        
    }

}

