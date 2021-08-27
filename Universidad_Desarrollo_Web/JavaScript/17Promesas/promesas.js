let miPromesa = new Promise((resolver, rechazar) => {
    let expresion = true;
    if(expresion)
        resolver('Resolvio correcto');
    else
        rechazar('se produjo un error');  
});
miPromesa.then(valor => console.log(valor)).catch(error => console.log(error)); 