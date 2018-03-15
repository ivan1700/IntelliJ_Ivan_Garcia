import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class boletinVeintitres {
    

    public static ArrayList<Integer>unirYOrdenar(ArrayList<Integer> uno, ArrayList<Integer> dos){
        ArrayList<Integer>ordenada=new ArrayList<>();
        for (int n:uno
             ) {
            ordenada.add(n);
        }

        for (int n:dos
             ) {
            ordenada.add(n);   
        }
        Collections.sort(ordenada);
        System.out.println(ordenada);
        for (int i = 0; i <ordenada.size()-1 ; i++) {
            if(ordenada.get(i)==ordenada.get(i+1)){
                ordenada.remove(i);
            }
        }

    return ordenada;
    }



    public static void main(String[] args) {
        ArrayList<Integer> a1 =new ArrayList<>();
        ArrayList<Integer> a2 =new ArrayList<>();
        a1.add(-30);
        a1.add(13);
        a1.add(10);
        a1.add(13);

        a1.add(77);
        a2.add(0);
        a2.add(10);
        a2.add(20);
        a2.add(20);
        System.out.println(unirYOrdenar(a1, a2));
    }
}
