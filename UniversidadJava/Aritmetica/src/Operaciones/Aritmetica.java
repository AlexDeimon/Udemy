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
public class Aritmetica {
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Constructor");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor con argumentos");
    }
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        //return a + b;
        return this.sumarConRetorno();
    }
}
