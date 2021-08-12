//metodos estaticos
class Persona{
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
    static saludar(){
        console.log('saludos desde metodo static')
    }
    static saludar2(Persona){
        console.log(Persona.nombre + ' ' + Persona.apellido);
    }
}

class Empleado extends Persona{
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
let persona1 = new Persona('Diego','Sandoval');

let empleado1 = new Empleado('Alex','Deimon','Desarrollo');
console.log(empleado1.toString());
//persona.saludar(); No es posible llamar un metodo static desde un objeto
Persona.saludar();
Persona.saludar2(persona1);
Empleado.saludar();
Empleado.saludar2(empleado1);

//Atributos estaticos
class Persona1{
    static contadorObjetosPersona = 0;

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        Persona1.contadorObjetosPersona++;
        console.log('Se incrementa contador '+Persona1.contadorObjetosPersona);
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
    static saludar(){
        console.log('saludos desde metodo static')
    }
    static saludar2(Persona){
        console.log(Persona.nombre + ' ' + Persona.apellido);
    }
}

class Empleado1 extends Persona1{
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
let persona2 = new Persona1('Diego','Sandoval');

let empleado2 = new Empleado1('Alex','Deimon','Desarrollo');
console.log(persona2.contadorObjetosPersona); //No
console.log(Persona1.contadorObjetosPersona);
console.log(Empleado1.contadorObjetosPersona);

//constantes estaticas
class Persona2{
    static contadorPersona = 0;

    static get MAX_OBJ(){
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona2.contadorPersona < Persona2.MAX_OBJ){
            this.idPersona = ++Persona2.contadorPersona;
        }else{
            console.log('Se han superado el maximo de objetos permitidos');
        }
        
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
        return this.idPersona + ' ' + this._nombre + ' ' + this._apellido;
    }
    toString(){
        return this.nombreCompleto();
    }
    static saludar(){
        console.log('saludos desde metodo static')
    }
    static saludar2(Persona){
        console.log(Persona.nombre + ' ' + Persona.apellido);
    }
}

class Empleado2 extends Persona2{
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
        return 'id & nombre: ' + super.nombreCompleto() + ', departamento: ' + this._departamento;
    }
}

let persona3 = new Persona2('Diego','Sandoval');

let empleado3 = new Empleado2('Alex','Deimon','Desarrollo');
console.log(persona3.toString()); //No
console.log(empleado3.toString()); 
console.log(Persona2.contadorPersona);
console.log(Empleado2.contadorPersona);

console.log(Persona2.MAX_OBJ); //5
Persona2.MAX_OBJ = 10;
console.log(Persona2.MAX_OBJ); // sigue en 5

let persona4 = new Persona2('Juan','Sandoval');
console.log(Empleado2.contadorPersona);
let persona5 = new Persona2('Juan','Fernández');
console.log(Empleado2.contadorPersona);
let persona6 = new Persona2('Alex','Uchija');
console.log(Empleado2.contadorPersona);
let persona7 = new Persona2('Alex','Uchija');
console.log(Empleado2.contadorPersona); //se ha superado el max
