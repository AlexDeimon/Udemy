/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import ventas.*;
/**
 *
 * @author DIEGO
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Audifonos", 15000);
        Producto producto2 = new Producto("Celular", 800000);
        Producto producto3 = new Producto("Computador", 1000000);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
    }
}
