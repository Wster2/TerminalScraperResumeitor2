package com.company;

import java.util.ArrayList;

public class Modulos {

    private String NombreModulo;
    private String UrlModulo;
    private ArrayList<Temario> temarioModulo;
    private ArrayList<Pdf> pdfModulo;


    public Modulos(String nombreModulo, String urlModulo) {
        NombreModulo = nombreModulo;
        UrlModulo = urlModulo;
        temarioModulo = new ArrayList();
        pdfModulo = new ArrayList();
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

    public ArrayList<Pdf> getPdfModulo() {
        return pdfModulo;
    }

    public void setPdfModulo(ArrayList<Pdf> pdfModulo) {
        this.pdfModulo = pdfModulo;
    }

    public void addTemario(Temario tema){
        temarioModulo.add(tema);
    }

    public void addPdf(Pdf pdf){
        pdfModulo.add(pdf);
    }
}
