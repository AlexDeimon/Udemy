/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author DIEGO
 */
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha llehado a la cantidad maxima de productos");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        double totalOrden = this.calcularTotal();
        System.out.println("id Orden: "+ this.idOrden+ "\nTotal de la orden: $"+totalOrden+"\nProductos: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(" "+this.productos[i]);
        }
    }
}
