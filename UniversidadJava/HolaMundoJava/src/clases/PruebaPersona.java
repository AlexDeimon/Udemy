/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DIEGO
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Diego";
        persona1.apellido = "Sandoval";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Juan";
        persona2.apellido = "Fernández";
        persona2.desplegarInformacion();
        
        System.out.println("persona1 = " + persona1);//direccion de memoria
        System.out.println("persona2 = " + persona2);
    }
}
