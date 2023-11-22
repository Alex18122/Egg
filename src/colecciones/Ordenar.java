/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 *
 * @author gbeni
 */
public class Ordenar {
    
    public static void main(String[] args) {
        //ordenar Listas
        ArrayList<Integer> num = new ArrayList();
        Collections.sort(num);
        
        //Ordenar Conjuntos
        HashSet<Integer> numSet = new HashSet();
        //se convierte a ArrayList para ordenarlo
        ArrayList<Integer> numerosLista = new ArrayList(numSet);
        Collections.sort(numerosLista);
        
        //Mapas
        HashMap<Integer,String> alumnos = new HashMap();
        //lo convertimos de HashMap a TreeMap para ordenarlo automaticamente TreeSet y TreeMap se ordenan por si mismos
        TreeMap<Integer,String> alumnosTree = new TreeMap();
        
    }
    
}
