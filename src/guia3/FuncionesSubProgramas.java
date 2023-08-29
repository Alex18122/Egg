/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *
 * @author gbeni
 */
public class FuncionesSubProgramas {

    public static void main(String[] args) {

        Hola("Gabriel");//lo que hay entre parentesis van a ser los datos que se envian, tienen que coincidir con los tipos de datos que admite la funcion

        System.out.println(Suma(3,2));
        
    }

    public static void Hola(String a) { //lo que esta dentro del parentesis va a ser el tipo de dato que recibe 
        // void significa que no devuelve ningun valor puede ser reemplazado por int,char, etc
        // por ahora todas las funciones van a ser public y static(no tiene necesidad de ser instanciado por un objeto, se encuentra de forma estatica dentro de la memoria.) )
        // todas las funciones tienen un nombre como ahora "Hola"
        System.out.println("Hola, " + a );

    }

    public static int Suma(int a, int b) {

        int resultado = a + b;

        return resultado;

    }

}
