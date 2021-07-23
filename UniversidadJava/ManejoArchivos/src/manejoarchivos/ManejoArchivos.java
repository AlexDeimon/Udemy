/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.*;

/**
 *
 * @author DIEGO
 */
public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo); //espacio de memoria para el objeto
        try {
            PrintWriter salida = new PrintWriter(archivo);//crear el archivo
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); //espacio de memoria para el objeto
        try {
            PrintWriter salida = new PrintWriter(archivo);//crear el archivo
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void agregarAlArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); //espacio de memoria para el objeto
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//anexar info ala archivo
            
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha agregado contenido al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void leerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo); //espacio de memoria para el objeto
        try {
            var entrada = new BufferedReader(new FileReader(archivo));//leer lineas del archivo
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
