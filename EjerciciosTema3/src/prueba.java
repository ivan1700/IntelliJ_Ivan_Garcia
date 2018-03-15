import javax.swing.*;

public class prueba {
    public static void main(String[] args) {


        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Your Message", "Title on Box", dialogButton);
        if (dialogResult == 0) {
            System.out.println("Yes option");
        } else {
            System.out.println("No Option");
        }
    }
}
