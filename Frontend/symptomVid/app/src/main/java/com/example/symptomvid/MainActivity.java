package com.example.symptomvid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.symptomvid.Fragments.FragmentMain;
import com.example.symptomvid.Fragments.FragmentResultados;
import com.example.symptomvid.Fragments.FragmentSintomas;
import com.example.symptomvid.Presenter.DtoResultado;
import com.example.symptomvid.Presenter.DtoSintomas;
import com.example.symptomvid.Presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    FragmentMain fragmentMain;
    FragmentSintomas fragmentSintomas;
    FragmentResultados fragmentResultados;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentMain = new FragmentMain();
        mainPresenter = new MainPresenter();

         getSupportFragmentManager().beginTransaction().replace(R.id.containerFragments, fragmentMain).commit();

    }

    public void inflarViewSintomas() {
        fragmentSintomas = new FragmentSintomas();
        getSupportFragmentManager().beginTransaction().replace(R.id.containerFragments, fragmentSintomas).commit();
    }

    public void inflarViewResultados(final DtoResultado dtoResultado) {
        fragmentResultados = new FragmentResultados(dtoResultado);
        getSupportFragmentManager().beginTransaction().replace(R.id.containerFragments, fragmentResultados).commit();
    }

    public void validarSintomas(final DtoSintomas dtoSintomas) {
        mainPresenter.inflarResulFragment(this, dtoSintomas );
    }


}
