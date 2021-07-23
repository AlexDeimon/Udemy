/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author DIEGO
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Diego";
        persona1.apellido = "Sandoval";
        System.out.println("persona1.nombre = " + persona1.nombre);
        System.out.println("persona1.apellido = " + persona1.apellido);
        
        persona1 = cambiaValor(persona1);
        System.out.println("persona1.nombre = " + persona1.nombre);
        System.out.println("persona1.apellido = " + persona1.apellido);
    }
    public static Persona cambiaValor(Persona persona){
        persona.nombre = "Jose";
        persona.apellido = "Fernández";
        return persona;
    }
}
