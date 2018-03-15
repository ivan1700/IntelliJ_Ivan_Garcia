public class factorialRecursivo {
    public static int factorialRecursivo(int numero){
        int resultado=0;
        if(numero==1){
            return 1;
        }
        resultado=numero*factorialRecursivo(numero-1);
        System.out.println(resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int piticlin=5;

        System.out.println("El factorial de "+piticlin+ "es : " +factorialRecursivo(piticlin));
    }
}
