import javax.swing.*;
import java.util.*;

public class Contacto {
    private final String nombre;
    private Map<String,List<String>> info = new HashMap<>();
    static Set<String> listaDeIDs=new HashSet<>();

    public Contacto(String nombre){
        this.nombre=nombre;

    }


    public String getNombre(){
        return this.nombre;

    }

    public void setInfo(Map<String, List<String>> info) {
        this.info = info;
    }

    public Map<String, List<String>> getInfo() {
        return info;
    }

    public void anyadirInformacion(Contacto c){

        String id=JOptionPane.showInputDialog(null,"¿Que clase de información quieres introduir?");
        String informacion=JOptionPane.showInputDialog(null,"Introduce los datos de esa información");
        if(!c.info.containsKey(id)){
            c.info.put(id,new ArrayList<>());
            System.out.println("La key no existe " + id + " creada");
            listaDeIDs.add(id);
        }
        for (Map.Entry<String,List<String>> entrada
                :c.info.entrySet()){
            if(entrada.getKey().equals(id)){
                entrada.getValue().add(informacion);
                System.out.println("Key encontrada " + informacion + " añadida");
            }

        }

    }
    public String verInfo(Contacto c){
        String salida="";
        for (Map.Entry<String,List<String>>entrada:
                c.info.entrySet()){
            salida+=entrada.getKey() +":  "+entrada.getValue()+". \n";

        }
        return salida;
    }

    public static String seleccionarID(){
        String salida=(String)JOptionPane.showInputDialog(null,"Seleccione el contacto","Contacto",JOptionPane.QUESTION_MESSAGE,null,listaDeIDs.toArray(),null);
        return salida;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
