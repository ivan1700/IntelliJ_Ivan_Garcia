import javax.swing.*;
import java.util.*;

public class Agenda {
    Set<Contacto> Agenda = new HashSet<>();
    Utilidades Utilidades =new Utilidades();


    public void anyadirContacto() {
        String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del contacto");
        Agenda.add(new Contacto(nombre));
        System.out.println("Se ha añadido " + nombre + " a la agenda.");
    }

    public Contacto encontrarContacto() {
        Contacto c = (Contacto) JOptionPane.showInputDialog(null, "Seleccione el contacto", "Contacto",
                JOptionPane.QUESTION_MESSAGE, null, Agenda.toArray(), null);
        return c;
    }

    public void borrarContacto() {
        Contacto c = encontrarContacto();
        Agenda.remove(c);
        System.out.println("Se ha borrado el contacto " + c);
    }

    public void anyadirInfo() {
        Contacto c = encontrarContacto();
        c.anyadirInformacion(c);
    }

    public void verInfo() {
        Contacto c = encontrarContacto();
        JOptionPane.showMessageDialog(null, c.verInfo(c));
    }

    public String verInfoConcreta() {
        Map<Contacto, List<String>> auxiliar = new HashMap<>();
        String salida = "";
        String id = Contacto.seleccionarID();
        for (Contacto c : Agenda
                ) {
            if (c.getInfo().containsKey(id) == true) {
                salida += "Nombre: " + c.getNombre() + "\n" +
                        id + ": " + c.sacarDatosDeID(id) + "\n \n";
            }
        }
        JOptionPane.showMessageDialog(null, salida);
        return salida;
    }
}

