import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelRegistraProducto {
    private JFrame frame;
    private JPanel panel;
    private JList lista;
    private JTextField nombre;
    private JTextField precio;
    private JList genero;
    private JList plataforma;
    private JTextField rutaImg;
    private JButton aceptar;
    private final String datosLista[]={"Videojuego","Periférico","Merchandising"};
    private Object tipoP;
    private Object tipoPl;
    private Object tipoG;
    private List<Producto> listaProductos;
    private Herramientas herramientas= new Herramientas();
    private PanelProductos pp=new PanelProductos();

    public PanelRegistraProducto() {
        this.frame = new JFrame("Crear producto");
        this.panel = new JPanel();
        this.lista = new JList(datosLista);
        this.nombre = new JTextField();
        this.precio = new JTextField();
        this.genero = new JList(Genero.values());
        this.plataforma = new JList(Plataforma.values());
        this.rutaImg=new JTextField();
        this.aceptar=new JButton("Crear Producto");
        this.listaProductos=pp.getProductos();
        CrearInterfaz();
    }

    private void CrearInterfaz() {
        //frame
        frame.add(panel);
        frame.setVisible(false);
        frame.setSize(400,700);
        frame.setLocationRelativeTo(null);
        //panel
        panel.setLayout(new GridLayout(0,1));
        panel.add(lista);
        panel.add(nombre);
        panel.add(precio);
        panel.add(genero);
        panel.add(plataforma);
        panel.add(rutaImg);
        panel.add(aceptar);
        //lista
        lista.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Seleccione el tipo de producto"));
        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(lista.getSelectedValue());
                tipoP =lista.getSelectedValue();
            }
        });
        //nombre
        nombre.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Nombre del producto"));
        //precio
        precio.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Precio del producto"));
        //genero
        genero.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Genero del videojuego"));
        genero.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tipoG=genero.getSelectedValue();
                System.out.println(genero.getSelectedValue());
            }
        });
        //plataforma
        plataforma.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Plataforma del videojuego/periférico"));
        plataforma.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tipoPl=plataforma.getSelectedValue();
                System.out.println(plataforma.getSelectedValue());
            }
        });
        //rutaImg
        rutaImg.setBorder(BorderFactory.createTitledBorder(new LineBorder(Color.GRAY),"Introduzca la ruta con su extensión de la imagen"));
        //aceptar
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pulsado"+tipoP+tipoG+tipoPl+nombre.getText()+precio.getText());
                agregarProducto();
                JOptionPane.showMessageDialog(null,"Producto creado con exito. Reinicia la aplicación para que surgan " +
                        "los cambios");
                nombre.setText("");
                precio.setText("");
                rutaImg.setText("");
                frame.setVisible(false);
            }
        });


    }

    private void agregarProducto() {
        if (tipoP.equals("Videojuego")){
            Videojuego v=new Videojuego(nombre.getText(),Double.parseDouble(precio.getText()),rutaImg.getText(),(Plataforma)tipoPl,(Genero)tipoG);
            listaProductos.add(v);
        }
        else if(tipoP.equals("Periférico")){
            Periferico p=new Periferico(nombre.getText(),Double.parseDouble(precio.getText()),rutaImg.getText(),(Plataforma)tipoPl);
            listaProductos.add(p);
        }
        else if(tipoP.equals("Merchandising")){
            Merchandising m= new Merchandising(nombre.getText(),Double.parseDouble(precio.getText()),rutaImg.getText());
            listaProductos.add(m);
        }
        herramientas.guardarProductosEnFicheros(listaProductos);
    }

    public void setVisible(){
        frame.setVisible(true);
        System.out.println(listaProductos);
    }
}
