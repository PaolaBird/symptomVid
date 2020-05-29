package com.example.symptomvid.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.fragment.app.Fragment;

import com.example.symptomvid.MainActivity;
import com.example.symptomvid.Presenter.DtoSintomas;
import com.example.symptomvid.R;

public class FragmentSintomas extends Fragment {

    private Button btnEvaluate;
    private View view;
    private CheckBox chb_tos;
    private CheckBox chb_escalofrios;
    private CheckBox chb_diarrea;
    private CheckBox chb_dolor_garganta;
    private CheckBox chb_dolores_musculares;
    private CheckBox chb_dolor_cabeza;
    private CheckBox chb_fiebre;
    private CheckBox chb_cansancio;
    private CheckBox chb_viajado;
    private CheckBox chb_visitado_areas;
    private CheckBox chb_visitado_pacientes;
    private CheckBox chb_dificultad_respirar;

    public FragmentSintomas() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sintomas, container, false);
        btnEvaluate = view.findViewById(R.id.btn_evaluate);

        chb_tos = view.findViewById(R.id.chb_tos);
        chb_escalofrios = view.findViewById(R.id.chb_escalofrios);
        chb_diarrea = view.findViewById(R.id.chb_diarrea);
        chb_dolor_garganta = view.findViewById(R.id.chb_dolor_garganta);
        chb_dolores_musculares = view.findViewById(R.id.chb_dolores_musculares);
        chb_dolor_cabeza = view.findViewById(R.id.chb_dolor_cabeza);
        chb_fiebre = view.findViewById(R.id.chb_fiebre);
        chb_cansancio = view.findViewById(R.id.chb_cansancio);
        chb_viajado = view.findViewById(R.id.chb_viajado);
        chb_visitado_areas = view.findViewById(R.id.chb_visitado_areas);
        chb_visitado_pacientes = view.findViewById(R.id.chb_visitado_pacientes);
        chb_dificultad_respirar = view.findViewById(R.id.chb_dificultad_respirar);

        btnEvaluate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evaluate();
            }
        });
        return view;
    }

    public void evaluate() {

        DtoSintomas dtoSintomas = new DtoSintomas();
        dtoSintomas.setTos(chb_tos.isChecked() ? "y" : "n");
        dtoSintomas.setEscalofrios(chb_escalofrios.isChecked() ? "y" : "n");
        dtoSintomas.setDiarrea(chb_diarrea.isChecked() ? "y" : "n");
        dtoSintomas.setDolor_garganta(chb_dolor_garganta.isChecked() ? "y" : "n");
        dtoSintomas.setDolores_musculares(chb_dolores_musculares.isChecked() ? "y" : "n");
        dtoSintomas.setDolor_cabeza(chb_dolor_cabeza.isChecked() ? "y" : "n");
        dtoSintomas.setFiebre(chb_fiebre.isChecked() ? "y" : "n");
        dtoSintomas.setCansancio(chb_cansancio.isChecked() ? "y" : "n");
        dtoSintomas.setViajado(chb_viajado.isChecked() ? "y" : "n");
        dtoSintomas.setVisitado_areas(chb_visitado_areas.isChecked() ? "y" : "n");
        dtoSintomas.setVisitado_pacientes(chb_visitado_pacientes.isChecked() ? "y" : "n");
        dtoSintomas.setDificultad_respirar(chb_dificultad_respirar.isChecked() ? "y" : "n");

        ((MainActivity) getContext()).validarSintomas(dtoSintomas);
    }
}
