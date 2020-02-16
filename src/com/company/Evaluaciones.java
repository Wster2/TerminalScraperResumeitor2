package com.company;

public class Evaluaciones {

    private String NombreEvaluaciones;
    private String UrlEvaluaciones;


    private String NombreModulo;
    private String UrlModulo;

    public Evaluaciones(String nombreEvaluaciones, String urlEvaluaciones, String nombreModulo, String urlModulo) {
        NombreEvaluaciones = nombreEvaluaciones;
        UrlEvaluaciones = urlEvaluaciones;
        NombreModulo = nombreModulo;
        UrlModulo = urlModulo;
    }

    public String getNombreEvaluaciones() {
        return NombreEvaluaciones;
    }

    public void setNombreEvaluaciones(String nombreEvaluaciones) {
        NombreEvaluaciones = nombreEvaluaciones;
    }

    public String getUrlEvaluaciones() {
        return UrlEvaluaciones;
    }

    public void setUrlEvaluaciones(String urlEvaluaciones) {
        UrlEvaluaciones = urlEvaluaciones;
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

