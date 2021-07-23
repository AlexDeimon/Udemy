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
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /*Clases envolventes tipos primitivos*/
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        Integer entero = 10;//Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2 = entero;//Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
