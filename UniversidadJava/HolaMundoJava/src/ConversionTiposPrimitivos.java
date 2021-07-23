import java.util.Scanner;
public class ConversionTiposPrimitivos {
    public static void main(String[] args) {
        //String a int
        var edad=Integer.parseInt("20");
        System.out.println("edad = " + (edad+1));
        //String a double
        var valorPI= Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        //pedir valor
        var consola=new Scanner(System.in);
        System.out.print("Digite su edad: ");
        edad=Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        //Int a String
        var edadTexto=String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        //String a char
        var caracter="Hola".charAt(0);
        System.out.println("caracter = " + caracter);
        //consola
        System.out.println("Digite un caracter");
        caracter=consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
