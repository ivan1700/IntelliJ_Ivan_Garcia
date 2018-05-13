import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaPersonicas {
    static Personicas p = new Personicas();

    public static void main(String[] args) {
        p.anyadirALista("Ivan", 23, 'H');
        p.anyadirALista("Ines", 20, 'M');
        p.anyadirALista("Miguel", 19, 'H');
        p.anyadirALista("German", 30, 'H');
        //Escribir
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("listaPersonicas.txt"))) {
            for (Personicas ps:
                 p.lista) {
                bw.write(p.salida(ps));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //leer
        try(BufferedReader br = new BufferedReader(new FileReader("listaPersonicas.txt"))) {
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

