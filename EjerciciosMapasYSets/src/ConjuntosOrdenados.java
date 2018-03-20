//-     Declara y construye un conjunto ordenado (TreeSet) que almacene cadenas (String).
//        -     Introduce varias cadenas en el conjunto.
//        -     Realiza  un  recorrido  (for  each)  del  conjunto  y  comprueba  que  el  iterador  retorna los
//        elementos  ordenados  según  el  orden  lexicográfico  de  las  cadenas  (orden  alfabético).
//        Este    comportamiento    se    debe    a    que    las    cadenas    implementan    la    interfaz
//        Comparable<T>, es decir, tienen un orden natural.
//        -     Implementa  el  orden  natural  de  la  clase

import java.util.Set;
import java.util.TreeSet;

public class ConjuntosOrdenados implements Comparable {
    public static void main(String[] args) {
        Set<String> cadenas = new TreeSet<>();
        cadenas.add("Hola muy buenos días.");
        cadenas.add("Que tal está");
        cadenas.add("Muy bien gracias");
        for (String s:cadenas
             ) {
            System.out.println(s);
        }
        }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
