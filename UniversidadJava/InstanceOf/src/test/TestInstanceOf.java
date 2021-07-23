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
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego",5000);
//        System.out.println("empleado1 = "+empleado1.obtenerDetalles());
        determinarTipo(empleado1);

        empleado1 = new Gerente("Alejandro", 10000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        determinarTipo(empleado1);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("Departamento = "+gerente.getDepartamento());
        }else if(empleado instanceof Empleado){
            System.out.println("es de tipo Empleado");
            System.out.println("Nombre = "+empleado.getNombre());
        }else if(empleado instanceof Object){
            System.out.println("es de tipo Object");
        }
    }
}
