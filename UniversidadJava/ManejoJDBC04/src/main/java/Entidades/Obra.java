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
public class Obra {
    private int idObra;
    private String nombreObra;
    private String tipoObra;
    private int costoObra;
    private int idExp;

    public Obra() {
    }

    public Obra(int idObra) {
        this.idObra = idObra;
    }

    public Obra(String nombreObra, String tipoObra, int costoObra, int idExp) {
        this.nombreObra = nombreObra;
        this.tipoObra = tipoObra;
        this.costoObra = costoObra;
        this.idExp = idExp;
    }
    
    public Obra(int idObra, String nombreObra, String tipoObra, int costoObra, int idExp) {
        this.idObra = idObra;
        this.nombreObra = nombreObra;
        this.tipoObra = tipoObra;
        this.costoObra = costoObra;
        this.idExp = idExp;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public int getCostoObra() {
        return costoObra;
    }

    public void setCostoObra(int costoObra) {
        this.costoObra = costoObra;
    }

    public int getIdExp() {
        return idExp;
    }

    public void setIdExp(int idExp) {
        this.idExp = idExp;
    }

    @Override
    public String toString() {
        return "Obra{ " + "idObra = " + idObra + ", nombreObra = " + nombreObra + ", tipoObra = " + tipoObra + ", costoObra = " + costoObra + ", idExp = " + idExp + '}';
    }
    
    
}
