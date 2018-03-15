public class sumaRecursiva {
    public static int sumaRecursiva(int numero){
        int resultado;
        if (numero==1){
            return 1;
        }
        resultado=numero+sumaRecursiva(numero-1);


        return resultado;


    }

    public static void main(String[] args) {
        int piticlin=10;

        System.out.println(sumaRecursiva(piticlin));
    }
}
