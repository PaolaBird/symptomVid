from pyswip import Prolog
from flask import jsonify


class PrologModel:
    def symptoms(self, answers):
        questions = [
            "¿Tiene tos? (y/n)",
            "¿Tiene escalofrios? (y/n)",
            "¿Ha tenido diarrea? (y/n)",
            "¿Tiene dolor de garganta? (y/n)",
            "¿Ha tenido dolores musculares? (y/n)",
            "¿Tiene dolor de cabeza? (y/n)",
            "¿Ha tenido fiebre de 38° o mas? (y/n)",
            "¿Ha tenido dificultad para respirar? (y/n)",
            "¿Ha sentido cansancio/debilidad? (y/n)",
            "¿Ha viajado en los ultimos 14 dias? (y/n)",
            "¿Ha visitado areas infectadas por Covid 19? (y/n)",
            "¿Visitó o ha cuidado pacientes con Covid 19? (y/n)",
        ]
        p = Prolog()
        p.consult("knowledge_base.pl")
        pts = []
        suma = 0
        for x in range(0, len(questions)):
            q = "puntos(Pts, '" + questions[x] + "' , " + answers[x] + ")"
            pts = list(p.query(q))
            suma += pts[0]["Pts"]

        q = "sugerencia(Variable, " + str(suma) + ")"
        return list(p.query(q))


    def sintomas(self, answers):
        questions = [
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            2,
            2,
            3,
            3,
            3,
        ]
        suma = 0
        sugerencia = ""
        for x in range(0, len(questions)):
            if answers[x] == "y":
                suma += questions[x]
        if 0 <= suma <= 2:
            sugerencia = {
                "type": "1",
                "result": "Puede estar relacionado con estrés. Mantenerse observando.",
            }

        elif 3 <= suma <= 5:
            sugerencia = {
                "type": "2",
                "result": "Hidratese adecuadamente, mantenga una buena higiene personal. Observe y revalore en 2 días.",
            }
        elif 6 <= suma <= 12:
            sugerencia = {"type": "3", "result": "Debe ir a una consulta médica."}

        elif 13 <= suma <= 20:
            sugerencia = {
                "type": "4",
                "result": "REPORTESE DE INMEDIATO A EPIDEMIOLOGÍA.",
            }

        return sugerencia


# p = PrologModel()
# x = ["y", "y", "y", "y", "y", "y", "y", "y", "y", "y", "y", "y"]
# print(type(x))
# print(p.symptoms(x))
