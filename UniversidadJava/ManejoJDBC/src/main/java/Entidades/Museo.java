/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author DIEGO
 */
public class Museo {
    private int idMuseo;
    private String nombreMuseo;

    public Museo() {
    }

    public Museo(int idMuseo) {
        this.idMuseo = idMuseo;
    }

    public Museo(int idMuseo, String nombreMuseo) {
        this.idMuseo = idMuseo;
        this.nombreMuseo = nombreMuseo;
    }

    public int getIdMuseo() {
        return idMuseo;
    }

    public void setIdMuseo(int idMuseo) {
        this.idMuseo = idMuseo;
    }

    public String getNombreMuseo() {
        return nombreMuseo;
    }

    public void setNombreMuseo(String nombreMuseo) {
        this.nombreMuseo = nombreMuseo;
    }

    @Override
    public String toString() {
        return "Museo{ " + "idMuseo = " + idMuseo + ", nombreMuseo = " + nombreMuseo + '}';
    }
    
    
    
}
