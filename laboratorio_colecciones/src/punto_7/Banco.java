package punto_7;

import java.util.LinkedList;

public class Banco {
    private LinkedList<String> colaClientes = new LinkedList<>();

    public void agregarCliente(String nombre) {
        colaClientes.addLast(nombre);
    }

    public String atenderCliente() {
        if (!colaClientes.isEmpty()) {
            return "Atendiendo a: " + colaClientes.removeFirst();
        }
       return "No hay clientes en espera";
    }

    public void agregarClienteUrgente(String nombre) {
        colaClientes.addFirst(nombre);
    }

    public void mostrarCola() {
        System.out.println(colaClientes);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.agregarCliente("Jhanca");
        banco.agregarCliente("Jhanca2");
        banco.agregarCliente("Jhanca3");

        banco.mostrarCola();

        banco.agregarClienteUrgente("Jhanca Herido");
        banco.mostrarCola();

        System.out.println(banco.atenderCliente());
        banco.mostrarCola();
    }
}

