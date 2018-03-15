import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class boletinVeintiuno {

public static ArrayList<String> unirYOrdenar(ArrayList<String>uno, ArrayList<String> dos){
    ArrayList<String> ordenada=new ArrayList<>();
    for (String l:uno
         ) {
        ordenada.add(l);
    }

    for (String l:dos
         ) {
        ordenada.add(l);
    }
    Collections.sort(ordenada);
    return ordenada;
}
    public static void main(String[] args) {
        ArrayList<String> unaCadena=new ArrayList<>();
        ArrayList<String> otraCadena=new ArrayList<>();
        unaCadena.add("a");
        unaCadena.add("e");
        unaCadena.add("i");
        unaCadena.add("o");
        unaCadena.add("u");
        otraCadena.add("d");
        otraCadena.add("m");
        otraCadena.add("y");
        otraCadena.add("z");
        System.out.println(unirYOrdenar(unaCadena, otraCadena));
    }
}
