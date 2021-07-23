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
public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoescritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoescritura;
    }
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipo Escritura: "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura +'}' + "" + super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
    
}
