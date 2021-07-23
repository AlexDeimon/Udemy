/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author DIEGO
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola mundo desde Java");
        escribirArchivo(nombreArchivo, "Hola mundo desde Java 2");//se sobreescribe el archivo
        agregarAlArchivo(nombreArchivo, "Hola mundo desde Java 3");
        leerArchivo(nombreArchivo);
    }
}
