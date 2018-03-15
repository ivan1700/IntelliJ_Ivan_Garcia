import javax.swing.*;

public class pruebaTabla {
    public static void main(String[] args) {

        tablaMultiplicar tabla2 = new tablaMultiplicar(2);
        tablaMultiplicar tabla4 = new tablaMultiplicar(4);
        tablaMultiplicar tabla6 = new tablaMultiplicar(6);
        tablaMultiplicar tabla8 = new tablaMultiplicar(8);
        tablaMultiplicar tabla9 = new tablaMultiplicar(9);
        JOptionPane.showMessageDialog(null, tabla2.salida());
        JOptionPane.showMessageDialog(null, tabla4.salida());
        JOptionPane.showMessageDialog(null, tabla6.salida());
        JOptionPane.showMessageDialog(null, tabla8.salida());
        JOptionPane.showMessageDialog(null, tabla9.salida());

    }
}
