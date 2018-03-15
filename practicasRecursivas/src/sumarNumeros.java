public class sumarNumeros {
    public static int sumarRecursivo(int numero){
        int resultado=0;

        if(numero==0){
            return numero;
        }
        resultado=sumarRecursivo(numero/10)+(numero%10);


        return resultado;
    }

    public static void main(String[] args) {
        int piticlin=654546846;

        System.out.println(sumarRecursivo(piticlin));
    }
}
