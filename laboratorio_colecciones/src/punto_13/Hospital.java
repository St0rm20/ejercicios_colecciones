package punto_13;

import java.util.PriorityQueue;

public class Hospital {
    PriorityQueue<Paciente> pacientes = new PriorityQueue<>();

    public void agregarPaciente(String nombre, int prioridad){
        pacientes.add(new Paciente(nombre, prioridad));

    }

    public void atenderPacientes(){
        if(!pacientes.isEmpty()){
            System.out.println("Atendiendo a: "+ pacientes.poll());
        }
    }

    public void mostrarPacientes(){
        for(Paciente paciente : pacientes){
            System.out.println(paciente);
        }
    }


    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.agregarPaciente("Jhanca", 3);
        hospital.agregarPaciente("Jhanca2", 2);
        hospital.agregarPaciente("Jhanca3", 3);
        hospital.agregarPaciente("Jhanca4", 1);

        hospital.mostrarPacientes();

        hospital.atenderPacientes();
        hospital.mostrarPacientes();
    }

}
