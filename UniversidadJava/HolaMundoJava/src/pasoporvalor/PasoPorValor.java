/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author DIEGO
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        x = cambioValor(x);
        
        System.out.println("x nuevo valor = "+x);
    }
    
    public static int cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        return arg1 = 15;
    }
}
