/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author DIEGO
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = Aritmetica.division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo operacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un error:");
            //e.printStackTrace(System.out); //imprime la pila de excepciones en la consola
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso la division");
        }
        System.out.println("resultado = " + resultado);
    }
}
