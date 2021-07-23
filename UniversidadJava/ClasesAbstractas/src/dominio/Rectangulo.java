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
public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("se imprime un: " + this.getClass().getSimpleName());//get class: tipo clase. getsimplename: nombre de la clase
    }
}
