class Usuario: #clase
    def __init__(self, nombre, apellido): #metodo init se ejecuta al crear la instancia de la clase. self hace 
        #referencia a una instancia permitiendo cambiar los valores de las propiedades de las instancias
        self.nombre = nombre #atributos
        self.apellido = apellido

    def saludo(self): #metodo. Self es la instancia de la clase
        print('Hola!, mi nombre es', self.nombre, self.apellido)


class Admin(Usuario): #el () permite heredar la clase usuario
    def superSaludo(self):
        print('Hola!, me llamo,', self.nombre, ' y soy administrador')

# usuario = Usuario('Felipe', 'Feliz')

# usuario.saludo()
# usuario.nombre = 'Chanchito'
# usuario.saludo()
# # del usuario.nombre #eliminar atributo
# # del usuario #eliminar usuario
# # print(usuario)

# admin = Admin('Super', 'Feliz')
# admin.saludo()
# admin.superSaludo()

# usuario.superSaludo()

class Animal:
    def __init__(self, nombre, onomatopeya):
        self.nombre = nombre
        self.onomatopeya = onomatopeya
    def saludo(self):
        print('Hola, soy un', self.tipo, 'y mi sonido es el', self.onomatopeya)

class Gato(Animal):
    tipo = 'gato'
    def __init__(self, nombre, onomatopeya): #Extender init del padre
        Animal.__init__(self, nombre, onomatopeya)
        print('Hola, soy un gato extendido!')

class Perro(Animal):
    tipo = 'perro'
    def __init__(self, nombre, onomatopeya):  #Extender init del padre
        super().__init__(nombre, onomatopeya)
        print('instanciando un perro')

class Canario(Animal):
    tipo = 'canario'

gato = Gato('Fluffy', 'maullido')
gato.saludo()

perro = Perro('Firulais', 'ladrido')
perro.saludo()

canario = Canario('Piolin', 'silvido')
canario.saludo()
