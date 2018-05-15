import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EntradasFicheroObjetos implements EntradaArchivador {
    @Override
    public List<Entrada> leerDeArchivo(File f) {
        List<Entrada> salida =new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            try {
                salida=(List)ois.readObject();
            }catch (NotSerializableException nse){
                nse.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return salida;
    }

    @Override
    public List<Entrada> anyadirEntrada(File f, List<Entrada> entradas, Entrada entrada) {
        entradas.add(entrada);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            try{
                oos.writeObject(entradas);
            }catch (NotSerializableException nse){
                nse.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entradas;
    }

    @Override
    public List<Entrada> modificarEntrada(File f, List<Entrada> entradas, Entrada entrada) {
        Entrada aBorrar=null;
        for (Entrada e:
             entradas) {
            if(e.getTitulo().equals(entrada.getTitulo())){
                aBorrar=e;
            }
        }
        entradas.remove(aBorrar);
        entradas.add(entrada);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
            oos.writeObject(entradas);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entradas;
    }

    @Override
    public String tipoArchivo() {
        return "Archivo de objetos";
    }
}
