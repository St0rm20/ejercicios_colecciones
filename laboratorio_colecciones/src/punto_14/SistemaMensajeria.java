package punto_14;

import java.util.ArrayDeque;

public class SistemaMensajeria {
    ArrayDeque<String> historial = new ArrayDeque<>();


    public void enviarMensaje(String mensaje) {
        if (historial.size() >= 10) {
            historial.pollFirst();
        }
        historial.offerLast(mensaje);
    }

    public void mostrarHistorial() {
        historial.forEach(System.out::println);
    }

    public static void main(String[] args) {
        SistemaMensajeria sistema = new SistemaMensajeria();

        sistema.enviarMensaje("Mensaje 1");
        sistema.enviarMensaje("Mensaje 2");
        sistema.enviarMensaje("Mensaje 3");
        sistema.enviarMensaje("Mensaje 4");
        sistema.enviarMensaje("Mensaje 5");
        sistema.enviarMensaje("Mensaje 6");
        sistema.enviarMensaje("Mensaje 7");
        sistema.enviarMensaje("Mensaje 8");
        sistema.enviarMensaje("Mensaje 9");
        sistema.enviarMensaje("Mensaje 10");
        sistema.enviarMensaje("Mensaje 11");

        sistema.mostrarHistorial();
    }
}
