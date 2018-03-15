import java.util.ArrayList;
import java.util.List;

public class prueba {
    public static void main(String[] args) throws Exception {
        NotaMedia hola= new NotaMedia();
        NotaMediaProtegida hi= new NotaMediaProtegida();
        List<Double> parciales= new ArrayList<>();
        parciales.add(5.0);
        parciales.add(6.0);
        parciales.add(5.0);
        System.out.println(hola.nota(parciales));
        System.out.println(hi.nota(parciales));
    }
}
