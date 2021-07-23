/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Empleado;

/**
 *
 * @author DIEGO
 */
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego",50);
        Empleado empleado2 = new Empleado("Diego",40);
        
        if(empleado1 == empleado2){
            System.out.println("Misma referencia memoria");
        }else{
            System.out.println("Distinta referencia memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Son iguales en contenido");
        }else{
            System.out.println("son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor de hashcode es igual");
        }else{
            System.out.println("el valor hashcode es distinto");
        }
    }
}
