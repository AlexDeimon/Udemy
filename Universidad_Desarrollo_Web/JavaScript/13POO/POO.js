//sobreescritura
class Empleado{
    constructor(nombre, sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    obtenerDetalles(){
        return `Empleado: nombre:  ${this.nombre}, sueldo: ${this.sueldo}`;
    }
}

class Gerente extends Empleado{
    constructor(nombre, sueldo, departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    obtenerDetalles(){
        return `Gerente: ${super.obtenerDetalles()}, departamento: ${this.departamento}`
    }
}

let empleado1 = new Empleado('Alex',300);
console.log(empleado1.obtenerDetalles())

let gerente1 = new Gerente('Diego', 5000, 'Sistemas');
console.log(gerente1.obtenerDetalles());

//polimorfismo
function imprimir(tipo){
    console.log(tipo.obtenerDetalles());
}

imprimir(empleado1);
imprimir(gerente1);

//instanceof
function determinarTipo(tipo){
    if(tipo instanceof Gerente){
        console.log('Es un objeto de tipo gerente');
    }
    else if(tipo instanceof Empleado){
        console.log('Es un objeto de tipo Empleado');
    }
}
determinarTipo(empleado1); //no responde que a tipos hijo pero si a tipos padre
determinarTipo(gerente1);