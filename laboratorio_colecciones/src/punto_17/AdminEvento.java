package punto_17;

import java.time.LocalDate;
import java.util.TreeMap;

public class AdminEvento {
    TreeMap<LocalDate, String> eventos = new TreeMap<>();

    public void agregarEvento(LocalDate fecha, String evento){
        eventos.put(fecha, evento);
    }

    public void mostrarEventos(){
        eventos.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    public void eliminarEvento(LocalDate fecha){
        eventos.remove(fecha);
    }

    public String obtenerProximoEvento(){
        return eventos.firstEntry().getValue();
    }

    public static void main(String[] args) {
        AdminEvento admin = new AdminEvento();
        admin.agregarEvento(LocalDate.of(2021, 10, 10), "Evento 1");
        admin.agregarEvento(LocalDate.of(2021, 10, 11), "Evento 2");
        admin.agregarEvento(LocalDate.of(2021, 10, 12), "Evento 3");
        admin.agregarEvento(LocalDate.of(2021, 10, 13), "Evento 4");

        admin.mostrarEventos();

        System.out.println("Proximo evento: " + admin.obtenerProximoEvento());

        admin.eliminarEvento(LocalDate.of(2021, 10, 12));
        admin.mostrarEventos();
    }
}
