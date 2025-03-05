package punto_6;

import java.util.Comparator;

public class ComparatorProductoPrecio implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        return Double.compare(p1.precio(), p2.precio());
    }
}
