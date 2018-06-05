import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Herramientas {
    public void guardarClientesEnFicheros(List<Cliente> lista){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("productos.ob"))) {
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
    public  List<Cliente> leerClientesDeFichero(){
        List<Cliente> salida = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productos.ob"))) {
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
