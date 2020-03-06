package com.company;

public class Pdf {

    private String nombrePDF;
    private String urlPDF;

    public Pdf(String nombrePDF, String urlPDF) {
        this.nombrePDF = nombrePDF;
        this.urlPDF = urlPDF;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public String getUrlPDF() {
        return urlPDF;
    }

    public void setUrlPDF(String urlPDF) {
        this.urlPDF = urlPDF;
    }
}
