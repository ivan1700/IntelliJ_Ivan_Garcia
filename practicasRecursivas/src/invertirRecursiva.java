public class invertirRecursiva {
    public static int invertirRecursivo(int numero){
        int resultado=0;
        if(numero<10){
            return numero;
        }

        return (numero/10)+ invertirRecursivo(numero%10)*10;


    }

    public static void main(String[] args) {
        int piticlin=123;
        System.out.println(invertirRecursivo(piticlin));
    }
}
