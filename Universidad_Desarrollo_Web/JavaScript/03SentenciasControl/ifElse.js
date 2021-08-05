let condicion = true;
if(condicion){
    console.log("Condición verdadera");
} else {
    console.log("Condición falsa");
}

let numero = 3;
if (numero == 1){
    console.log("Número 1");
} else if (numero == 2) {
    console.log("Número 2");
} else if (numero == 3){
    console.log("Número 3");
} else if (numero == 4){
    console.log("Número 4");
} else {
    console.log("Número desconocido");
}

let mes = 4;
let estacion;
if(mes == 1 || mes == 2 || mes == 12)
    estacion = "invierno";
else if (mes == 3 || mes == 4 || mes == 5)
    estacion = "primavera";
else if (mes == 6 || mes == 7 || mes == 8)
    estacion = "verano";
else if (mes == 9 || mes == 10 || mes == 11)
    estacion = "otoño";
else
    estacion = "Valor incorrecto";

console.log(estacion);

let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <= 11)
    mensaje = "Buenos dias";
else if (horaDia >= 12 && horaDia <= 18)
    mensaje = "Buenas tardes";
else if (horaDia >= 19 && horaDia <= 24)
    mensaje = "Buenas noches";
else if (horaDia >= 0 && horaDia < 6)
    mensaje = "Durmiendo";
else
    estacion = "Valor incorrecto";

console.log(mensaje);