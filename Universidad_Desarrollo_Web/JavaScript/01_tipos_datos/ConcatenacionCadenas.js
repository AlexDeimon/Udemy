var nombre = 'Diego';
var apellido = 'Sandoval';
var nombreCompleto = nombre +' '+ apellido;
console.log(nombreCompleto)

var nombreCompleto2 = 'Diego'+' '+'Sandoval';
console.log(nombreCompleto2);

var x = nombre + 5 + 3;
console.log(x); //Diego53

x = nombre + (5 + 3);
console.log(x); //Diego8

x = 5 + 3 + nombre;
console.log(x); //8Diego