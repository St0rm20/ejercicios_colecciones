package punto_11;


import java.util.LinkedHashSet;

public class Spotify {
    LinkedHashSet<String> canciones = new LinkedHashSet<>();

    public void agregarCancion(String cancion){
        canciones.add(cancion);
    }

    public void eliminarCancion(String cancion){
        canciones.remove(cancion);
    }

    public void mostrarCanciones(){
        canciones.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        spotify.agregarCancion("Canción generica 1");
        spotify.agregarCancion("Tusa");
        spotify.agregarCancion("Tusa");
        spotify.agregarCancion("Canción generica 2");

        spotify.mostrarCanciones();
    }

}
