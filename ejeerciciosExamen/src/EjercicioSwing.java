import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class EjercicioSwing {
    static JFrame ventana=new JFrame("Examen");
    static JTextField id=new JTextField(5);
    static JTextField nombre=new JTextField(20);
    static JTextField posicion=new JTextField(5);
    static JButton mostrar=new JButton("Mostrar posición");
    public static void main(String[] args) {

        List<meterGente> lista =new ArrayList<>();
    try(RandomAccessFile raf=new RandomAccessFile("datos.dat","r")) {
        int contador=0;
        int salto=20;
        while (true){
            raf.seek(contador*salto);
                String nombre=raf.readUTF();
            raf.seek((contador*salto)+16);
                int id=raf.readInt();
            contador++;
            meterGente g =new meterGente(nombre,id);
            lista.add(g);
        }
    }catch (EOFException e){
        e.printStackTrace();
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println(lista);
        ventana.setLayout(new GridLayout(0,2));
        ventana.add(new JLabel("ID: "));
        ventana.add(id);
        ventana.add(new JLabel("Nombre:"));
        ventana.add(nombre);
        ventana.add(new JLabel("Posición a mostrar"));
        ventana.add(posicion);
        ventana.add(mostrar);
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                meterGente hola=lista.get(Integer.parseInt(posicion.getText()));
                nombre.setText(hola.getNombre());
                id.setText(String.valueOf(hola.getId()));


            }
        });
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}

