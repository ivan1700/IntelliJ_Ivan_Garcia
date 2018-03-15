import javax.swing.*;

public class pruebaLinterna {
    public static void main(String[] args) {
        linterna torbjorn;
        torbjorn = new linterna("Torbjorn", "Vikinga", 4, 8, "Encendida", 5, 0);
        linterna ikea;
        ikea = new linterna("Ikea", "Strongen", 2, 3, "Apagada", 3, 0);
        JOptionPane.showMessageDialog(null, torbjorn.salida());

        torbjorn.setEstaEncendido("Apagada");
        JOptionPane.showMessageDialog(null, torbjorn.salida());

        torbjorn.setDescuento(1);
        JOptionPane.showMessageDialog(null, torbjorn.salida());

        JOptionPane.showMessageDialog(null,ikea.salida());
        ikea.setEstaEncendido("Encendida");
        JOptionPane.showMessageDialog(null,ikea.salida());

    }
}
