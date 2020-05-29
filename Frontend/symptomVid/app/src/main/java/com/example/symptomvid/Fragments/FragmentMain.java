package com.example.symptomvid.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.symptomvid.MainActivity;
import com.example.symptomvid.R;


public class FragmentMain extends Fragment {

    private Button btnIniciar;
    private View view;
    MainActivity mainActivity;

    public FragmentMain() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        btnIniciar = view.findViewById(R.id.btn_iniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciar();
            }
        });

        return view;

    }


    public void iniciar() {
        ((MainActivity) getContext()).inflarViewSintomas();
    }


}
