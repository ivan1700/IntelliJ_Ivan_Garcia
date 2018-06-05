import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class PanelClientes {
    private JFrame nuevoUsuario;
    private JPanel panel;
    private JTextField insercionID;
    private JLabel nombre;
    private JLabel dni;
    private static JLabel dniAux;
    private JLabel puntos;
    private JButton tarjetaPerdida;
    private List<Cliente> clientes;
    private Herramientas herramientas=new Herramientas();
    private PanelRegistrarCliente prc = new PanelRegistrarCliente();
    private PanelRenovarTarjeta prt =new PanelRenovarTarjeta();
    PanelRegistraProducto prp=new PanelRegistraProducto();
    private static final int DIVISION_DE_PUNTOS=100;



    public PanelClientes(){

        this.nuevoUsuario= prc.getFrame();
        this.panel= new JPanel();
        this.insercionID= new JTextField();
        this.nombre=new JLabel();
        this.dni=new JLabel();
        this.dniAux= new JLabel();
        this.puntos=new JLabel();
        this.tarjetaPerdida=new JButton();
        clientes = herramientas.LeerClientesDeFichero();

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
                login=BorrarCaracter(e,login);
                login=ComprobarSiEsLetraODigito(c,login);
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
                if (login.equals("add")){
                    prp.setVisible();
                    insercionID.setText("");
                    login="";
                }
            }
        });
        //Nombre
        panel.add(nombre);
        nombre.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Nombre"));
        //DNI
        panel.add(dni);
        dni.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"DNI"));
        //puntos
        panel.add(puntos);
        puntos.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Puntos"));

        //tarjeta perdida
        panel.add(tarjetaPerdida);
        tarjetaPerdida.setText("Tarjeta perdida");
        tarjetaPerdida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prt.setVisible();
                prt.pasarClientes(clientes);
                prt.devolverClientes();

            }
        });

    }

    /**
     * Comprueba si el caracter es letra o digito. Si no es así, no se le añade al String
     * @param c caracter que se introduce
     * @param login String donde se añade el caracter
     * @return login
     */
    private String ComprobarSiEsLetraODigito(char c, String login) {
        if(Character.isLetter(c) || Character.isDigit(c)){
            login +=c;
        }
        return login;
    }

    /**
     * Si la tecla que se introduce es el de borrado, elimina del string un caracter.
     * @param e tecla introducida
     * @param login String donde se borra el caracter
     * @return login
     */
    private String BorrarCaracter(KeyEvent e, String login) {
        if(e.getKeyChar()==8){

            int longitud=login.length();
            String aux="";
            for (int i = 0; i <longitud-1; i++) {
                char c =login.charAt(i);
                aux+=c;
            }
            login=aux;
        }
        return login;
    }

    /**
     * Busca entre toda la lista de clientes el cliente que tenga el DNI.
     * @param login DNI
     */
    private void SeleccionarClientePorDNI(String login) {
        for (Cliente c:
             clientes) {
            if(c.getDni().equalsIgnoreCase(login)){
                SeleccionarInfoCliente(c);
            }
        }
    }

    /**
     * Busca entre toda la lista de clientes el cliente que tenga el ID.
     * @param id ID
     */
    private void SeleccionarClientePorID(String id) {
        boolean encontrado=false;
        for (Cliente c:
             clientes) {
            if(c.getId().equals(id)){
                encontrado=true;
                SeleccionarInfoCliente(c);
            }

        }
        if(!encontrado){
            prc.CrearUsuario(clientes,id);
        }
    }

    /**
     * Selecciona del cliente su información y lo  muestra
     * @param c
     */
    private void SeleccionarInfoCliente(Cliente c) {
        System.out.println(c.getNombre());
        System.out.println(c.getDni());
        System.out.println(c.getPuntos());
        nombre.setText(c.getNombre());
        dni.setText(c.getDni());
        dniAux.setText(c.getDni());
        puntos.setText(String.valueOf(c.getPuntos()));
        System.out.println("AUXILIAR"+dniAux.getText());
    }

    public void comprar(int precio){
        for (Cliente c:
             clientes) {
            if(c.getDni().equals(dniAux.getText())){
                System.out.println("encontrado");
                System.out.println(c.getNombre());
                System.out.println(c.getPuntos());
                c.setPuntos(precio);
                herramientas.GuardarClientesEnFichero(clientes);
                //clientes=herramientas.LeerClientesDeFichero();
                puntos.setText(String.valueOf(c.getPuntos()));

                JOptionPane.showMessageDialog(null,"Compra realizada con exito\n " +
                        "Puntos ganados: "+ precio+"\n Puntos totales: "+c.getPuntos());
            }
        }
    }

    public void comprarPorPuntos(int precio){
        for (Cliente c:
             clientes) {
            if(c.getDni().equals(dniAux.getText())){
                System.out.println(c.getPuntos());
                int reduccion= convertirPuntos(c.getPuntos());
                System.out.println(reduccion);
                int total=precio-reduccion;
                String opciones[]={"Aceptar","Cancelar"};
                int elegido=JOptionPane.showOptionDialog(null,"Puntos ="+c.getPuntos()+" > "+reduccion+"€\n" +
                                "El producto se quedaría en :"+total+"€\n" +
                                "Desea pagar con puntos?","Comprar por puntos",1,1,null,
                        opciones,opciones[0]);
                if (elegido==0){
                    c.resetPuntos();
                    herramientas.GuardarClientesEnFichero(clientes);
                    JOptionPane.showMessageDialog(null,"Articulo comprado con exito, puntos reseteados a 0");
                }
            }
        }
    }

    private int convertirPuntos(int puntos) {
        return puntos/DIVISION_DE_PUNTOS;
    }


    public JPanel getPanel(){
        return panel;
    }

}
