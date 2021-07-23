/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author DIEGO
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override //sobreescritura de metodo de la clase padre
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: "+this.departamento;
    }
}
