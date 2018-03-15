import javax.swing.*;

public class trianguloFloid {
    public static void main(String[] args) {
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));

        int fila = 1;
        String salida = " ";

        for (int i = 0; i < columna; i++) {
            for (int j = 0; j < i; j++) {

                salida += fila + " ";
                fila++;
            }

            salida += "\n";


        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
