import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Herramientas implements Serializable{
    public static void guardarClientesEnFicheros(List<Cliente> lista){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clientesQuirant.cl"))) {
            try{
                oos.writeObject(lista);
            }catch (NotSerializableException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee los productos del archivo
     * @return lista de los prodcutos disponibles
     */
    public static  List<Cliente> leerClientesDeFichero(){
        List<Cliente> salida = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("clientesQuirant.cl"))) {
            try{
                salida= (List<Cliente>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salida;
    }
}
