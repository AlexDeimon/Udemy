/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Ciclos {
    public static void main(String[] args) {
//        //while
//        var contador = 0;
//        while(contador < 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//        // do while
//        var contador = 0;
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        }while(contador < 3);
        // for
//        for( var contador = 0; contador < 3; contador++){
//            System.out.println("contador = " + contador);
//        }
        //break
//        for( var contador = 0; contador < 3; contador++){
//            if(contador % 2 == 0){
//                System.out.println("contador = " + contador);
//                //break;
//            }
//        }
        //continue
        for( var contador = 0; contador < 3; contador++){
            if(contador % 2 != 0){
                continue;  
            }
            System.out.println("contador = " + contador);
        }
    }
}
