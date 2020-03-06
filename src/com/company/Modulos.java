package com.company;

import java.util.ArrayList;

public class Modulos {

    private String NombreModulo;
    private String UrlModulo;
    private ArrayList<Temario> temarioModulo;

    public Modulos(String nombreModulo, String urlModulo) {
        NombreModulo = nombreModulo;
        UrlModulo = urlModulo;
        temarioModulo = new ArrayList();
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

    public ArrayList<Temario> getTemarioModulo() {
        return temarioModulo;
    }

    public void setTemarioModulo(ArrayList<Temario> temarioModulo) {
        this.temarioModulo = temarioModulo;
    }
    
    public void addTemario(Temario tema){
        temarioModulo.add(tema);
    }
}
