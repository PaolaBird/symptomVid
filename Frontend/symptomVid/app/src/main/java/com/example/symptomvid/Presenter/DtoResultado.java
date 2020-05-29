package com.example.symptomvid.Presenter;

public class DtoResultado {

    private String type;
    private String result;

    public DtoResultado(String type, String result) {
        this.type = type;
        this.result = result;
    }

    public DtoResultado() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
