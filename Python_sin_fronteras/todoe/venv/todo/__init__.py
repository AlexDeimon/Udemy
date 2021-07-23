import os #acceder a las variables de entorno del SO

from flask import Flask

def create_app():
    app = Flask(__name__)

    app.config.from_mapping( #definir variables de configuracion
        SECRET_KEY= "Alex_Deimon_18_09_99", #DEFINIR LAS SESIONES
        DATABASE_HOST=os.environ.get('FLASK_DATABASE_HOTS'), #enviroment: objeto variables de entorno
        DATABASE_PASSWORD=os.environ.get('FLASK_DATABASE_PASSWORD'),
        DATABASE_USER=os.environ.get('FLASK_DATABASE_USER'),
        DATABASE=os.environ.get('FLASK_DATABASE'),
    )

    from . import db
    db.init_app(app)

    from . import auth
    from . import todo
    app.register_blueprint(auth.bp)
    app.register_blueprint(todo.bp)

    @app.route("/hola")
    def hola():
        return "Hola prueba"

    return app