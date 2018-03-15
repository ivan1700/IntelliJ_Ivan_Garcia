import java.util.ArrayList;

public class boletinVeinte {

    public static boolean comprobarOrdenCreciente(ArrayList<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > a.get(i + 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(100);
        System.out.println(comprobarOrdenCreciente(lista));
    }
}
