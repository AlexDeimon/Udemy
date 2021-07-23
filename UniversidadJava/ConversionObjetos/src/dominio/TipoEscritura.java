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
public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digtal");
    
    private final String descripcion;
    
    private TipoEscritura(String descipcion){
        this.descripcion = descipcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
