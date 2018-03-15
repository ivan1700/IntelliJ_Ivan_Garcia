import java.util.Iterator;
import java.util.List;

public class NotaMedia implements Asignatura {
    @Override
    public double nota(List<Double> parciales) throws Exception {
        double contador = 0;
        double totalNotas = 0;
        for (int i = 0; i <parciales.size() ; i++) {
            totalNotas+=parciales.get(i);
            contador++;
        }

        return totalNotas/contador;
    }
}
