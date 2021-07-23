/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

/**
 *
 * @author DIEGO
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Diego", 'm', 21, "Calle 25");
        System.out.println("cliente1 = " + cliente1);
    }
}
