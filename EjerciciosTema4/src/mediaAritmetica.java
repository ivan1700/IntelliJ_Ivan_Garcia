

import javax.swing.*;

public class mediaAritmetica {
    public static int NUMERO_MAX_ARITMETICA = 30;

    public static void main(String[] args) {
        int numero = 0;
        int acumulador = 0;
        for (int i = 0; i < NUMERO_MAX_ARITMETICA; i++) {
            numero = i + 1;
            acumulador += numero;
            System.out.println(numero);


        }
        JOptionPane.showMessageDialog(null, "La media aritmetica de: " + numero + "es: " + (double) acumulador / NUMERO_MAX_ARITMETICA);
    }
}
