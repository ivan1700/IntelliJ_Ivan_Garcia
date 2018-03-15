import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;
import java.awt.*;


public class Multiplicaciones {


    public static int NUM_PREGUNTAS = 10;

    public static void main(String[] args) {

        int respuestasAcertadas = 0;

        for (int i = 0; i < NUM_PREGUNTAS; i++) {

            int numero = (int) (Math.random() * 10) + 1;
            int multiplicador = (int) (Math.random() * 10) + 1;
            int resultado = (numero * multiplicador);
            int numIntroducido = 0;
            String entrada = JOptionPane.showInputDialog(null, numero + " X " + multiplicador + " ? ");

            if (entrada == null) {

                int salirPrograma = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?", "¿Desea salir?", JOptionPane.YES_NO_OPTION);
                if (salirPrograma == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta el momento habías acertado "+ respuestasAcertadas+". \n Saliendo... ");
                    System.exit(0);
                }
            } else if (!entrada.equals("")) {
                numIntroducido = Integer.parseInt(entrada);
            }


            if (numIntroducido == resultado) {
                respuestasAcertadas++;
            }
            while (numIntroducido != resultado) {
                JOptionPane.showMessageDialog(null, "has fallado: Revisa la tabla: \n" +
                        +numero + " X " + 1 + " = " + numero + "\n"
                        + numero + " X " + 2 + " = " + numero * 2 + "\n"
                        + numero + " X " + 3 + " = " + numero * 3 + "\n"
                        + numero + " X " + 4 + " = " + numero * 4 + "\n"
                        + numero + " X " + 5 + " = " + numero * 5 + "\n"
                        + numero + " X " + 6 + " = " + numero * 6 + "\n"
                        + numero + " X " + 7 + " = " + numero * 7 + "\n"
                        + numero + " X " + 8 + " = " + numero * 8 + "\n"
                        + numero + " X " + 9 + " = " + numero * 9 + "\n"
                        + numero + " X " + 10 + " = " + numero * 10 + "\n");
                entrada = JOptionPane.showInputDialog(null, numero + " X " + multiplicador + " ? ");
            //Esto se repite. Preguntar al profesor.
                if (entrada == null) {

                    int salirPrograma = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?", "¿Desea salir?", JOptionPane.YES_NO_OPTION);
                    if (salirPrograma == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Hasta el momento habías acertado "+ respuestasAcertadas+". \n Saliendo... ");
                        System.exit(0);
                    }
                } else if (!entrada.equals("")) {
                    numIntroducido = Integer.parseInt(entrada);
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Has acertado a la primera: " + respuestasAcertadas);


    }
}




