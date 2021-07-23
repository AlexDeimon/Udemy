/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Concatenacion {
    public static void main(String[] args) {
        var usuario="Diego";
        var titulo="Ingeniero";
        var union=titulo+" "+usuario;
        System.out.println("union = " + union);
        
        var i=3;
        var j=4;
        System.out.println(i+j);
        System.out.println(i+j+usuario);
        System.out.println(usuario+i+j);
        System.out.println(usuario+(i+j));
    }
}
