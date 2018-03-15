import java.util.List;

public class NotaMediaProtegida implements Asignatura {
    @Override
    public double nota(List<Double> parciales) throws Exception {
            int contador=0;
            double totalNotas=0;
            double nota=0;
        for (int i = 0; i <parciales.size() ; i++) {
            if(nota<0.0||nota>10.0){
                throw new Exception("Nota invalida");
            }
            contador++;
            if(nota%2==0){
                totalNotas+=(nota*2);
            }else{
                totalNotas+=nota;
            }
        }
        return totalNotas/contador;
    }
}
