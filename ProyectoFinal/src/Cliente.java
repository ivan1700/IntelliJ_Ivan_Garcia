public class Cliente {
    private final String nombre;
    private final String dni;
    private String id;
    private int puntos;

    public Cliente(String nombre,String dni,String id){
        this.nombre=nombre;
        this.dni=dni;
        this.id=id;
        this.puntos=0;
    }
    public Cliente(String nombre,String dni,String id,int puntos){
        this.nombre=nombre;
        this.dni=dni;
        this.id=id;
        this.puntos=puntos;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void gastarPuntos(){
        this.puntos=0;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
