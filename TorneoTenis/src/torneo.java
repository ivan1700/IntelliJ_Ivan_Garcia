import jdk.nashorn.internal.scripts.JO;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class torneo {

    List<jugadores> jugadores =new ArrayList<>();
    List<jugadores> ganadores = new ArrayList<>();



    public int selectorNumJugadores(){
        int Numjugadores;
        List<String> jugadores=new ArrayList<>();
        jugadores.add("8");
        jugadores.add("16");
        Numjugadores= Integer.parseInt((String) JOptionPane.showInputDialog(null,"Selecciona el numero de jugadores","Selecciona",JOptionPane.DEFAULT_OPTION,null,jugadores.toArray(),jugadores.get(0)));
        return Numjugadores;
    }


    public int crearRondas(int numJugadores) {
        int rondas=numJugadores/2;
        return rondas;
    }

    public List<jugadores> anyadirJugadores(jugadores j){
        jugadores.add(j);
        return jugadores;
    }


    public jugadores elegirGanador(jugadores primero , jugadores segundo){
        List<jugadores> aux= new ArrayList<>();
        aux.add(primero);
        aux.add(segundo);

        System.out.println(aux);
        jugadores ganador= (jugadores)JOptionPane.showInputDialog(null,"Selecciona al ganador","Ganador",JOptionPane.DEFAULT_OPTION,null,aux.toArray(),aux.get(0));
        System.out.println("Ganador elegido");
        return ganador;
    }

    public List<jugadores> remplazarListas(List<jugadores> principal, List<jugadores> ganadores){
        principal.removeAll(principal);
        System.out.println("Jugadores borrados  " + principal);
        principal.addAll(ganadores);
        System.out.println("Se añaden los ganadores " + principal);
        ganadores.removeAll(ganadores);
        System.out.println("La lista de ganadores ha sido borrada "+ganadores);
        return principal;
    }


}
