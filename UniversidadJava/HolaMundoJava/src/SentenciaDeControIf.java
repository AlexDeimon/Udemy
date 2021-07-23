
public class SentenciaDeControIf {
    public static void main(String[] args) {
        var condicion = true;
        if(condicion){
            System.out.println("Condicion verdadera");
        }else{
            System.out.println("Condicion falsa");
        }
        
        var numero = 2;
        var numerotexto = "Desconocido";
        if(numero == 1){
            numerotexto = "Numero uno";
        }else if(numero == 2){
            numerotexto = "Numero dos";
        }else if(numero == 3){
            numerotexto = "Numero tres";
        }else if(numero == 4){
            numerotexto = "Numero cuatro";
        }else{
            numerotexto = "Numero no encontrado";
        }
        System.out.println("numerotexto = " + numerotexto);
    }
}
