import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class principal {
    public static void main(String[] args) {

        List<Persona> listaPersonos=new ArrayList<>();


        listaPersonos.add(new Persona(23,"Ivan",true));
        listaPersonos.add(new Persona(23,"Alejandro",true));
        listaPersonos.add(new Persona(23,"Jesus",true));
        listaPersonos.add(new Persona(23,"Random",true));
        listaPersonos.add(new Persona(23,"hola",true));
        listaPersonos.add(new Enrique(23,"Enrique",false,9000));

        for (Persona p:listaPersonos
             ) {
            System.out.println(p.getNombre());
        }
    }


}
