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
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("Diego", 8, 9, 10);
    }
    
    private static void imprimirNumeros(int... numeros){//argumentos variables
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero: "+numeros[i]);
        }
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: "+nombre);
        imprimirNumeros(numeros);   
    }
}
