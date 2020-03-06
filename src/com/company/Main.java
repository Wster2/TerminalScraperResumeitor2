package com.company;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        LoginToScrap ltc = new LoginToScrap();

        ArrayList<Modulos> modulos= ltc.almacenarTemarios();
        //  System.out.println("Cantidad de modulos: "+modulos.size());
         // for (Modulos m : modulos) {
         //     System.out.println("\t"+m.getNombreModulo()+"--->"+m.getUrlModulo());
         // }



    }
}
