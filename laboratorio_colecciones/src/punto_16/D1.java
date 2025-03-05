package punto_16;

import java.util.LinkedHashMap;
import java.util.Map;

public class D1 {


        private LinkedHashMap<String, Double> carrito = new LinkedHashMap<>();

        public void agregarProducto(String nombre, double precio) {
            carrito.put(nombre, precio);
        }

        public void mostrarProductos() {

            for (Map.Entry<String, Double> producto : carrito.entrySet()) {
                System.out.println(" - " + producto.getKey() + ": $" + producto.getValue());
            }
        }

        public double calcularTotal() {
            double total = 0;
            for (Map.Entry<String, Double> producto : carrito.entrySet()) {
                total += producto.getValue();
            }
            return total;
        }

        public static void main(String[] args) {
            D1 compra = new D1();

            compra.agregarProducto("Leche", 1.50);
            compra.agregarProducto("Pan", 2.00);
            compra.agregarProducto("Huevos", 3.20);
            compra.agregarProducto("Arroz", 4.00);

            compra.mostrarProductos();

            System.out.println("\n Total de la compra: $" + compra.calcularTotal());
        }



}
