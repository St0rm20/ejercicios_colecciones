package punto_8;

import java.util.Vector;

public class EditorTexto {
    private Vector<String> historialCambios = new Vector<>();
    private String textoActual = "Texto vacío";

    public void realizarCambio(String nuevoTexto) {
        historialCambios.add(textoActual);
        textoActual = nuevoTexto;
    }


    public void deshacer() {
        if (!historialCambios.isEmpty()) {
            textoActual = historialCambios.remove(historialCambios.size() - 1);
        } else {
            System.out.println("No hay cambios para deshacer.");
        }
    }

    public void mostrarTexto() {
        System.out.println("Texto actual: " + textoActual);
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.realizarCambio("Jhanca en el texto");
        editor.mostrarTexto();

        editor.realizarCambio("Ya no hay Jhanca");
        editor.mostrarTexto();

        editor.deshacer();
        editor.mostrarTexto();

        editor.deshacer();
        editor.mostrarTexto();
    }
}

