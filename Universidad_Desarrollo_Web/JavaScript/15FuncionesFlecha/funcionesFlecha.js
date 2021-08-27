let  miFuncion = function(){
    console.log('saludos');
}

const miFuncionFlecha = () => {
    console.log('saludos desde mi funcion flecha');
}

const miFuncionFlecha2 = () => console.log('saludos desde mi funcion flecha de una linea');

const saludar = () => {
    return 'Saludos desde funcion flecha con return';
}

const saludar2 = () => 'Saludos desde funcion flecha sin return';

const regresaObjeto = () => ({nombre: 'Diego', apellido: 'Sandoval'});

const funcionConPaametros = (mensaje) => console.log(mensaje);

const funcionConVariosPaametros = (x, y) => {
    let resultado = x + y;
    return console.log(`Resultado: ${resultado}`);
}

miFuncion();
miFuncionFlecha();
miFuncionFlecha2();
console.log(saludar());
console.log(saludar2());
console.log(regresaObjeto());
funcionConPaametros('Saludos desde parametros');
funcionConVariosPaametros(2,5);