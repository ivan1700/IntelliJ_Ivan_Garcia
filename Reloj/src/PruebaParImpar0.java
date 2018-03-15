import javax.swing.*;

public class PruebaParImpar0 {
    public static void main(String[] args) {

        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));
            JOptionPane.showMessageDialog(null, parImpar0.esPar(numero));
        }

        while (numero > parImpar0.NUMERO_FIN);
    }
}




