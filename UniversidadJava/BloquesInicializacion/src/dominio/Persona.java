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
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //se mandan a llamar antes del constructor
    //B.I estaticos. solo se ejecuta la primera vez q se carga la clase
    static{
        System.out.println("Ejeccion B.I.estatico");
        ++Persona.contadorPersona;
    }
    
    //B.I No estatico. se ejecuta cada vez q se cree un nuevo objeto
    {
        System.out.println("Ejecucion B.I.No estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecuccion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{ " + "idPersona = " + idPersona + '}';
    }
    
    
}
