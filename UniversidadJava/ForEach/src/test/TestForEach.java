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
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,7,8,9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Diego"), new Persona("Alejandro"),new Persona("Alex")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
