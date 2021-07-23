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
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];
        personas[0] = new Persona("Diego");
        personas[1] = new Persona("Nicoll");
        personas[2] = new Persona("Camilo");
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("persona "+i+": "+personas[i]);
        }
    }
}
