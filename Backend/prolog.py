from pyswip import Prolog
from flask import jsonify

class PrologModel():
    
    def symptoms(self):
        p = Prolog()
        p.consult("")
        for solucion in p.query(""):
            print(solucion["X"], " is", solucion["Y"])

        #https://www.youtube.com/watch?v=fTixqYoZY90