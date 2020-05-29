package com.example.symptomvid.Presenter;

public class DtoSintomas {

    private String tos;
    private String escalofrios;
    private String diarrea;
    private String dolor_garganta;
    private String dolores_musculares;
    private String dolor_cabeza;
    private String fiebre;
    private String dificultad_respirar;
    private String cansancio;
    private String viajado;
    private String visitado_areas;
    private String  visitado_pacientes;

    public DtoSintomas() {

    }

    public DtoSintomas(String tos, String escalofrios, String diarrea, String dolor_garganta, String dolores_musculares, String dolor_cabeza, String fiebre, String dificultad_respirar, String cansancio, String viajado, String visitado_areas, String visitado_pacientes) {
        this.tos = tos;
        this.escalofrios = escalofrios;
        this.diarrea = diarrea;
        this.dolor_garganta = dolor_garganta;
        this.dolores_musculares = dolores_musculares;
        this.dolor_cabeza = dolor_cabeza;
        this.fiebre = fiebre;
        this.dificultad_respirar = dificultad_respirar;
        this.cansancio = cansancio;
        this.viajado = viajado;
        this.visitado_areas = visitado_areas;
        this.visitado_pacientes = visitado_pacientes;
    }

    public String getTos() {
        return tos;
    }

    public void setTos(String tos) {
        this.tos = tos;
    }

    public String getEscalofrios() {
        return escalofrios;
    }

    public void setEscalofrios(String escalofrios) {
        this.escalofrios = escalofrios;
    }

    public String getDiarrea() {
        return diarrea;
    }

    public void setDiarrea(String diarrea) {
        this.diarrea = diarrea;
    }

    public String getDolor_garganta() {
        return dolor_garganta;
    }

    public void setDolor_garganta(String dolor_garganta) {
        this.dolor_garganta = dolor_garganta;
    }

    public String getDolores_musculares() {
        return dolores_musculares;
    }

    public void setDolores_musculares(String dolores_musculares) {
        this.dolores_musculares = dolores_musculares;
    }

    public String getDolor_cabeza() {
        return dolor_cabeza;
    }

    public void setDolor_cabeza(String dolor_cabeza) {
        this.dolor_cabeza = dolor_cabeza;
    }

    public String getFiebre() {
        return fiebre;
    }

    public void setFiebre(String fiebre) {
        this.fiebre = fiebre;
    }

    public String getDificultad_respirar() {
        return dificultad_respirar;
    }

    public void setDificultad_respirar(String dificultad_respirar) {
        this.dificultad_respirar = dificultad_respirar;
    }

    public String getCansancio() {
        return cansancio;
    }

    public void setCansancio(String cansancio) {
        this.cansancio = cansancio;
    }

    public String getViajado() {
        return viajado;
    }

    public void setViajado(String viajado) {
        this.viajado = viajado;
    }

    public String getVisitado_areas() {
        return visitado_areas;
    }

    public void setVisitado_areas(String visitado_areas) {
        this.visitado_areas = visitado_areas;
    }

    public String getVisitado_pacientes() {
        return visitado_pacientes;
    }

    public void setVisitado_pacientes(String visitado_pacientes) {
        this.visitado_pacientes = visitado_pacientes;
    }
}
