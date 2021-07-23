/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;
import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][3];
        
        Scanner objeto1 = new Scanner(System.in);
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                edades[i][j] = objeto1.nextInt();
            }
        }
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades "+ i +", "+ j+ ": "+ edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresas","Moras"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("fruta "+ i +", "+ j+ ": "+ frutas[i][j]);
            }
        }
        imprimir(frutas);
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Diego");
        personas[0][1] = new Persona("Alejandro");
        imprimir(personas);
    }
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz "+ i +", "+ j+ ": "+ matriz[i][j]);
            }
        }
    }
}
