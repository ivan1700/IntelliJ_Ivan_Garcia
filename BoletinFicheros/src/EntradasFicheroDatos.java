import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EntradasFicheroDatos implements EntradaArchivador {
    @Override
    public List<Entrada> leerDeArchivo(File f) {
        List<Entrada> salida = new ArrayList<>();
        try(DataInputStream dis = new DataInputStream(new FileInputStream(f))) {

            try {
                String titulo = dis.readUTF();
                while (true) {
                    Entrada e = new Entrada(titulo, dis.readUTF(), dis.readInt(), dis.readUTF());
                    System.out.println(e);
                    salida.add(e);
                }
            }catch (EOFException eofe){
                eofe.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException eofe){
            eofe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salida;
    }

    @Override
    public List<Entrada> anyadirEntrada(File f, List<Entrada> entradas, Entrada entrada) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f,true))) {
            dos.writeUTF(entrada.getTitulo());
            dos.writeUTF(entrada.getContenido());
            dos.writeInt(entrada.getPuntuacion());
            dos.writeUTF(entrada.getAutor());
            entradas.add(new Entrada(entrada.getTitulo(),entrada.getContenido(),entrada.getPuntuacion(),entrada.getAutor()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entradas;
    }

    @Override
    public List<Entrada> modificarEntrada(File f, List<Entrada> entradas, Entrada entrada) {
        return null;
    }

    @Override
    public String tipoArchivo() {
        return "Archivo de datos";
    }
}
