package com.company;

public class Temario {


    private String NombreEvaluacion;
    private String UrlEvalucion;

    private String NombreTemas;
    private String UrlTemas;

    private String NombreModulo;

    public Temario(String nombreEvaluacion, String urlEvalucion, String nombreTemas, String urlTemas, String nombreModulo) {
        NombreEvaluacion = nombreEvaluacion;
        UrlEvalucion = urlEvalucion;
        NombreTemas = nombreTemas;
        UrlTemas = urlTemas;
        NombreModulo = nombreModulo;
    }

    public String getNombreEvaluacion() {
        return NombreEvaluacion;
    }

    public void setNombreEvaluacion(String nombreEvaluacion) {
        NombreEvaluacion = nombreEvaluacion;
    }

    public String getUrlEvalucion() {
        return UrlEvalucion;
    }

    public void setUrlEvalucion(String urlEvalucion) {
        UrlEvalucion = urlEvalucion;
    }

    public String getNombreTemas() {
        return NombreTemas;
    }

    public void setNombreTemas(String nombreTemas) {
        NombreTemas = nombreTemas;
    }

    public String getUrlTemas() {
        return UrlTemas;
    }

    public void setUrlTemas(String urlTemas) {
        UrlTemas = urlTemas;
    }

    public String getNombreModulo() {
        return NombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        NombreModulo = nombreModulo;
    }
}
