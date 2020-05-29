preguntar(Pts, P) :- pregunta(P, R), puntos(Pts, P, R).

pregunta(Preg, Ans) :- write(Preg), read(Ans), (Ans=y; Ans=n).

puntos(1, P, R) :- P = '¿Tiene tos? (y/n)', R = y, !.
puntos(1, P, R) :- P = '¿Tiene escalofrios? (y/n)', R = y, !.
puntos(1, P, R) :- P = '¿Ha tenido diarrea? (y/n)', R = y, !.
puntos(1, P, R) :- P = '¿Tiene dolor de garganta? (y/n)', R = y, !.
puntos(1, P, R) :- P = '¿Ha tenido dolores musculares? (y/n)', R = y, !.
puntos(1, P, R) :- P = '¿Tiene dolor de cabeza? (y/n)', R = y, !.
puntos(1, P, R) :- P = '¿Ha tenido fiebre de 38° o mas? (y/n)', R = y, !.
puntos(2, P, R) :- P = '¿Ha tenido dificultad para respirar? (y/n)', R = y, !.
puntos(2, P, R) :- P = '¿Ha sentido cansancio/debilidad? (y/n)', R = y, !.
puntos(3, P, R) :- P = '¿Ha viajado en los ultimos 14 dias? (y/n)', R = y, !.
puntos(3, P, R) :- P = '¿Ha visitado areas infectadas por Covid 19? (y/n)', R = y, !.
puntos(3, P, R) :- P = '¿Visitó o ha cuidado pacientes con Covid 19? (y/n)', R = y, !.
puntos(0, P, R) :- P \= '.', R = n.

sugerencia('Puede estar relacionado con estrés. Mantenerse observando.', Pts) :- Pts >= 0, Pts =< 2, !.
sugerencia('Hidratese adecuadamente, mantenga una buena higiene personal. Observe y revalore en 2 días.', Pts) :- Pts >= 3, Pts =< 5, !.
sugerencia('Debe ir a una consulta médica', Pts):- Pts >= 6, Pts =< 12, !.
sugerencia('REPORTESE DE INMEDIATO A EPIDEMIOLOGÍA.', Pts):- Pts >=13, Pts =<20, !.