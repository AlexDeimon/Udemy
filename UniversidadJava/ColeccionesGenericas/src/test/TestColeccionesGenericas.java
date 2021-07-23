/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author DIEGO
 */
public class TestColeccionesGenericas {
    public static void main(String[] args) {
        //List: ordenado y se pueden duplicar elementos
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        String elemento = miLista.get(0);
        //System.out.println("elemento = " + elemento);
        
        //System.out.println("Lista: ");//se imprimr en orden de agregacion
        //imprimir(miLista);
        
        //Set Desordenado pero no se pueden duplicar elementos
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        //System.out.println("\nSet: ");//NO se imprimr en orden de agregacion pero es más rapido
        //imprimir(miSet);
        
        //Map Clave valor
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Diego");
        miMapa.put("Valor2", "Alejandro");
        miMapa.put("Valor3", "Alex");
        miMapa.put("Valor3", "Alexander"); //se sobreescribe
        
        String elementoMapa = miMapa.get("Valor1"); //se debe hacer conversion porq get regresa Object
        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());//Set de las claves
        imprimir(miMapa.values());//Valores
        
    }
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento -> { //funcion lamda o flecha
            System.out.println("elemento = " + elemento);
        });
    }
}
