/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.Comparator;

/**
 *
 * @author gbeni
 */
class Libro {

    private String titulo;

    public Libro() {
    }

    public Libro(String titulo) {

        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + '}';
    }
    
    public static Comparator<Libro> compNombre = new Comparator<Libro> (){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o2.getTitulo().compareTo(o1.getTitulo()); 
        }
    };
    
}
