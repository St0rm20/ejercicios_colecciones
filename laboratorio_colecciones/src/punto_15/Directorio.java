package punto_15;


import java.util.HashMap;

public class Directorio {
    HashMap<String, String> directorioTelefonico = new HashMap<>();


    public void agregarContacto(String nombre, String telefono){
        directorioTelefonico.put(nombre, telefono);
    }

    public void eliminarContacto(String nombre){
        directorioTelefonico.remove(nombre);
    }

    public void buscarContacto(String nombre){
        System.out.println(directorioTelefonico.get(nombre));
    }

    public void mostrarContactos() {
        for (String nombre : directorioTelefonico.keySet()) {
            System.out.println("Nombre: " + nombre + " Teléfono: " + directorioTelefonico.get(nombre));
        }
    }


    public static void main(String[] args) {
        Directorio directorio = new Directorio();
        directorio.agregarContacto("Jhanca", "123456789");
        directorio.agregarContacto("Elkin", "987654321");
        directorio.agregarContacto("Will", "456789123");
        directorio.agregarContacto("Will", "456789123");

        directorio.mostrarContactos();

        System.out.println("Buscar a Jhanca");
        directorio.buscarContacto("Jhanca");
        System.out.println("Buscar a Will");
        directorio.buscarContacto("Will");

        directorio.eliminarContacto("Jhanca");
        System.out.println("Despues de eliminar a Jhanca");
        directorio.mostrarContactos();
    }
}
