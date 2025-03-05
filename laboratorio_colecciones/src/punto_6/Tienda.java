package punto_6;

import java.util.ArrayList;
import java.util.Collections;

public class Tienda {
    private final ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(String codigo, String nombre, double precio, int cantidad) {
        productos.add(new Producto(codigo, nombre, precio, cantidad));
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(producto -> producto.codigo().equals(codigo));
    }

    public void eliminarProductosAgotados() {
        productos.removeIf(producto -> producto.cantidad() == 0);
    }

    public ArrayList<Producto> listarProductosPorNombre() {
        ArrayList<Producto> listaOrdenada = new ArrayList<>(productos);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public ArrayList<Producto> listarProductosPorPrecio() {
        ArrayList<Producto> listaOrdenada = new ArrayList<>(productos);
        listaOrdenada.sort(new ComparatorProductoPrecio());
        return listaOrdenada;
    }

    public ArrayList<Producto> listarProductosPorCodigo() {
        ArrayList<Producto> listaOrdenada = new ArrayList<>(productos);
        listaOrdenada.sort(new ComparatorProductoCodigo());
        return listaOrdenada;
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.agregarProducto("002", "Producto 2", 300, 10);
        tienda.agregarProducto("001", "Producto 1", 100, 0);
        tienda.agregarProducto("003", "Producto 3", 200, 5);

        System.out.println("Listado de productos (orden por nombre)");
        tienda.listarProductosPorNombre().forEach(System.out::println);

        tienda.eliminarProductosAgotados();
        System.out.println("Listado de productos sin el agotado");
        tienda.listarProductosPorNombre().forEach(System.out::println);

        tienda.agregarProducto("004", "Producto 4", 100, 3);

        System.out.println("Listado productos por precio");
        tienda.listarProductosPorPrecio().forEach(System.out::println);

        System.out.println("Listado productos por código");
        tienda.listarProductosPorCodigo().forEach(System.out::println);
    }
}
