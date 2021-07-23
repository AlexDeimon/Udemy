/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author DIEGO
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
//        Aritmetica aritmetica1 = new Aritmetica();
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//        
//        int resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado desde la clase de prueba = " + resultado);
//        
//        resultado = aritmetica1.sumarConArgumentos(8, 5);
//        System.out.println("resultado usando argumentos = " + resultado);
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica a: "+ aritmetica1.a);
        System.out.println("aritmetica b: "+ aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(9,3);
        System.out.println("aritmetica2 a: "+ aritmetica2.a);
        System.out.println("aritmetica2 b: "+ aritmetica2.b);
    }
}
