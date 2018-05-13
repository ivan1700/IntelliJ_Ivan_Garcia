import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EntradasFicheroTexto implements EntradaArchivador {
    @Override
    public List<Entrada> leerDeArchivo(File f) {
        List<Entrada>  entradas = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(f))) {
            String titulo="";
            while((titulo=br.readLine()) != null){
                Entrada e =new Entrada(titulo,br.readLine(),Integer.parseInt(br.readLine()),br.readLine());
                entradas.add(e);
            }
            return entradas;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Entrada> anyadirEntrada(File f, List<Entrada> entradas, Entrada entrada) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))) {
            bw.write(entrada.getTitulo());
                bw.newLine();
            bw.write(entrada.getContenido());
                bw.newLine();
            bw.write(""+entrada.getPuntuacion());
                bw.newLine();
            bw.write(entrada.getAutor());
                bw.newLine();
            entradas.add(new Entrada(entrada.getTitulo(),entrada.getContenido(),entrada.getPuntuacion(),entrada.getAutor()));
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
        return "Archivo de texto";
    }
}
