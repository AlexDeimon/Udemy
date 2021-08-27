function miFuncion(){
    console.log('funcion 1')
}
function miFuncion2(){
    console.log('funcion 2')
}
miFuncion();
miFuncion2();

//funciones callback
let imp = function imprimir(mensaje){
    console.log(mensaje);
}

function sumar(op1, op2, funcioncallback){
    let res = op1 + op2;
    funcioncallback(`Resultado: ${res}`);
}

sumar(4,4,imp)

//llamadas asincronas con funcion settimeout
function miFuncionCallBack(){
    console.log('Saludo asincrono despues de 3 segundos');
}
setTimeout(miFuncionCallBack,3000);
setTimeout( function(){console.log('saludo asincrono 2')}, 4000);
setTimeout( () => console.log('Saludo asincrono 3'), 1000);

//funcion setinterval
let relog = () => {
    let fecha = new Date();
    console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}
setInterval(relog,1000);