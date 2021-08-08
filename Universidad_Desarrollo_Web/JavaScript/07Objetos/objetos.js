//definir objeto
let persona = {
    nombre: 'Diego',
    apellido: 'Sandoval',
    email: 'diegoa@gmail.com',
    edad: 21
}
console.log(persona.nombre);
console.log(persona.edad);
console.log(persona.apellido);
console.log(persona);

//agregar métodos
persona = {
    nombre: 'Diego',
    apellido: 'Sandoval',
    email: 'diegoa@gmail.com',
    edad: 21,
    nombreCompleto: function(){
        return this.nombre + ' ' + this.apellido;
    }
}
console.log(persona.nombreCompleto()); //Diego sandoval
console.log(persona);

//crear un objeto
let persona2 = new Object();
persona2.nombre = 'Camilo';
persona2.direccion = 'Saturno 15';
persona2.telefono = '7587082';
console.log(persona2.telefono);
console.log(persona2);

//acceder a las propiedades
console.log(persona.apellido);
console.log(persona['edad']);
// for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

//agregar y eliminar propiedades
persona.telefono = '9107082';
console.log(persona);
delete persona.telefono;
console.log(persona);

//imprimir un objeto
//concatenar cada valor con cada propiedad
console.log(persona.nombre + ', ' + persona.apellido);
//for in
for(propiedad in persona){
    console.log(persona[propiedad]);
}
//object values
let personaArray = Object.values(persona);
console.log(personaArray);
//cadena JSON
let personaString = JSON.stringify(persona);
console.log(personaString);

//metodos get y set
console.log(persona.nombreCompleto());
persona = {
    nombre: 'Diego',
    apellido: 'Sandoval',
    email: 'diegoa@gmail.com',
    edad: 21,
    idioma: 'es',
    get lang(){
        return this.idioma.toUpperCase();  
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    get nombreCompleto(){
        return this.nombre + ' ' + this.apellido;
    }
}
console.log(persona.nombreCompleto);
console.log(persona.lang); //ES
persona.lang = 'en';
console.log(persona.lang); //EN
console.log(persona.idioma); //EN

//metodo constructor
function Persona3(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
}
let padre = new Persona3('Jose','Sandoval','jqsan@gmail.com');
console.log(padre);
let madre = new Persona3('Maria','Fernández','minesita@gmail.com');
console.log(madre);

//agregar metodos a un metodo constructor
function Persona4(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }
}
padre = new Persona4('Jose','Sandoval','jqsan@gmail.com');
console.log(padre.nombreCompleto());
madre = new Persona4('Maria','Fernández','minesita@gmail.com');
console.log(madre.nombreCompleto());

//distintas formas de crear objetos
let objeto = new Object();
let objeto2 = {};
let cadena1 = new String('Hola');
let cadena2 = 'hola';
let numero1 = new Number(1);
let numero2 = 1
let boolean1 = new Boolean(false);
let boolean2 = true;
let arreglo1 = new Array();
let arreglo2 = [];
let funcion1 = new function(){};
let funcion2 =  function(){};

//metodo Prototype
Persona4.prototype.telefono = '9557082';
console.log(padre);
console.log(padre.telefono);
padre.telefono = '9557021';
console.log(padre.telefono);

//metodo call
let persona5 = {
    nombre: 'Diego',
    apellido: 'Sandoval',
    nombreCompleto: function(){
        return this.nombre + ' ' + this.apellido;
    }
}
let persona6 = {
    nombre: 'David',
    apellido: 'Sandoval',
}
console.log(persona5.nombreCompleto());
console.log(persona5.nombreCompleto.call(persona6));

//paso de argumentos en call
persona5 = {
    nombre: 'Diego',
    apellido: 'Sandoval',
    nombreCompleto: function(titulo, telefono){
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ', '+ telefono;
    }
}
console.log(persona5.nombreCompleto.call(persona6, 'Ing', '10081082'));
console.log(persona5.nombreCompleto('Ing', '10092021'));

//metodo apply
let arreglo = ['Ing','10147082'];
console.log(persona5.nombreCompleto.apply(persona6, arreglo));