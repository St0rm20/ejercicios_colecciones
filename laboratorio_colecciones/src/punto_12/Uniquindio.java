package punto_12;

import java.util.TreeSet;

public class Uniquindio {
    //pertinente, creativa e integradora

    private TreeSet<String> estudiantes = new TreeSet<>();

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public void quitarEstudiante(String nombre) {
        estudiantes.remove(nombre);
    }

    public void mostrarEstudiantes() {
        estudiantes.forEach(System.out::println);
    }

    public String obtenerPrimerEstudiante(){
        if(!estudiantes.isEmpty()) {
            return estudiantes.first();
        }return "No hay estudiantes";
    }

    public String obtenerUltimoEstudiante(){
        if(!estudiantes.isEmpty()){
            return estudiantes.last();
        }return "No hay estudiantes";
    }

    public static void main(String[] args) {
        Uniquindio universidad = new Uniquindio();

        universidad.agregarEstudiante("Jhanca");
        universidad.agregarEstudiante("Elkin");
        universidad.agregarEstudiante("Will");
        universidad.agregarEstudiante("Will");

        universidad.mostrarEstudiantes();

        System.out.println("\nPrimero estudiante:" + universidad.obtenerPrimerEstudiante());
        System.out.println("Ultimo estudiante: "+ universidad.obtenerUltimoEstudiante());
    }
}
