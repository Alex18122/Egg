/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author gbeni
 */
public class ColleccionesDeObj {
    public static void main(String[] args) {
        
        //Listas 
        ArrayList<Libro> libros = new ArrayList();
        libros.add(new Libro("Mistborn I"));
        libros.add(new Libro("Mistborn II"));
        
        //conjuntos
        HashSet<Libro> libr = new HashSet<>();
        libr.add(new Libro("Mistborn I"));
        libr.add(new Libro("Mistborn II"));
        
        //ejemplo de como usar comparator en un TreeSet
        TreeSet<Libro> libTree = new TreeSet<>(Libro.compNombre);
        libTree.add(new Libro("Mistborn I"));
        libTree.add(new Libro("Mistborn II"));
        
        //Mapas
        HashMap<Integer, Libro> lib = new HashMap();
        lib.put(123421123, new Libro("Mistborn I"));
        lib.put(123421124, new Libro("Mistborn II"));
        
        //recorrer una colleccion de objetos
        
        for (Libro ejem : libros) {
            
            System.out.println(ejem.toString());
            
        }
        
        //recorrer un TreeSet
        for (Libro libro : libTree) {
            
            System.out.println(libro.toString()); // ya esta ordenado con un comparator
            
        }
        
        //Usar Comparator para ordenar 
        libros.sort(Libro.compNombre);
        
        for (Libro ejem : libros) {
            
            System.out.println(ejem.toString());
            
        }
        
        //ordenar un hashSet con comparator
        ArrayList<Libro> libSet = new ArrayList<>(libr);
        libSet.sort(Libro.compNombre);
        
        // ej para ordenar TreeSet esta arriba
        
        //ordenar mapas
        
        ArrayList<Libro> libmap = new ArrayList<>(lib.values());
        
        libmap.sort(Libro.compNombre);//hacer esto no ordena la collection de tipo map a la que pertenecen los valores, solo ordena el nuevo arraylist
        
        for (Libro libro : libmap) {
            
            System.out.println(libro.getTitulo());
            
        }
        
//        for (Map.Entry<Integer, Libro> entry : lib.entrySet()) {
//            
//            System.out.println("id : " + entry.getKey() + " name : " + entry.getValue());
//            
//        }
        
        
        
    }
}
