let numero = "10";
console.log(typeof numero);

let edad = Number(numero);
console.log(typeof edad);
console.log(edad); //NaN Not a Number

if (isNaN(edad)){
    console.log("No es un numero");
}else{
    if (edad >= 18){
        console.log("La persona es mayor de edad");
    } else {
        console.log("La persona es menor de edad");
    }
}

let resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
console.log(resultado);