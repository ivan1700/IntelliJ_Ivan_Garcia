import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class principal {
    private static torneo t;

    public static void main(String[] args) {
        t = new torneo();
        int numJugadores=t.selectorNumJugadores();
        int rondas=t.crearRondas(numJugadores);
        System.out.println("El numero de jugadores son: "+numJugadores+ "Y el numero de rondas son: "+rondas);

        for (int i = 0; i <numJugadores ; i++) {
            String nombre=JOptionPane.showInputDialog(null,"Introduzca el nombre del jugador");
            t.anyadirJugadores(new jugadores(nombre));
        }
        System.out.println("Los participantes serán: " + t.jugadores);

        //elegir ganador de cada partido
        for (int i = 0; i <rondas ; i++) {
            for (int j = 0; j <t.jugadores.size() ; j=j+2) {
                System.out.println(j);
                t.ganadores.add(t.elegirGanador(t.jugadores.get(j),t.jugadores.get(j+1)));
            }
            t.remplazarListas(t.jugadores,t.ganadores);
            System.out.println(t.jugadores);

            if(t.jugadores.size()==1){
                JOptionPane.showMessageDialog(null,"FIN DEL TORNEO! FELICIDADES! "+t.jugadores.get(0));
                break;
            }
        }

    }
}
