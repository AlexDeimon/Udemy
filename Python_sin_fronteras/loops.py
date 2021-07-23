#while 1
i = 0
while i < 5: # imprime 0-4
    i += 1
    if i == 3:
        continue #continue se salta o omite el 3
    print(i)

#for 1
usuarios = ['Chanchito feliz', 'felipe', 'roberto', 'nicolas']
for usuario in usuarios: #imprime los usuarios
    print(usuario)
usuario = 'Chanchito Feliz' #imprime los caracteres de usuario
for c in usuario:
    print(c)

#for 2
usuarios = ['Chanchito feliz', 'felipe', 'roberto', 'nicolas']
for usuario in usuarios: #imprime los usuarios
    if usuario == 'roberto':
        break #break termina el ciclo al llegar a roberto
    print(usuario)

#for 3
usuarios = ['Chanchito feliz', 'felipe', 'roberto', 'nicolas']
for usuario in usuarios: #imprime los usuarios
    if usuario == 'roberto':
        continue # continue se salta o omite a  roberto
    print(usuario)

#for 4
for x in range(3, 30, 5): #imprime de a 5 desde el 3 hasta el 30
    print(x)
else:
    print('Hemos terminado!!') #esle sirve para mostrar algo al terminar el cilo

#for 5
usuarios = ['Chanchito feliz', 'felipe', 'roberto', 'nicolas']
edades = [24, 25, 26, 35]
for usuario in usuarios: #for dentro de un for (for anidado) primero imprime el ciclo de menor jerarquia y luego el mayor
    for edad in edades:
        print(usuario, edad)

