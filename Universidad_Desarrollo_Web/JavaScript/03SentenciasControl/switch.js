let numero = 5;

let numeroTexto;

switch(numero){
    case 1: numeroTexto = "numero uno";break;
    case 2: numeroTexto = "numero dos";break;
    case 3: numeroTexto = "numero tres";break;
    case 4: numeroTexto = "numero cuatro";break;
    case 5: numeroTexto = "numero cinco";break;
    default: numeroTexto = "Valor desconocido";break;
}
console.log(numeroTexto);

let mes = 4;
let estacion;

switch(mes){
    case 1: case 2: case 12: estacion = "Invierno";break;
    case 3: case 4: case 5: estacion = "Primavera";break;
    case 6: case 7: case 8: estacion = "Verano";break;
    case 9: case 10: case 11: estacion = "Otoño";break;
    default: estacion = "Estación desconocida";
}
console.log(estacion);