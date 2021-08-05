//aritmeticos
let a = 6, b = 4;
let z = a + b;
console.log("Resultado de la suma: "+z);

z = a - b;
console.log("Resultado de la resta: "+z);

z = a * b;
console.log("Resultado de la multiplicación: "+z);

z = a / b;
console.log("Resultado de la división: "+z);

z = a % b;
console.log("Resultado del modulo(residuo): "+z);

z = a ** b;
console.log("Resultado del exponente: "+z);

//incremento
//preincremento
z = ++a;
console.log(a);
console.log(z);

//postincremento
z = b++;
console.log(b);
console.log(z);

//decremento
//predecremento
z = --a;
console.log(a);
console.log(z);

//postdecremento
z = b--;
console.log(b);
console.log(z);

//procedencia de operadores
let c = 3, d = 2, e = 1, g = 4;

let f = c * d + e / g;
console.log(f);

f = e + c * d / g;
console.log(f);

f = (e + c) * d / e;
console.log(f);

//operadores de asignación
let h = 1;

h += 3; //h = h + 3
console.log(h);

h -= 1;
console.log(h);

h *= 4;
console.log(h);

h /= 8;
console.log(h);

//operadores de comparación
let i = 3, j = 2, k = "3";

let l = i==k; //revisa el valor sin importar el tipo
console.log(l);

l = i===k; //revisa si los tipos y los valores son iguales
console.log(l);

l = i != k;
console.log(l);

l = i != j;
console.log(l);

l = i!==k; //revisa si los valores y los tipos son diferentes
console.log(l);

//operadores relacionaes
l = i < j;
console.log(l);

l = i <= j;
console.log(l);

l = i > j;
console.log(l);

l = i >= j;
console.log(l);

//operadores logicos
//and
let m = 15;
let valMin = 0, valMax = 10;

if (m >= valMin && m <= valMax){
    console.log("Dentro de rango");
} else {
    console.log("Fuera de rango");
}

//or
let vacaciones = true, diaDescanso = false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego del hijo");
} else {
    console.log("El padre está ocupado");
}

//operador ternario
let resultado = (3 > 2) ? "verdadero" : "falso";
console.log(resultado);

let numero = 9;
resultado = (numero % 2 == 0) ? "Número par" : "Número impar";
console.log(resultado);

