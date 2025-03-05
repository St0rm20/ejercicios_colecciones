package punto_5;

import java.util.*;

public record Producto(String nombre, double precio) {
    public static void main(String[] args) {
        // HashMap: No garantiza orden, es mucho más rápido que los otros dos
        // se usa cuando el orden no importa y se necesita velocidad
        HashMap<Integer, Producto> hashMap = new HashMap<>();
        hashMap.put(3, new Producto("Laptop", 1200));
        hashMap.put(1, new Producto("Teléfono", 800));
        hashMap.put(2, new Producto("Monitor", 300));

        // LinkedHashMap: Mantiene el orden de inserción
        // es un poco más lento que el HashMap, pero vale la pena el ordenamiento
        // se usa cuando necesite mantener el orden de inserción
        LinkedHashMap<Integer, Producto> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, new Producto("Laptop", 1200));
        linkedHashMap.put(1, new Producto("Teléfono", 800));
        linkedHashMap.put(2, new Producto("Monitor", 300));

        // TreeMap: Ordena por clave, ascendente por defecto, es mucho
        // más lento que los otros dos
        // se usa cuando se necesita ordenar por clave
        TreeMap<Integer, Producto> treeMap = new TreeMap<>();
        treeMap.put(3, new Producto("Laptop", 1200));
        treeMap.put(1, new Producto("Teléfono", 800));
        treeMap.put(2, new Producto("Monitor", 300));

        System.out.println("HashMap:");
        hashMap.entrySet().forEach(System.out::println);

        System.out.println("\nLinkedHashMap:");
        linkedHashMap.entrySet().forEach(System.out::println);

        System.out.println("\nTreeMap:");
        treeMap.entrySet().forEach(System.out::println);
    }
}
