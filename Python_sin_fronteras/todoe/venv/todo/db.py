import mysql.connector
import click #ejecutar comandos SQL en terminal.
from flask import current_app, g #current_app mantiene la aplicacion ejecutando, g variable para asignar y acceder a variables
from flask.cli import with_appcontext #ejecutando script bd. acceder a las variables de configuracion
from .schema import instructions

def get_db(): #obtener la bd y el cursor
    if 'db' not in g:
        g.db = mysql.connector.connect( #conexion db
            host=current_app.config['DATABASE_HOST'],
            user=current_app.config['DATABASE_USER'],
            password=current_app.config['DATABASE_PASSWORD'],
            database=current_app.config['DATABASE']
        )
        g.c = g.db.cursor(dictionary=True)
    return g.db, g.c 

#cerrar la conexion db

def close_db(e=None):
    db = g.pop('db', None)
    if db is not None:
        db.close()

def init_db():
    db, c = get_db()
    for i in instructions:
        c.execute(i)
    
    db.commit()

@click.command('init-db') #llamr comando en la terminal
@with_appcontext #acceder a lasa variables

def init_db_comand():
    init_db() #encarcada de logica para correr scripts
    click.echo("Base de datos inicializada")


def init_app(app): #al terminar las peticiones se cerrara la conexion db
    app.teardown_appcontext(close_db)
    app.cli.add_command(init_db_comand)
