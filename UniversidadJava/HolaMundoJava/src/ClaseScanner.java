
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DIEGO
 */
public class ClaseScanner {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        
        Scanner objeto = new Scanner(System.in);
        System.out.print("Proporciona el titulo: ");
        var titulo1=objeto.nextLine();
        System.out.print("Proporciona el autor: ");
        var autor=objeto.nextLine();
        System.out.println(titulo1+" fue escrito por "+autor);
    }
}
