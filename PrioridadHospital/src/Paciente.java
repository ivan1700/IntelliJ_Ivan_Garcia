public class Paciente {
    private final String nombre;
    private final Prioridad prioridad;

    public Paciente( String nombre, Prioridad prioridad){
        this.nombre=nombre;
        this.prioridad=prioridad;
    }

    public String getNombre(){
        return this.nombre;
    }


    public Prioridad getPrioridad() {
        return prioridad;
    }
}
