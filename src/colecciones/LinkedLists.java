/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gbeni
 */
public class LinkedLists {
    
    public static void main(String[] args) {
    
        List<String> lista = new LinkedList();
        
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add(0,"Cinco"); //con el indice 0 el item se agrega al principio de la lista
        
        System.out.println("---------FOREACH---------");
        
        for (String st : lista) {
            
            System.out.println("[" + st + "]");
            
        }
    
    }
    
}
