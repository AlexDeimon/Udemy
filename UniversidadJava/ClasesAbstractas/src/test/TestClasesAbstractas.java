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
public class TestClasesAbstractas {
    public static void main(String[] args) {
        //las clases abstr no pueden instanciarse en objetos
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
