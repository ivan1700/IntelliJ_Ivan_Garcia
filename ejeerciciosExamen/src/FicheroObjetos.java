import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FicheroObjetos {
    public static void main(String[] args) {
        List<meterGente> lista =new ArrayList<>();

        lista.add(new meterGente("ivan",1700));
        lista.add(new meterGente("hgola",1111));
        lista.add(new meterGente("fasfas",1222));
        lista.add(new meterGente("fasfsaf",1333));
        //Escritura
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos.ob"))) {
            try {

                oos.writeObject(lista);
            }catch (NotSerializableException e){
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Lectura
        List<meterGente> leidos=new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos.ob"))) {
            try{
                while(true){
                    leidos= (List<meterGente>) ois.readObject();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(leidos);
    }
}
