package com.company;

import java.util.ArrayList;

public class Modulos {

    private String NombreModulo;
    private String UrlModulo;
    private ArrayList<Temario> Modulos;

    public Modulos(String nombreModulo, String urlModulo) {
        NombreModulo = nombreModulo;
        UrlModulo = urlModulo;
    }

    public String getNombreModulo() {
        return NombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        NombreModulo = nombreModulo;
    }

    public String getUrlModulo() {
        return UrlModulo;
    }

    public void setUrlModulo(String urlModulo) {
        UrlModulo = urlModulo;
    }
}
