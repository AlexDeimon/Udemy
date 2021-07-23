/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mundopc.*;

/**
 *
 * @author DIEGO
 */
public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, ratonHP, tecladoHP);
        
        Monitor monitorGamer = new Monitor("Gamer",34);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, ratonGamer, tecladoGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
