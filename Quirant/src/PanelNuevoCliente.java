import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelNuevoCliente {
    private JFrame frame;
    private JPanel panel;
    private JTextField nombre;
    private JTextField apellido0;
    private JTextField apellido1;
    private JTextField telefono;
    private JTextField direccion;
    private JButton crear;
    Herramientas herramientas=new Herramientas();
    PanelListaCliente plc=new PanelListaCliente();

    PanelNuevoCliente(){
        this.frame=new JFrame("Crear nuevo Cliente");
        this.panel=new JPanel();
        this.nombre=new JTextField();
        this.apellido0=new JTextField();
        this.apellido1=new JTextField();
        this.telefono=new JTextField();
        this.direccion=new JTextField();
        this.crear=new JButton("Crear Cliente");
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        frame.setLayout(new GridLayout(0,1,2,2));
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setVisible(false);
        //Insercion de ventanas
        frame.add(nombre);
        frame.add(apellido0);
        frame.add(apellido1);
        frame.add(telefono);
        frame.add(direccion);
        frame.add(crear);
        //bordes
        nombre.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Nombre del cliente"));
        apellido0.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"1ºApellido del cliente"));
        apellido1.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"2ºApellido del cliente"));
        telefono.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Teléfono del cliente"));
        direccion.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Dirección del cliente"));
        //action listener
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Falta arreglar cosas
                Cliente c =new Cliente(nombre.getText(),apellido0.getText(),apellido1.getText(),direccion.getText(),Integer.parseInt(telefono.getText()));
                System.out.println("Cliente creado"+nombre.getText()+apellido0.getText()+apellido1.getText()+direccion.getText()+Integer.parseInt(telefono.getText()));
                List<Cliente> lista =PanelCliente.getLista();
                lista.add(c);
                herramientas.guardarClientesEnFicheros(lista);
                PanelCliente.recargarLista(lista);
                plc.recargarLista();
            }
        });
    }

    public void setVisible(){
        frame.setVisible(true);
    }
}
