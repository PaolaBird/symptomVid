package com.example.symptomvid.Presenter;

import android.app.ProgressDialog;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.symptomvid.MainActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MainPresenter {

    private static final int MY_DEFAULT_TIMEOUT = 10000;

    public void inflarResulFragment(final MainActivity context, DtoSintomas dtoSintomas) {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Analizando los sintomas...");
        progressDialog.show();
        String url = "https://f760616c47c5.ngrok.io/api";
        RequestQueue queue = Volley.newRequestQueue(context);
        try {

            HashMap<String, String> params = new HashMap();
            params.put("tos", String.valueOf(dtoSintomas.getTos()));
            params.put("escalofrios", String.valueOf(dtoSintomas.getEscalofrios()));
            params.put("diarrea", String.valueOf(dtoSintomas.getDiarrea()));
            params.put("dolor_garganta", String.valueOf(dtoSintomas.getDolor_garganta()));
            params.put("dolores_musculares", String.valueOf(dtoSintomas.getDolores_musculares()));
            params.put("dolor_cabeza", String.valueOf(dtoSintomas.getDolor_cabeza()));
            params.put("fiebre", String.valueOf(dtoSintomas.getFiebre()));
            params.put("dificultad_respirar", String.valueOf(dtoSintomas.getDificultad_respirar()));
            params.put("cansancio", String.valueOf(dtoSintomas.getCansancio()));
            params.put("viajado", String.valueOf(dtoSintomas.getViajado()));
            params.put("visitado_areas", String.valueOf(dtoSintomas.getVisitado_areas()));
            params.put("visitado_pacientes", String.valueOf(dtoSintomas.getVisitado_pacientes()));
            params.put("Content-Type", "application/json");

            JsonObjectRequest arrayRequest = new JsonObjectRequest(
                    Request.Method.POST,
                    url,
                    new JSONObject(params),
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try {
                                DtoResultado dtoResultado = new DtoResultado(response.getString("type"),response.getString("result"));
                                context.inflarViewResultados(dtoResultado);
                                progressDialog.dismiss();
                            } catch (JSONException e) {
                                e.printStackTrace();
                                Toast.makeText(context, "Error en la APP, Intentelo mas tarde", Toast.LENGTH_LONG).show();
                                progressDialog.dismiss();
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();
                            progressDialog.dismiss();
                            Toast.makeText(context, "Error obteniendo datos, Intentelo mas tarde", Toast.LENGTH_LONG).show();
                        }
                    });
            arrayRequest.setRetryPolicy(new DefaultRetryPolicy(
                    MY_DEFAULT_TIMEOUT,
                    DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

            queue.add(arrayRequest);
        } catch (Exception e) {
            Toast.makeText(context, "Error interno, Intentelo mas tarde", Toast.LENGTH_LONG).show();
            progressDialog.dismiss();
        }

    }
}
