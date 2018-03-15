
public class jugadores {


    private String nombre;

    public jugadores(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString(){
        return nombre;
    }
}
