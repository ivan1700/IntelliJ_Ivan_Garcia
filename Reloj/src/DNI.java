/*
11. Hacer un programa  que dado un número de DNI obtenga la letra del NIF. La letra correspondiente a un número de DNI se calcula mediante el siguiente algoritmo.
Se obtiene el resto de dividir el número de DNI entre 23. El número resultante nos indica la posición de la letra correspondiente a ese DNI, en la siguiente cadena:

Tabla de asignación
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
T R W A G M Y F P D X B N J Z S Q V H L C K E
No se utilizan las letras: I, Ñ, O, U.
La I y la O se evitan para evitar confusiones con otros caracteres, como 1, l ó 0. */


import javax.swing.*;

/**
 * @version 11/02/2017-1
 * @Author Iván García Belén
 * @see DNI
 */


public class DNI {

    public static final int ALGORITMO_DNI = 23;

    public static void main(String[] args) {

        int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca los 8 números del DNI"));
        char[] ordenLetra = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int pasoALetra = dni % ALGORITMO_DNI;
        char letra = ordenLetra[pasoALetra];

        JOptionPane.showMessageDialog(null, "Tu DNI: " + dni + "Tiene la letra: " + letra);
    }
}
