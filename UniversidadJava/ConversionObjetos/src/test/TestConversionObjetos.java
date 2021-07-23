/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.*;

/**
 *
 * @author DIEGO
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego",50);
        Empleado empleado2 = new Escritor("Alejandro", 500, TipoEscritura.CLASICO);
        System.out.println("empleado2 = " + empleado2);
        System.out.println(empleado2.obtenerDetalles());
        
        //downcasting tipo padre a hija
        ((Escritor)empleado2).getTipoEscritura();
        Escritor escritor = (Escritor) empleado2;
        escritor.getTipoEscritura();
        
        //upcasting hija a padre
        Empleado empleado3 = escritor;
        System.out.println(empleado3.obtenerDetalles());
    }
}
