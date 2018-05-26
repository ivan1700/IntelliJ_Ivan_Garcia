import java.util.*;

public class EjercicioMap {
    public static void main(String[] args) {
        Set<String> peliculas= new HashSet<>();

                peliculas.add("Star Wars - Un Jedi se pelea con el malo y le gana.");
        peliculas.add("La momia - Una momia egipcia revive pero es derrotada");
        peliculas.add("La momia - Una momia egipcia revive pero es derrotada");
        peliculas.add("La momia - Una momia egipcia revive pero es derrotada");
        peliculas.add("Wonder Woman - La historia de esa superheroina");
        peliculas.add("Alien - Una nave descubre un extraterreste malvado. Lo matan");
        peliculas.add("Cars - Coches animados corren en carreras");
        System.out.println(listado(peliculas, 3));
    }
public static Set<String> listado(Set<String> peliculas,int numero) {
    Set<String> salida = new TreeSet<>();
    Iterator it = peliculas.iterator();
    for (int i = 0; i < numero; i++) {
        salida.add((String)it.next());
    }

    return salida;
}}
