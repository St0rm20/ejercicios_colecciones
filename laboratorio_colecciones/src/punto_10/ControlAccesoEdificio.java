package punto_10;

import java.util.HashSet;

public class ControlAccesoEdificio {

    HashSet <String> chambeadoresAutorizados = new HashSet<>();

    public void agregarEmpleado(String codigo){
        chambeadoresAutorizados.add(codigo);
    }

    public void quitarEmpleado(String codigo){
        chambeadoresAutorizados.remove(codigo);
    }

    public boolean verificarAcceso(String codigo){
        return chambeadoresAutorizados.contains(codigo);
    }

    public void mostrarEmpleados(){
        chambeadoresAutorizados.forEach(System.out::println);
    }

    public static void main(String[] args) {

        ControlAccesoEdificio control = new ControlAccesoEdificio();
        control.agregarEmpleado("001");
        control.agregarEmpleado("002");
        control.agregarEmpleado("003");
        control.agregarEmpleado("003");

        control.mostrarEmpleados();

        System.out.println("Acceso permitido: " + control.verificarAcceso("002"));
        System.out.println("Acceso permitido: " + control.verificarAcceso("004"));

        control.quitarEmpleado("002");
        control.mostrarEmpleados();
    }


}
