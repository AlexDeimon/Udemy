/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author DIEGO
 */
public class PersonaBean implements Serializable{
    //deben ser atributo privados
    private String nombre;
    private String apellido;
    
    //debe tener un constructor vacio
    public PersonaBean(){
    }

    public PersonaBean(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellido = apellidos;
    }
    
    //deben tener getters and setters encaplsulate de los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{ " + "nombre = " + nombre + ", apellido = " + apellido + '}';
    }
    
    
    
}
