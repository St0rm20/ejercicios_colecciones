package punto_3;


import java.util.Iterator;
import java.util.LinkedHashSet;

//de verdad lee esto?
public class Punto3 {
    public static void main(String[] args) {
        LinkedHashSet<String> elementos = new LinkedHashSet<>();
        elementos.add("Elemento1");
        elementos.add("Elemento2");
        elementos.add("Elemento3");

        Iterator<String> i = elementos.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

}
