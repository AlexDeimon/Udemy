#basics
if 3 > 5: # Acá va a un comentario
    print('Esto no se va a imprimir')

if 5 > 3: # Acá va otro comentario
    print('5 es mayor a 3')


x = 5
y = 'chanchito feliz'

print(x, y)

correo = 'chanchito@feliz.com'

print(correo)

_mi_var = 'chanchito'
MIVAR = 'chanchito'
a, b, c = 'Lala', 'Lele', 'Lili'

print(a, b, c)

valor1 = valor2 = valor3 = 'Chanchito Feliz'

print(valor1, valor2, valor3)

inicio = 'Hola'
final = 'mundo'

print(inicio + final)


#variables
palabra = 'hola mundo' # string
oracion = "hola mundo comilla doble" # string

entero = 20 # integer
conDecimales = 20.2 # float
complejo = 1j #complejo

print(palabra, oracion, entero, conDecimales, complejo)

#LISTAS
lista = ['Hola', 'Mundo', 'Chanchito feliz']
lista2 = lista.copy() #copy: copiar elemnetos de una lista
lista.append('Chanchito triste') #append: agregar elemntos a una lista
lista.clear() #clear: limpiar una lista
print(lista, lista2.count(3))
print(len(lista), len(lista2)) #len: longitud de una lista
largoLista = len(lista)
largoLista2 = len(lista2)

print(largoLista, largoLista2)

print(lista[2]) #acceder al 3ER ELEMENTO  de una lista. RECORDAR que el primer elemento es 0

lista.pop() # este elimina el último elemento de la lista
lista.remove('Hola') # este elimina un elemento por su valor

lista.reverse() #voltea la lista
lista.sort() #ordena la lista. RECORDAR que para que funcione la lista debe ser un solo tipo de dato

#TUPLAS: listas NO modificalbes
tupla = ('hola', 'mundo', 'somos', 'tupla')
print(tupla.index(0)) #index: devuelve el valor asignado al espacio solicitado
listaDeTupla = list(tupla) #list: convierte una tupla a una lista 
listaDeTupla.append('chanchito')
print(listaDeTupla)

rango = range(6) #range: define un rango DESDE 0 hasta el valor dado
print(rango)

#DICCIONARIOS: son como listas pero en lugar de tener espacios numericos tienen indices con strings
diccionario = {
    "nombre": "Chanchito feliz",
    "raza": "Persa",
    "edad": 5
} #"nombre del espacio del indice": "contenido del espacio"

print(diccionario) #imprime disccionario completo
print(diccionario['nombre']) #imprime contenido del indice 'nombre'
print(diccionario['raza']) #imprime contenido del indice 'raza'
print(diccionario.get('nombre')) #get metodo para imrpimir el contenido del indice solicitado
diccionario['nombre'] = 'Fluffy' #asignar contenido al indice 'nombre'

print(len(diccionario)) #len: longitud del diccionario

diccionario['ronronea'] = 'Si' #agregar indice 'ronronea' con su valor:'si'

print(diccionario)
diccionario.pop('ronronea') #pop: elimina el indice solicitado
diccionario.popitem() #popoitem: eliminar ultimo indice del diccionario
copiaGatito = diccionario.copy() #copy copia el diccionario
copiaGatito = dict(diccionario) #dict: copia diccionario solicitado
del diccionario['ronronea'] #del elimina indice solicitado
diccionario.clear()#clear elimina todos los indices del diccionario
print(diccionario, copiaGatito)

#DICCIONARIOS ANIDADOS: diccionarios que contienen diccionarios

fluffy = {
    "nombre": "Fluffy",
    "edad": 4
} #fluffy es un diccionario indice del diccionario gatitos

mamba = {
    "nombre": "Black Mamba",
    "edad": 12
}#mamba es un diccionario indice del diccionario gatitos

gatitos = {
    "Fluffy": fluffy,
    "Mamba": mamba
}#diccionario gatitios que contiene los diccionarios fluffy y mamba

print(gatitos)

perritos = dict(nombre="Chanchito Feliz", edad=6) #dict: CREA un diccionario en una sola linea
print(perritos)

#BOOLEANS
verdadero = True
falso = False

print(verdadero, falso)
