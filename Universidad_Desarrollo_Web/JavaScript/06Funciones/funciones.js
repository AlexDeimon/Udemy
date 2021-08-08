miFuncion(5, 4);
//el hoisting hace que la definicion de la funcion se haga al inicio del código

//declaración
function miFuncion(a, b){
    console.log(arguments.length); //numero de argumentos
    return a + b;
}

//llamar
let resultado = miFuncion(5, 4);
console.log(resultado);

//funciones de tipo expresion
let sumar = function (a, b){
    return a + b;
}; //TERMINA EN ;

resultado = sumar(7,6);
console.log(resultado);

//funciones self invoking: funciones que se mandan llamar a si mismas pero no se pueden llamar mas
(function (a, b){
    console.log("Ejecutando la funcion: "+ (a + b));
})(8, 2);

//funciones como objetos
console.log(typeof miFuncion);

var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto);

//funciones flecha (arrow)
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(7, 6);
console.log(resultado);

//parámetros y argumentos
sumar = function (a = 4, b = 5)/*valores por defecto*/{
    console.log(arguments[0]); //3
    console.log(arguments[1]); //6
    console.log(arguments[2]); //7
    return a + b + arguments[2];
}

resultado = sumar(3, 6, 7);
console.log(resultado);

//sumar todos los argumentos
let result = sumarTodo(8, 2, 2, 1, 7);
console.log(result);

function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++) {
        suma += arguments[i];
    }
    return suma;
}

//paso por valor
//valores primitivos
let x = 10;
function cambiarValor(a){
    a = 20;
}
cambiarValor(x);
console.log(x); //sigue siendo 10

//paso por referencia
//referencia a un objeto
const persona = {
    nombre: 'Diego',
    apellido: 'Sandoval'
}

function cambiarValorObjeto(p1){
    p1.nombre = 'Alex';
    p1.apellido = 'Deimon';
}
console.log(persona);
cambiarValorObjeto(persona);
console.log(persona);