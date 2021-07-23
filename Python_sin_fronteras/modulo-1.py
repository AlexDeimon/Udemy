import modulos as xs #as permite renombrar el modulo para usarlo con ese nombre en el archivo
from camelcase import CamelCase

print(xs.mascotas)
xs.saludo('Nicolas')

c = CamelCase()
s = 'esta oración necesita CamelCase!'

camelcased = c.hump(s)
print(camelcased)
