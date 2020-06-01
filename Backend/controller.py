from flask_restful import Resource, request
from flask import jsonify
from Backend.prolog import PrologModel


class Controller(Resource):
    def post(self):
        tos = request.get_json("tos")
        escalofrios = request.get_json("escalofrios")
        diarrea = request.get_json("diarrea")
        dolor_garganta = request.get_json("dolor_garganta")
        dolores_musculares = request.get_json("dolores_musculares")
        dolor_cabeza = request.get_json("dolor_cabeza")
        fiebre = request.get_json("fiebre")
        dificultad_respirar = request.get_json("dificultad_respirar")
        cansancio = request.get_json("cansancio")
        viajado = request.get_json("viajado")
        visitado_areas = request.get_json("visitado_areas")
        visitado_pacientes = request.get_json("visitado_pacientes")
        print(request.get_json())
        dic = request.get_json()
        lis = list(dic.values())
        prologModel = PrologModel()
        res = prologModel.sintomas(lis)
        return jsonify(res)


# python -m flask run
