package punto_9;

import java.util.ArrayDeque;
import java.util.Stack;

/*
Abrir el link del video, explicación de la solución
 */
public class Web {
    ArrayDeque<String> historial = new ArrayDeque<>();

    public void visitar(String url){
        historial.push(url);
    }

    public String retroceder(){
        if (historial.size() == 1){
            return "No hay más páginas para retroceder";
        }
        return historial.pop();
    }

    public String mostrarActual(){
        return historial.peek();
    }

    public static void main(String[] args) {
        Web web = new Web();
        web.visitar("www.Jhanca.com");
        web.visitar("https://youtu.be/dQw4w9WgXcQt=1");
        web.visitar("www.YaMeAburriDeNombrarEstasCosas.com");

        System.out.println("Actual: " + web.mostrarActual());
        System.out.println("Retroceder: " + web.retroceder());
        System.out.println("Actual, abrir: " + web.mostrarActual());
        System.out.println("Retroceder: " + web.retroceder());
        System.out.println("Actual: " + web.mostrarActual());
    }

}
