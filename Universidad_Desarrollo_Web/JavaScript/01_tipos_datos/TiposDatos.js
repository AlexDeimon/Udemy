/*
Ejemplos de tipos de datos
*/
//String
var nombre = "Diego";
console.log(nombre);

nombre = 10;
console.log(typeof nombre);

//númerico
var numero = 1000;
console.log(numero);

//object
var objeto = {
    nombre: "Diego",
    apellido: "Sandoval",
    edad: 21
}
console.log(objeto)

//boolean
var bandera = true;
console.log(bandera);
var bandera = false;
console.log(bandera);

//tipo de dato funcion
function mifuncion(){}
console.log(mifuncion);

//symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//tipo clase es una funcion
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//undefined
var x;
console.log(x);
x = undefined;
console.log(typeof x);

//null = ausencia de valor
var y = null;
console.log(y);
console.log(typeof y);

//arrays
var autos = ['BMW','Audi','Volvo'];
console.log(autos);
console.log(typeof autos); //object

//empty string
var z = '';
console.log(z);
console.log(typeof z); //string