import javax.swing.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {
    Set<Contacto> Agenda=new HashSet<>();


    public void anyadirContacto(){
        String nombre= JOptionPane.showInputDialog(null,"Introduce el nombre del contacto");
        Agenda.add(new Contacto(nombre));
        System.out.println("Se ha añadido " + nombre + " a la agenda.");
    }

    public Contacto encontrarContacto(){
    Contacto c=(Contacto)JOptionPane.showInputDialog(null,"Contacto","Seleccione el contacto",JOptionPane.QUESTION_MESSAGE,null,Agenda.toArray(),null);
    return c;
    }

    public void borrarContacto(){
        Contacto c=encontrarContacto();
        Agenda.remove(c);
        System.out.println("Se ha borrado el contacto " + c);
    }
}

