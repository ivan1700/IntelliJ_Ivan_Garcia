import java.util.ArrayList;
import java.util.Arrays;

public class boletinDiecinueve {
    public static ArrayList<Integer> nuevaArrayInvertida(ArrayList<Integer> a) {
        ArrayList<Integer> listaInvertida = new ArrayList<>();
        int numero = 0;
        int maximo = a.size() - 1;
        for (int i = maximo; i >= 0; i--) {

            numero = a.get(i);
            listaInvertida.add(numero);
        }

        return listaInvertida;
    }


    public static ArrayList<Integer> invertirArray(ArrayList<Integer> a) {
        int numero = 0;
        int maximo = a.size() - 1;
        int contador = 0;
        int otroNumero = 0;
        for (int i = maximo; i > maximo / 2; i--) {
            numero = a.get(i);
            otroNumero = a.get(contador);
            a.remove(i);
            a.add(i, otroNumero);
            a.remove(contador);
            a.add(contador, numero);
            contador++;

        }

        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(14);
        lista.add(454);
        lista.add(33);
        lista.add(34);
        lista.add(100);
        System.out.println(nuevaArrayInvertida(lista));
        System.out.println(invertirArray(lista));
    }


}
