import javax.swing.*;

public class pruebaMultiplicaciones {
    public static void main(String[] args) {
        int respuesta = 0;
        int correctaALaPrimera = 0;

        for (int i = 0; i < 10; i++) {
            JuegoMultiplicaciones j = new JuegoMultiplicaciones();
            String entrada = JOptionPane.showInputDialog(null, j.pregunta());

            //Pregunta para cuando se quiera salir del programa.
            if (entrada == null) {

                int salirPrograma = JOptionPane.showConfirmDialog(null, j.preguntaSalirPrograma(), "¿Desea salir?", JOptionPane.YES_NO_OPTION);
                if (salirPrograma == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta el momento habías acertado " + correctaALaPrimera + ". \n Saliendo del programa... ");
                    System.exit(0);
                }
            } else if (!entrada.equals("")) {
                respuesta = Integer.parseInt(entrada);
            }

            //Verifica si la respuesta es correcta
            if (respuesta == j.getResultado()) {
                correctaALaPrimera++;
            }
            while (respuesta != j.getResultado()) {
                JOptionPane.showMessageDialog(null, j.muestraTabla());
                entrada = JOptionPane.showInputDialog(null, j.pregunta());

                //Repeticion de pregunta para salir de programa
                if (entrada == null) {

                    int salirPrograma = JOptionPane.showConfirmDialog(null, j.preguntaSalirPrograma(), "¿Desea salir?", JOptionPane.YES_NO_OPTION);
                    if (salirPrograma == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Hasta el momento habías acertado " + correctaALaPrimera + ". \n Saliendo del programa... ");
                        System.exit(0);
                    }
                } else if (!entrada.equals("")) {
                    respuesta = Integer.parseInt(entrada);
                }
            }


        }
        JOptionPane.showMessageDialog(null, "Has acertado a la primera un total de : " + correctaALaPrimera + " veces.");
    }

}