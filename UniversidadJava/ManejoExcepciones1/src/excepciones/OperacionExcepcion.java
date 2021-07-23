/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author DIEGO
 */
public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion(String mensaje){
        super(mensaje);//se propaga a la clase padre Exception
    }
}
