from flask import Flask, request, url_for, redirect, abort, render_template
import mysql.connector
app = Flask(__name__) #main

midb = mysql.connector.connect(
    host= "localhost",
    user= "root",
    password= "Dasf180999",
    database= "game_zone"
)

cursor = midb.cursor(dictionary=True)

@app.route("/") #llamar a la ruta
def index():
    return "Hola mundo"

@app.route("/post/<post_id>", methods=["GET","POST"])
def lala(post_id):
    if request.method == "GET":
        return "el id del post es: "+ post_id
    else:
        return "este es otro metodo y no get"


@app.route("/lele", methods=["POST","GET"])
def lele():
    cursor.execute("select * from clientes")
    resultado=cursor.fetchall()
    print(resultado)
    return render_template('lele.html', clientes=resultado)
    #abort(401)
    #return redirect(url_for("lala",post_id=2))
    #print(request.form)
    #print(request.form["llave1"])
    #print(request.form["llave2"])
    #return render_template('lele.html')
    '''return {
        "username":'AlexDeimon',
        "email":'diegoa-sandovalf@unilibre.edu.co'
    }'''

@app.route("/home", methods=["GET"])
def home():
    return render_template('home.html',mensaje="Hola mundo!")

@app.route("/crear",methods=["POST","GET"])
def crear():
    if request.method=="POST":
        id_cliente = request.form['id_cliente']
        nombre_cliente = request.form['nombre_cliente']
        email = request.form['email']
        telefono = request.form['telefono']
        direccion = request.form['direccion']
        sql = "insert into clientes (id_cliente, nombre_cliente, email, telefono, direccion) values (%s, %s, %s, %s, %s)"
        values = (id_cliente,nombre_cliente,email,telefono,direccion)
        cursor.execute(sql,values) 
        midb.commit()
        return redirect(url_for("lele"))
    return render_template('crear.html')