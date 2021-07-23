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
        Persona persona1 = new Persona("Diego", 5000, false);
        System.out.println("persona1: " + persona1);
//        System.out.println("Persona1 nombre: "+ persona1.getNombre());
        persona1.setNombre("Alejandro");
//        System.out.println("Persona1 nombre: "+ persona1.getNombre());
//        System.out.println("Persona1 sueldo: "+ persona1.getSueldo());
//        System.out.println("Persona1 eliminado: "+ persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());
    }
}
