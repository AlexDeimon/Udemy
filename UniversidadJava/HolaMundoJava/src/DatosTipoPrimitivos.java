/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class DatosTipoPrimitivos {
    public static void main(String[] args) {
        //numericos:
        //byte numeroByte=129;
        byte numeroByte=(byte)129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte "+Byte.MIN_VALUE);
        System.out.println("Valor maximo byte "+Byte.MAX_VALUE);
        
        //short numeroShort=32768;
        short numeroShort=(short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo Short "+Short.MIN_VALUE);
        System.out.println("Valor maximo Short "+Short.MAX_VALUE);
        
        int numeroin=(int)21474843647L;//L long
        int numeroInt=(int)32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo Int "+Integer.MIN_VALUE);
        System.out.println("Valor maximo Int "+Integer.MAX_VALUE);
        
        long numeroLong=10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo Long "+Long.MIN_VALUE);
        System.out.println("Valor maximo Long "+Long.MAX_VALUE);
        
        float numerofloat=10.0F;
        System.out.println("numerofloat = " + numerofloat);
        System.out.println("Valor minimo Float "+Float.MIN_VALUE);
        System.out.println("Valor maximo Float "+Float.MAX_VALUE);
        
        double numerodouble=10;
        System.out.println("numerodouble = " + numerodouble);
        System.out.println("Valor minimo Double "+Double.MIN_VALUE);
        System.out.println("Valor maximo Double "+Double.MAX_VALUE);
        
        var numeroEntero=10;
        System.out.println("numeroEntero = " + numeroEntero);
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        var numeroFloat=10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        
        //caracteres
        char miCaracter='a';
        System.out.println("miCaracter = " + miCaracter);
        //caracteres unicode:
        char varchar='\u0021';
        System.out.println("varchar = " + varchar);
        char varCharDecimal=33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varcharSimbolo='!';
        System.out.println("varcharSimbolo = " + varcharSimbolo);
        
        var varchar1='\u0021';
        System.out.println("varchar1 = " + varchar1);
        var varCharDecimal2= (char) 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        var varcharSimbolo3='!';
        System.out.println("varcharSimbolo3 = " + varcharSimbolo3);
        //ASCII
        int variableEnteraSimbolo='!'; 
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        int letra='A';
        System.out.println("letra = " + letra);
        //booleanos
        boolean varBoolean=true;
        System.out.println("varBoolean = " + varBoolean);
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad=10;
        //var esAdulto = ;
        if(edad>=18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
    }
}
