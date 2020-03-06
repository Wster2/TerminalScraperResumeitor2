package com.company;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class LoginToScrap extends MetodosScraper{

    private final URL direccionLogin;
    private URLConnection conexionLogin;
    private String userName;
    private String userPass;


    public LoginToScrap() throws IOException {
        direccionLogin= new URL("https://ead.murciaeduca.es/my/");
        conexionLogin =  direccionLogin.openConnection();
        userName ="4054645";
        userPass="luismi123";
    }

    /*Este metodo nos logea y nos devuelve una conexion
     */
    public Connection.Response ScrapLogin() throws IOException {

        Connection.Response logingFromResponse  = Jsoup.connect(direccionLogin.toString())
                .method(Connection.Method.GET)
                .userAgent(USER_AGENT)
                .execute();

        FormElement loginFrom = (FormElement)logingFromResponse.parse()
                .select("form#login").first();

        //Comrpueba que existe el formulario  indicado
        checkElement("Login Form",loginFrom);

        //Introduce el usuario
        Element loginField = loginFrom.select("#username").first();
        checkElement("Login Field", loginField);
        loginField.val(userName);

        //Introduce la contraseña
        Element passwordField = loginFrom.select("#password").first();
        checkElement("Password Field",passwordField);
        passwordField.val(userPass);

        //realiza la conexion
        Connection.Response loginActionResponse = loginFrom.submit()
                .cookies(logingFromResponse.cookies())
                .userAgent(USER_AGENT)
                .execute();

        //Devuelve la conexion
        return loginActionResponse;
    }

    public Connection.Response ScrapLogin(String url) throws IOException {

        Connection.Response logingFromResponse  = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .userAgent(USER_AGENT)
                .execute();

        FormElement loginFrom = (FormElement)logingFromResponse.parse()
                .select("form#login").first();

        //Comrpueba que existe el formulario  indicado
        checkElement("Login Form",loginFrom);

        //Introduce el usuario
        Element loginField = loginFrom.select("#username").first();
        checkElement("Login Field", loginField);
        loginField.val(userName);

        //Introduce la contraseña
        Element passwordField = loginFrom.select("#password").first();
        checkElement("Password Field",passwordField);
        passwordField.val(userPass);

        //realiza la conexion
        Connection.Response loginActionResponse = loginFrom.submit()
                .cookies(logingFromResponse.cookies())
                .userAgent(USER_AGENT)
                .execute();

        //Devuelve la conexion
        return loginActionResponse;
    }

    public ArrayList almacenarModulos() throws IOException {
        ArrayList<Modulos> modulos = new ArrayList();

        String cssQuery ="div.dropdown-menu ul li a";

        for (Element e: ScrapLogin().parse().select(cssQuery) ) {
                if((!e.attr("title").equals("Área personal"))
                    &&(!"https://ead.murciaeduca.es/my/index.php?lang=en".equals(e.attr("abs:href")))
                    &&(!"https://ead.murciaeduca.es/my/index.php?lang=es".equals(e.attr("abs:href")))
                    &&(!"https://ead.murciaeduca.es/my/index.php".equals(e.attr("abs:href")))
                    &&(!"https://ead.murciaeduca.es/course/view.php?id=2328".equals(e.attr("abs:href")))
                    &&(!"https://ead.murciaeduca.es/course/view.php?id=2327".equals(e.attr("abs:href")))
                    &&(!"https://ead.murciaeduca.es/course/view.php?id=2269".equals(e.attr("abs:href")))
                    ) {
                    String urlModulo = e.attr("abs:href");
                    String descripcionModulo = e.text();
                    modulos.add(new Modulos(descripcionModulo, urlModulo));
                }
        }
        return modulos;
    }

    public Connection.Response irATemarios(String url) throws IOException {

        String cssQuery = ".navbar .navbar-inner .dropdown-menu li>a";
        String urlRecursos=null;

        for (Element e: ScrapLogin(url).parse().select(cssQuery) ) {
            if (e.text().equals("Recursos")) {
                urlRecursos = e.attr("abs:href");
                String descripcionRecursos = e.text();
                //System.out.println(urlRecursos);
                //System.out.println(descripcionRecursos);
            }
        }

        return ScrapLogin(urlRecursos);
    }

    public ArrayList<Modulos> almacenarTemarios() throws IOException {

        String cssQuery ="table tr td.cell.c1 a";

        ArrayList<Modulos> modulos = almacenarModulos();
        for (int i = 0; i <modulos.size() ; i++) {
         // System.out.println();
         // System.out.println("Modulo:");
            Modulos modulo =modulos.get(i);
        // System.out.println(modulo.getNombreModulo());
        // System.out.println(modulo.getUrlModulo());

            for (Element e: irATemarios(modulo.getUrlModulo()).parse().select(cssQuery) ){
                //Muestra por consola todos los elementos en cuya descripcion aparezca la palabra "Completa"
                // o en cuya ruta de imagen contenga la palabra pdf
                if(e.text().contains("Completa")||e.select("img").attr("src").contains("pdf")) {
                    String urlTemario = e.attr("abs:href");
                    String descripcionTemario = e.text();
              //   System.out.println("\t"+descripcionTemario);
              //   System.out.println("\t"+urlTemario);
                    if(e.text().contains("Completa")) {
                        modulos.get(i).addTemario(new Temario(descripcionTemario, urlTemario, modulos.get(i).getNombreModulo()));
                    }
                    if(e.select("img").attr("src").contains("pdf")){
                        modulos.get(i).addPdf(new Pdf (descripcionTemario,urlTemario));
                    }
                }
            }
        }
        System.out.println("Finalizado la lista actualizada");
        return modulos;
    }

}
