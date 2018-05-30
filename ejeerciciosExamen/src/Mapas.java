import java.util.*;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(0,"Ivan");
        mapa.put(1,"Erik");
        mapa.put(2,"Juan");
        mapa.put(3,"Nuria");

        System.out.println(mapa.get(1));

        //todas las keys
        System.out.println(mapa.keySet());

        //Recorrer
        Set<Integer> llaves = mapa.keySet();
        System.out.println("HasMap");
        for (Integer i:llaves
             ) {
            String valor=mapa.get(i);
            System.out.println(valor);
        }

        //treeMap
        System.out.println();
        System.out.println("TreeMap");
        Map<Integer,String> TMapa =new TreeMap<>();
        TMapa.put(3,"Nuria");
        TMapa.put(1,"Erik");
        TMapa.put(2,"Juan");
        TMapa.put(0,"Ivan");

        Set<Integer> llaves0 = TMapa.keySet();
        for (Integer i :llaves0){
            System.out.println(i);
            System.out.println(TMapa.get(i));
        }

        System.out.println();
        System.out.println("Otra forma de recorrer");
        for (Map.Entry<Integer, String> numero :TMapa.entrySet()
                ) {
            int key = numero.getKey();
            String valor = numero.getValue();
            System.out.println(key + " " + valor);
        }

        Iterator<Map.Entry<Integer,String>> it= mapa.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> nombre = it.next();
            nombre.getKey();
            if (nombre.getKey()==2){
                nombre.setValue("Modificacion");
            }
        }

        Set<Integer> prueba = mapa.keySet();
        for (Integer i:
             prueba) {
            if(i==1){
                String nombre="hola";
                mapa.put(i,nombre);
            }
        }
        System.out.println(mapa);
    }
}
