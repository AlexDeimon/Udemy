/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;

/**
 *
 * @author DIEGO
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Diego");
        Persona persona2 = new Persona("Alejandro");
        
        imprimir(persona1);
        imprimir(persona2);
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
