
public class SentenciaDeControlSwitch {
    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "desconocido";
        switch(numero){
            case 1:numeroTexto = "Numero uno";break;
            case 2:numeroTexto = "Numero dos";break;
            case 3:numeroTexto = "Numero tres";break;
            case 4:numeroTexto = "Numero cuatro";break;
            default:numeroTexto = "desconocido";break;
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
