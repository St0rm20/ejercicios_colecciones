package punto_1;

import java.util.TreeSet;

//La mala pa' Elkin

public class AdministradorProducto {

    TreeSet<Producto> productos = new TreeSet<>();

    public void crearProducto(String nombre, String codigo, double precio) {
        productos.add(new Producto(nombre,codigo,precio));
    }

    public Producto buscarProductoPorCodigo(String codigo){
        for( Producto producto: productos){
            if(producto.codigo().equals(codigo)){
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos(){
        productos.forEach(System.out::println);
    }

    public static void main(String[] args) {
        AdministradorProducto admin = new AdministradorProducto();
        admin.crearProducto("Producto 1", "001", 100);
        admin.crearProducto("Producto 2", "002", 200);
        admin.crearProducto("Producto 3", "003", 300);

        admin.mostrarProductos();

        System.out.println("Producto encontrado: " + admin.buscarProductoPorCodigo("002"));
    }
}
