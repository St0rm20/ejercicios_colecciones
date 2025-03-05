package punto_6;

import java.util.Comparator;

public class ComparatorProductoCodigo implements Comparator<Producto> {
    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.codigo().compareTo(p2.codigo());
    }
}
