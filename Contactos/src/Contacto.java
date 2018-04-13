import javax.swing.*;
import java.util.List;
import java.util.Map;

public class Contacto {
    private  String nombre;
    private Map<String,List<String>> info;

    public Contacto(String nombre){
        this.nombre=nombre;
    }

    public Contacto(){};

    public String getNombre(){
        return this.nombre;

    }





}
