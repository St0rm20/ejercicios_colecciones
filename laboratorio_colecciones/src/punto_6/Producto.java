package punto_6;

public record Producto (String codigo, String nombre, double precio, int cantidad)
        implements Comparable<Producto> {
    @Override
    public int compareTo(Producto o) {
        return this.nombre.compareTo(o.nombre());
    }
}
