# c = open('chanchito.txt', 'w') #(nombre del archivo, permisos r(read), w(write), a(append), x(create))

# c.write('\nagregaremos una nueva línea a nuestro archivo')

# c.close()

# x = open('chanchito.txt')

# print(x.read()) lee todo el archivo

#print(x.readline()) lee una linea del archivo

import os  #libreria para eliminar archivos

if os.path.exists('chanchito.txt'): #si el archivo existe
    os.remove('chanchito.txt') #eliminar archivo
else:
    print('El archivo no existe')

os.rmdir('micarpeta') #eliminar carpeta
