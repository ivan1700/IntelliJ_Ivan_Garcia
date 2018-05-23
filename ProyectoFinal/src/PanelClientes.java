import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class PanelClientes {
    private JFrame nuevoUsuario;
    private JPanel panel;
    private JTextField insercionID;
    private JLabel nombre;
    private JLabel dni;
    private JLabel puntos;
    List<Cliente> clientes;
    ListaClientes l =new ListaClientes();
    PanelRegistrarCliente prg = new PanelRegistrarCliente();
    public PanelClientes(){

        this.nuevoUsuario=prg.getFrame();
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
                " el DNI"));

        insercionID.addKeyListener(new KeyAdapter() {
            String login ="";
            int letraDNI=8;
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                char c= e.getKeyChar();
                login +=c;
                System.out.println("longitud"+ login.length());
                try{
                    if(Character.isLetter(login.charAt(letraDNI))){
                        SeleccionarClientePorDNI(login);
                        insercionID.setText("");
                        login="";
                    }
                }catch (StringIndexOutOfBoundsException se){
                    System.out.println("El string aun no tiene la longitud requerida");
                }
                if(login.length()==10){
                    SeleccionarClientePorID(login);
                    insercionID.setText("");
                    login ="";
                }

            }
        });
        //Nombre
        panel.add(nombre);
        nombre.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Nombre"));
        //DNI
        panel.add(dni);

        dni.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"DNI e ID"));

        //puntos
        panel.add(puntos);

        puntos.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Puntos"));


    }


    private void SeleccionarClientePorDNI(String login) {
        for (Cliente c:
             clientes) {
            if(c.getDni().equalsIgnoreCase(login)){
                SeleccionarInfoCliente(c);
            }
        }
    }

    private void SeleccionarClientePorID(String id) {
        boolean encontrado=false;
        for (Cliente c:
             clientes) {
            if(c.getId().equals(id)){
                encontrado=true;
                SeleccionarInfoCliente(c);
            }

        }
        if(encontrado!=true){
            prg.CrearUsuario(clientes,id);
            clientes=l.getClientes();
            System.out.println(clientes);
        }
    }

    private void SeleccionarInfoCliente(Cliente c) {
        nombre.setText(c.getNombre());
        dni.setText("DNI:"+c.getDni()+"        ID:"+c.getId());
        puntos.setText(""+c.getPuntos());
    }

    public JPanel getPanel(){
        return panel;
    }

}
