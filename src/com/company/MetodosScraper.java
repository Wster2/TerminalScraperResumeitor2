package com.company;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;

public class MetodosScraper {

    //Establece que navegador simulamos
    final String USER_AGENT ="Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36";


    //Comprueba si el elemento existe
    public void checkElement(String name, Element element){
        if(element==null)
            throw new RuntimeException(("Imposible encontrar "+ name));
    }


}
