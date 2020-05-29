package com.example.symptomvid.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.symptomvid.Presenter.DtoResultado;
import com.example.symptomvid.R;

public class FragmentResultados extends Fragment {

    private View view;
    DtoResultado dtoResultado;
    private TextView txtResult;
    private ImageView image_type;

    public FragmentResultados(DtoResultado res) {

        this.dtoResultado = res;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_resultados, container, false);
        txtResult = view.findViewById(R.id.txtResult);
        image_type = view.findViewById(R.id.image_type);

        txtResult.setText(dtoResultado.getResult());

        validarImagen(dtoResultado.getType());
        return view;
    }

    private void validarImagen(String type) {

        switch (type) {
            case "1":
                image_type.setImageResource(R.drawable.type_1);
                break;
            case "2":
                image_type.setImageResource(R.drawable.type_2);
                break;
            case "3":
                image_type.setImageResource(R.drawable.type_2);
                break;
            case "4":
                image_type.setImageResource(R.drawable.type_2);
                break;
        }


    }



}
