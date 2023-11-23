/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author gbeni
 */
public class ColleccionesDeObj {
    public static void main(String[] args) {
        
        //Listas 
        ArrayList<Libro> libros = new ArrayList();
        libros.add(new Libro());
        
        //conjuntos
        HashSet<Libro> libr = new HashSet<>();
        libr.add(new Libro());
        
        //Mapas
        HashMap<Integer, Libro> lib = new HashMap();
        lib.put(123421123, new Libro("Mistborn I"));
        
        //recorrer una colleccion de objetos
        
    }
}
