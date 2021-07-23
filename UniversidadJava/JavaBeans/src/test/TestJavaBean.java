/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.PersonaBean;

/**
 *
 * @author DIEGO
 */
public class TestJavaBean {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Diego");
        persona.setApellido("Sandoval");
        
        System.out.println("persona = " + persona);
        System.out.println("Nombre = " + persona.getNombre());
        System.out.println("Apellido = " + persona.getApellido());
    }
}
