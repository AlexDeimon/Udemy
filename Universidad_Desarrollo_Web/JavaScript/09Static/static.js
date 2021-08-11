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

