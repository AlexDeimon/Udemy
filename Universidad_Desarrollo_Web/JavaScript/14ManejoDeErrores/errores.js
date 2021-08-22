'use strict'
// x = 10;
// console.log('continuamos...') //no imprime debido al error de arriba
try {
    x = 10;
} catch (error) {
    console.log(error); //[ReferenceError: x is not defined]
}

console.log('continuamos...') //se ejecuta correctamente

try {
    mifuncion();
} catch (error) {
    console.log(error); //[ReferenceError: mifuncion is not defined]
} finally{
    console.log('Siempre me ejecuto, haya error o no');
}

console.log('continuamos...') //se ejecuta correctamente