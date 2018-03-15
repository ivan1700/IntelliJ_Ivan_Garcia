import javax.swing.*;

public class PotenciaDeDos {
    public static void main(String[] args) {
        int potencia;
        potencia=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una potencia"));
        for(int i=0;i<potencia;i++){
           int n=(int)Math .pow(2,i);
            System.out.println(n);


        }
    }
}

