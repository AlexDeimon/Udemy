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
public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego",5000);
//        System.out.println("empleado1 = "+empleado1.obtenerDetalles());
        imprimir(empleado1);

        empleado1 = new Gerente("Alejandro", 10000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(empleado1);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
