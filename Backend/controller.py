from flask_restful import Resource, request
from prolog import PrologModel
from flask import jsonify

class Controller(Resource):

    def post(self, answers):
        return jsonify({})
