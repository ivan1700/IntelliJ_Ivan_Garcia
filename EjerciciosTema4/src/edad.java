import javax.swing.*;

public class edad {
    static final int NOTA_MINIMA= 5;
    static final int EDAD_MINIMA= 18;
    public static void main(String[] args) {

    String[]sexo ={"Varón","Mujer"};

    int nota=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cual es tu nota?"));
    int edad=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cual es tu edad?"));

    String preguntaVaronOMujer=(String)JOptionPane.showInputDialog(null,"¿Varón o Mujer?","Sexo",JOptionPane.QUESTION_MESSAGE,null,sexo,sexo[0]);

    if(nota>=NOTA_MINIMA){
       if(edad>=EDAD_MINIMA) {
            if(preguntaVaronOMujer.equals("Varón")){
                JOptionPane.showMessageDialog(null,"ACEPTADO","FELICIDADES",JOptionPane.INFORMATION_MESSAGE);
            }
           else if(preguntaVaronOMujer.equals("Mujer")){
                JOptionPane.showMessageDialog(null,"ACEPTADA","FELICIDADES",JOptionPane.INFORMATION_MESSAGE);
            }
       }
       else {
           JOptionPane.showMessageDialog(null,"No puedes pasar","EDAD MINIMA NO CUMPLIDA",JOptionPane.ERROR_MESSAGE);
       }

    }

    else {
        JOptionPane.showMessageDialog(null, "No puedes pasar", "NOTA MINIMA NO CUMPLIDA", JOptionPane.ERROR_MESSAGE);
    }


    }
}




