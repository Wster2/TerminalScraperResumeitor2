package com.company;

public class Temario {


    private String NombreTemas;
    private String UrlTemas;

    private String NombreModulo;

    public Temario(String nombreTemas, String urlTemas, String nombreModulo) {
        NombreTemas = nombreTemas;
        UrlTemas = urlTemas;
        NombreModulo = nombreModulo;
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
