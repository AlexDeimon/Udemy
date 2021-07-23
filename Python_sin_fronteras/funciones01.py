#1
def miFuncion():
    print('Mi primera función!')
miFuncion()

#2
def imprimeDato(*nombre): #argumento con *: argumento variable: sin un unico valor. pasa a ser una lista
    print('El nombre completo es:', nombre[1]) #imprime el valor en el indice 1 de la lista
imprimeDato('Chanchito', 'Feliz', 'lala', 'lele') #lista de *nombre

#3
def nombreCompleto(apellido, nombre): #2 argumentos
    print(nombre, apellido) 
nombreCompleto(nombre='Chanchito', apellido='Feliz') 

#4
def nombreCompleto2(**kwargs): #argumento variable como un diccionario
    print(kwargs['nombre'], kwargs['apellido']) #indices del diccionario
nombreCompleto2(nombre='Chanchito', apellido='Feliz') #valores de los indices

#5
def miFuncion2(argumento = 'Chanchito'): #argumento definido por defecto. se imprime en caso de que se llame la funcion sin ningun argumento
    print(argumento)

miFuncion2('Batman') #llama al argumento batman por lo cual imprime batman
miFuncion2() #imprime el argumento definido por defecto 

#6
def miFuncionLista(lista): #se define una lista como argumento
    for el in lista:
        print(el)
miFuncionLista(['Chanchito', 'Feliz']) #se imprime los valores de la lista

#7
def concatenaNombres(lista): 
    i = ''
    for el in lista: #for para agregar elementos a la lista
        i = i + el + ' '
    return i #retorna el o los elementos agregados
nombres = concatenaNombres(['Chanchito', 'Feliz']) #para imprimir un retorno se debe declarar en una variable
print(nombres)

#8
def recursion(i): #recursividad: reutilizar la funcion en caso de que la condicion no se cumpla hasta que esta se cumpla
    if(i < 1):
        return i
    print(i)
    recursion(i - 1)

recursion(6)
