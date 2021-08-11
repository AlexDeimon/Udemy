class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

let persona1 = new Persona('Diego','Sandoval');
console.log(persona1);

let persona2 = new Persona('Alejandro','Fernández');
console.log(persona2);

//metodos get y set
class Persona1{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        return this._nombre = nombre;
    }
}
let persona3 = new Persona1('Diego','Sandoval');
persona3.nombre = 'Alejandro'; //set nombre
console.log(persona3.nombre); //get nombre
console.log(persona3);

//Hoisting No aplica en clases

//Herencia
class Persona2{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        return this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        return this._apellido = apellido;
    }
}
class Empleado extends Persona2{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        return this._departamento = departamento;
    }
}

let persona4 = new Persona2('Diego','Sandoval');
console.log(persona4);

let empleado1 = new Empleado('David','Sandoval','Seguridad TI');
console.log(empleado1);
console.log(empleado1.nombre);

//heredar metodos
class Persona3{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        return this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        return this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
}

class Empleado2 extends Persona3{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        return this._departamento = departamento;
    }
}

let empleado2 = new Empleado2('Juan','Fernández','Ingenieria');
console.log(empleado2.nombreCompleto());

//sobreescritura
class Persona4{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        return this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        return this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
}

class Empleado3 extends Persona4{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        return this._departamento = departamento;
    }
    //sobreescritura
    nombreCompleto(){
        return 'nombre: ' + super.nombreCompleto() + ', departamento: ' + this._departamento;
    }
}

let empleado3 = new Empleado3('Alex','Sandoval','Desarrollo');
console.log(empleado3.nombreCompleto());

//metodo toString
class Persona5{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        return this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        return this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
    toString(){
        return this.nombreCompleto();
    }
}

class Empleado4 extends Persona5{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        return this._departamento = departamento;
    }
    //sobreescritura
    nombreCompleto(){
        return 'nombre: ' + super.nombreCompleto() + ', departamento: ' + this._departamento;
    }
}

let empleado4 = new Empleado4('Alex','Deimon','Desarrollo');
console.log(empleado4.toString());

