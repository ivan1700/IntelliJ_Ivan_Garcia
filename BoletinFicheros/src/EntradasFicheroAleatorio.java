import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EntradasFicheroAleatorio implements EntradaArchivador {

    private static int STITULO = 30;
    private static int SCONTENIDO = 50;
    private static int SPUNTUACION = 10;
    private static int SAUTOR = 30;
    private static int SALTO = 120;

    @Override
    public List<Entrada> leerDeArchivo(File f) {
        List<Entrada>entradas =new ArrayList<>();
        try(RandomAccessFile raf=new RandomAccessFile(f,"r");) {
            int contador=0;
            while (true){
                raf.seek(contador * SALTO);
                String titulo=raf.readUTF();
                raf.seek((contador * SALTO) + STITULO);
                String contenido=raf.readUTF();
                raf.seek((contador * SALTO) + STITULO + SCONTENIDO);
                int puntuacion=raf.readInt();
                raf.seek((contador * SALTO) + STITULO + SCONTENIDO + SPUNTUACION);
                String autor=raf.readUTF();
                contador++;
                Entrada e=new Entrada(titulo,contenido,puntuacion,autor);
                entradas.add(e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entradas;
    }

    @Override
    public List<Entrada> anyadirEntrada(File f, List<Entrada> entradas, Entrada entrada) {

        entradas.add(entrada);
        try(RandomAccessFile raf = new RandomAccessFile(f,"rw")) {
            int contador=0;
            for(Entrada e : entradas){
                raf.seek(contador*SALTO);
                    raf.writeUTF(e.getTitulo());
                raf.seek((contador*SALTO)+STITULO);
                    raf.writeUTF(e.getContenido());
                raf.seek((contador*SALTO)+STITULO+SCONTENIDO);
                    raf.writeInt(e.getPuntuacion());
                raf.seek((contador*SALTO)+STITULO+SCONTENIDO+SPUNTUACION);
                    raf.writeUTF(e.getAutor());
                contador++;
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
        Entrada aBorrar = null;
        for (Entrada e:
             entradas) {
            if(e.getTitulo().equals(entrada.getTitulo())){
                aBorrar=e;
            }
        }
        entradas.remove(aBorrar);
        entradas.add(entrada);
        try(RandomAccessFile raf = new RandomAccessFile(f,"rw")) {
            int contador=0;
            for(Entrada e : entradas){
                raf.seek(contador*SALTO);
                raf.writeUTF(e.getTitulo());
                raf.seek((contador*SALTO)+STITULO);
                raf.writeUTF(e.getContenido());
                raf.seek((contador*SALTO)+STITULO+SCONTENIDO);
                raf.writeInt(e.getPuntuacion());
                raf.seek((contador*SALTO)+STITULO+SCONTENIDO+SPUNTUACION);
                raf.writeUTF(e.getAutor());
                contador++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (EOFException e){
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entradas;
    }

    @Override
    public String tipoArchivo() {
        return "Archivo aleatorio";
    }
}
