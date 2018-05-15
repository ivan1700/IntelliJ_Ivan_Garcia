import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class EntradasFicheroAleatorio implements EntradaArchivador {
    private static int CONTADOR = 0;
    private static int STITULO = 30;
    private static int SCONTENIDO = 50;
    private static int SPUNTUACION = 10;
    private static int SAUTOR = 30;
    private static int SALTO = 120;

    @Override
    public List<Entrada> leerDeArchivo(File f) {
        return null;
    }

    @Override
    public List<Entrada> anyadirEntrada(File f, List<Entrada> entradas, Entrada entrada) {

        entradas.add(entrada);
        for (Entrada e :
                entradas) {
            try (RandomAccessFile raf = new RandomAccessFile(f, "rw")) {
                raf.seek(CONTADOR * SALTO);
                raf.writeUTF(e.getTitulo());
                raf.seek((CONTADOR * SALTO) + STITULO);
                raf.writeUTF(e.getContenido());
                raf.seek((CONTADOR * SALTO) + STITULO + SCONTENIDO);
                raf.writeInt(e.getPuntuacion());
                raf.seek((CONTADOR * SALTO) + STITULO + SCONTENIDO + SPUNTUACION);
                raf.writeUTF(e.getAutor());
                raf.seek((CONTADOR * SALTO) + STITULO + SCONTENIDO + SPUNTUACION + SAUTOR);
                CONTADOR++;

            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return entradas;
    }

    @Override
    public List<Entrada> modificarEntrada(File f, List<Entrada> entradas, Entrada entrada) {
        return null;
    }

    @Override
    public String tipoArchivo() {
        return null;
    }
}
