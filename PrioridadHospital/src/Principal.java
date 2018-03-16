import javax.swing.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Principal {

    private final static int NUEVO_PACIENTE=0;
    private final static int ATENDER=1;
    private final static int SALIR=-1;

    public static void main(String[] args) {
        PriorityQueue<Paciente> urgencias= new PriorityQueue<>(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente o1, Paciente o2) {
                return o1.getPrioridad().getPrioridad()-o2.getPrioridad().getPrioridad();
            }
        });

        int botonIntroducido;

        do{
            botonIntroducido = JOptionPane.showOptionDialog(null,"Escoga una opción","Principal",0,0,null,BotonesMenu.values(),BotonesMenu.ATENDER_PACIENTE);
            System.out.println(botonIntroducido);
            switch (botonIntroducido){
                case NUEVO_PACIENTE:
                    String nombre= JOptionPane.showInputDialog(null,"Introduzca nombre del paciente");
                    Prioridad prioridad= (Prioridad) JOptionPane.showInputDialog(null, "Dolencia", "Indique el nivel de dolencia", JOptionPane.QUESTION_MESSAGE, null, Prioridad.values(), Prioridad.DOLOR_DE_CABEZA);
                    urgencias.add(new Paciente(nombre,prioridad));
                    continue;
                case ATENDER:JOptionPane.showMessageDialog(null,"A sido atendido " + urgencias.poll().getNombre());
                continue;
            }


        }while(botonIntroducido!=SALIR);

    }


}
