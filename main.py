from flask import Flask
import os
from flask_restful import Api
from Backend.controller import *

app = Flask(__name__)
api = Api(app)

#Routes 
api.add_resource(Controller, '/api')


if __name__ == '__main__':
    port = int(os.environ.get('PORT', 5000))
    app.run(host='0.0.0.0', port=port, debug=True)