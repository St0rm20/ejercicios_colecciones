package punto_4;

import java.util.PriorityQueue;


public record Tarea(int prioridad, String tarea) implements Comparable<Tarea> {
    @Override
    public int compareTo(Tarea o) {
        //Para Miguel del futuro
        //si pone la prioridad primero es ascendente
        //si pone la prioridad segundo es descendente
        return Integer.compare(o.prioridad,prioridad);
    }

    public static void main(String[] args) {
        PriorityQueue<Tarea> cola = new PriorityQueue<>();
        cola.add(new Tarea(3, "Tarea3 parte2"));
        cola.add(new Tarea(2, "Tarea2"));
        cola.add(new Tarea(3, "Tarea3"));
        cola.add(new Tarea(1, "Tarea1"));
        for(Tarea tarea : cola){
            System.out.println(tarea);
        }
    }
}
