/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DIEGO
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[5];
        edades[0] = 12;
        System.out.println("edades 0 = " + edades[0]);
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento "+i+": "+edades[i]);
        }
        
        String frutas[] = {"Naranja","Manzana","Mandarina","Mango"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println("fruta "+i+": "+frutas[i]);
        }
        
    }
}
