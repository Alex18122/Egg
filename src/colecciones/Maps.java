/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author gbeni
 */
public class Maps {
    
    public static void main(String[] args) {
        
        HashMap<Integer,String> personas = new HashMap<>();
        HashSet<String> hashsetprueba = new HashSet<>();
        
        hashsetprueba.add("hola");
        hashsetprueba.add("hola2");
        hashsetprueba.add("hola3");
        
        personas.put(44438086,"Gabriel Benincasa");
        
        //con Entry
        
        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            
            System.out.println("DNI : " + entry.getKey() + "\nNombre : " + entry.getValue());
            
        }
        
        // Sin Entry
        
        for (Integer dni : personas.keySet()) {
            
            System.out.println("DNI : " + dni);
            
        }
        
        for (String nombre : personas.values()) {
            
            System.out.println("Nombre : " + nombre);
            
        }
        
        for (String string : hashsetprueba) {
            
            System.out.println(string);
        }
        
        
    }
    
}
