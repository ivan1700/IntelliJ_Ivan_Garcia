import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class PanelClientes {
    private JPanel panel;
    private JTextField insercionID;
    private JLabel nombre;
    private JLabel dni;
    private JLabel puntos;
    List<Cliente> clientes = new ArrayList<>();
    ListaClientes l =new ListaClientes();

    public PanelClientes(){
        this.panel= new JPanel();
        this.insercionID= new JTextField();
        this.nombre=new JLabel();
        this.dni=new JLabel();
        this.puntos=new JLabel();
        clientes = l.getClientes();
        System.out.println(clientes);
        CrearInterfaz();

    }

    private void CrearInterfaz() {
        panel.setLayout(new GridLayout(0,1));
        panel.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Cliente"));
        //InsercionID
        panel.add(insercionID);
        insercionID.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Pasa la tarjeta o introduce" +
                "el DNI"));

        insercionID.addKeyListener(new KeyAdapter() {
            String id="";
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c= e.getKeyChar();
                id+=c;
                System.out.println(id.length());
                if(id.length()==10){
                    SeleccionarCliente(id);
                    id="";
                }
            }
        });
        //Nombre
        panel.add(nombre);
        nombre.setText("Nombre: ");
        //DNI
        panel.add(dni);
        dni.setText("DNI: ");
        //puntos
        panel.add(puntos);
        puntos.setText("Puntos: ");

    }

    private void SeleccionarCliente(String id) {
        for (Cliente c:
             clientes) {
            if(c.getId().equals(id)){
                SeleccionarInfoCliente(c);
            }
        }
    }

    private void SeleccionarInfoCliente(Cliente c) {
        nombre.setText("Nombre: "+c.getNombre());
        dni.setText("DNI: "+c.getDni());
        puntos.setText("Puntos: "+c.getPuntos());
    }

    public JPanel getPanel(){
        return panel;
    }
}
