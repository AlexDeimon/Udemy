/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author DIEGO
 */
public class TestEnum {
    public static void main(String[] args) {
//        System.out.println("Dia 1: "+Dias.LUNES);
//        indicarDiasSemana(Dias.LUNES);
        System.out.println("Continente 4: "+Continentes.AMERICA);
        System.out.println("Paises en el 4to continente: "+Continentes.AMERICA.getPaises());
        System.out.println("Habitantes en el 4to continente: "+Continentes.AMERICA.getHabitantes());
        
    }
    
    private static void indicarDiasSemana(Dias dias){
        switch(dias){
            case LUNES: System.out.println("Primer dia de la semana");break;
            case MARTES:System.out.println("Segundo dia de la semana");break;
            case MIERCOLES:System.out.println("Tercer dia de la semana");break;
            case JUEVES:System.out.println("Cuarto dia de la semana");break;
            case VIERNES:System.out.println("Quinto dia de la semana");break;
            case SABADO:System.out.println("Sexto dia de la semana");break;
            case DOMINGO:System.out.println("Ultimo dia de la semana");break;
            default: System.out.println("No es un dia de la semana");
        }
    }
}
