package punto_13;

public record Paciente(String nombre, int prioridad) implements Comparable<Paciente>{

    @Override
    public int compareTo(Paciente o) {
       return Integer.compare(o.prioridad,prioridad);
    }
}
