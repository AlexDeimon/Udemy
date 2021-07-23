/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas.presentacion;

import java.util.Scanner;
import peliculas.logica.*;

/**
 *
 * @author DIEGO
 */
public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        Scanner objeto1 = new Scanner(System.in);
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        do{
            System.out.println("ELIJE UNA OPCION: \n"
                    + "1. Iniciar Catalogo de peliculas \n"
                    + "2. Agregar pelicula \n"
                    + "3. Listar peliculas \n"
                    + "4. Buscar pelicula \n"
                    + "0. Salir");
            opcion = Integer.parseInt(objeto1.nextLine());
            switch(opcion){
                case 1:catalogo.iniciarCatalogo();break;
                case 2:System.out.println("Introduce en nombre de la pelicula: ");
                    var nombrepelicula = objeto1.nextLine();
                    catalogo.agregarPelicula(nombrepelicula);break;
                case 3:catalogo.listarPeliculas();break;
                case 4:System.out.println("Nombre pelicula: ");
                    var buscar = objeto1.nextLine();
                    catalogo.buscarPelicula(buscar);break;
                case 0: System.out.println("Gracias!");break;
                default: System.out.println("Opcion invalida");break;
            }
        }while(opcion != 0);
    }
}
