//declarar
let carros = new Array('BMW','Mercedes Benz','Volvo'); //declaración antigua
const autos = ['BMW','Mercedes Benz','Volvo'];
console.log(autos);

//acceder a los elementos
console.log(autos[0]);
console.log(autos[2]);

for (let i = 0; i < autos.length; i++) {
    console.log(i + ': '+autos[i]);
}

autos.forEach(auto => {
    console.log(auto);
});

//modificar
autos[1] = 'Ferrari';
console.log(autos[1]);

//agregar elementos
autos.push('Audi');
console.log(autos);

console.log(autos.length);
autos[autos.length] = 'Cadillac'
console.log(autos);

autos[6] = 'Porshe';
console.log(autos);
// No es recomendable

//preguntar si es un array
console.log(typeof autos);
console.log(Array.isArray(autos));
console.log(autos instanceof Array);

