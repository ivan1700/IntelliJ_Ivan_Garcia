import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personicas implements Serializable {
    private String nombre;
    private int edad;
    private char sexo;

    public Personicas(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }
    public Personicas(){}
    List<Personicas> lista= new ArrayList();

    public void anyadirALista(String nombre, int edad, char sexo){
        lista.add(new Personicas(nombre,edad,sexo));
    }

    @Override
    public String toString() {
        return nombre +" "+ edad +
                " " + sexo +
                "" +"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String salida(Personicas p){
        return p.getNombre()+" "+p.getEdad()+" "+p.getSexo();
    }

    public void mostrarLista(){
        for (Personicas p:lista) {
            System.out.println(salida(p));
        };
    }
}
