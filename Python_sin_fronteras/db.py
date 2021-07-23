import mysql.connector

midb = mysql.connector.connect(
    host= "localhost",
    user= "root",
    password= "Dasf180999",
    database= "game_zone"
)

cursor = midb.cursor() #objeto q permite interactuar con la bd en sql

cursor.execute("show create table clientes")
resultado=cursor.fetchall()
#print(resultado)

#READ
cursor.execute("select * from clientes") #devolver todas las instancias
resultado=cursor.fetchall()#devolver todas las instancias (registros)
resultado2=cursor.fetchone()#devuelve la primer instancia
print(resultado)

#INSERT
sql="insert into clientes (id_cliente, nombre_cliente, email, telefono, direccion) values (%s, %s, %s, %s, %s)" #operacion sql
values = ("1073823004","Joaquin Sandoval","joaquinsan@gmail.com","3118107672","Cra 66 No 76-26") #valores
cursor.execute(sql,values) 
midb.commit() #hace el cambio en la bd
print(cursor.rowcount) 

#UPDATE
sql="update clientes set email = %s where id_cliente = %s" #operacion sql
values=("diegoa-sandovalf@unilibre.edu.co","1015483006")
cursor.execute(sql,values) 
midb.commit()

#DELETE
sql="delete from clientes where id_cliente = %s" #operacion sql
values=("1073823004",)
cursor.execute(sql,values) 
midb.commit()

#READ LIMITADO
cursor.execute("select * from clientes limit 1") #devolver todas las instancias
resultado=cursor.fetchall()#devolver todas las instancias (registros)
resultado2=cursor.fetchone()#devuelve la primer instancia
print(resultado)