#1
def cuadrado(x):
   """
   Input: x, a float
   Returns square of x
   """
   return x**2
def main():
    var = float(input())
    print(cuadrado(var))
main()

#2
from math import pi
def area_circulo(r):
  """
  Input: r correspondiente al radio
  Returns: área del círculo
  """
  return pi*r**2
radio = float(input('digite el radio:'))
resultado = area_circulo(radio)
print(resultado)  

#3
def area_rectangulo(l, a):
    return l*a
largo = float(input('digite el largo del rectángunlo: '))
ancho = float(input('digite el ancho del rectángunlo: '))
print("El área del rectángulo es:", area_rectangulo(largo, ancho))

#4
#funciones sin argumentos.
def sayHi():
    name = input()
    print('Hello', name)
sayHi()

#5
#Funciones con argumentos y sin retorno
def sayHi(name):
    print('Hello', name)
name = input()
sayHi(name)

#6
#Funciones con argumentos y retorno:
def sayHi(name):
    return 'Hello ' + name
name = input()
print(sayHi(name))

#7
#Funciones con argumentos por defecto
def log_entero(num, base=2):
    cont = 0 
    while num >= base:
        cont+=1
        num /= base
    return cont
print("log en base 2 de 1024: ", log_entero(1024))
print("logaritmo entero en base 10 de 1000: ", log_entero(1000, 10)) 
print("logaritmo entero en base 3 de 9: ", log_entero(9, 3))

#8
#Funciones con un número de argumentos variable
def variable_argument(var1, *vari):
    print('salida:'+ str(var1))    
    for var in vari:
        print(var)
variable_argument(60)
variable_argument(100, 90, 67, 23, 10)

#9
#Paso de parámetros en python
def unir_listas(list1, list2):
    list1.extend(list2)
avengers = ['Tony', 'Natalia', 'Steve']
nuevos_avengers = ['Thor', 'Peter']
unir_listas(avengers, nuevos_avengers)
print(avengers)