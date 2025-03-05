package punto_1;

//La mala pa' Elkin

public record Producto(String nombre,String codigo,  double precio) implements Comparable<Producto> {
    @Override
    public int compareTo(Producto otro) {
        return this.codigo.compareTo(otro.codigo);
    }

}