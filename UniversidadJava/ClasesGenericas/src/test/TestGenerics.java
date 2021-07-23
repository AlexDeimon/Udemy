/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author DIEGO
 */
public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(7);//clases envolventes, no se puede primitivos
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Hola mundo");
        objetoString.obtenerTipo();
    }
}
