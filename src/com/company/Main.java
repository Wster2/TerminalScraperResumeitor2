package com.company;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        LoginToScrap ltc = new LoginToScrap();

      ArrayList<Modulos> modulos= ltc.almacenarTemarios();
   //
   //   System.out.println("Cantidad de modulos: "+modulos.size());
   //   System.out.println();
   //   for (Modulos m : modulos) {
   //       System.out.println();
   //       System.out.println("\t"+m.getNombreModulo()+"--->"+m.getUrlModulo());
   //       for (int i = 0; i <m.getTemarioModulo().size() ; i++) {
   //           System.out.println("\t\t\t|->"+
   //                   m.getTemarioModulo().get(i).getNombreTemas()
   //           +"----->" +m.getTemarioModulo().get(i).getUrlTemas());;
   //       }
   //       for (int i = 0; i <m.getPdfModulo().size() ; i++) {
   //           System.out.println("\t\t\t|->"+
   //                   m.getPdfModulo().get(i).getNombrePDF()
   //                           +"----->" +m.getPdfModulo().get(i).getUrlPDF());;
   //       }
   //   }

        File file = new File("");
        new Descargar(modulos.get(0).getTemarioModulo().get(0).getUrlTemas(),file.getAbsolutePath()).descargalo();
    }
}
