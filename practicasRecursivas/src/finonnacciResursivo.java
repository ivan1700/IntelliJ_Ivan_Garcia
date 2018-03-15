public class finonnacciResursivo {
    public static int finnaciRecursivo(int numero){
        int resultado=0;

        if(numero==1 || numero==2){
            return 1;
        }
        resultado=finnaciRecursivo(numero-1)+finnaciRecursivo(numero-2);


        System.out.println(resultado);
        return resultado;

    }

    public static void main(String[] args) {
        int piticlin=10;

        System.out.println("El final de "+piticlin+"es: "+finnaciRecursivo(piticlin));
    }
}
