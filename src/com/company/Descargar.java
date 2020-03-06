package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Descargar implements Runnable {

    String link;
    String out;

    public Descargar(String link, String out) {
        this.link = link;
        this.out = out;
    }

    public void descargalo(){
        try{
            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            double fileSize = (double)http.getContentLengthLong();
            BufferedInputStream in = new BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(this.out);
            BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
            byte[] buffer = new byte[1024];
            double descargado = 0.00;
            int read = 0;
            double porcentajeDescargado=0.00;
            while ((read=in.read(buffer,0,1024))>=0){
                bout.write(buffer,0,read);
                descargado+=read;
                porcentajeDescargado = (descargado*100)/fileSize;
                String porcentaje = String.format("%.4f",porcentajeDescargado);
                System.out.println("Descargado: "+porcentaje+"% del archivo");
            }
            bout.close();
            in.close();
            System.out.println("Descarga completada");

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void run() {
        descargalo();
    }


}
