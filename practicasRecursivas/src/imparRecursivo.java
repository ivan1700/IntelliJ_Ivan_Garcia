public class imparRecursivo {
    public static boolean imparRecursivo(int numero){
        if(numero==0){
            return false;
        }

        return parRecursivo(numero-1);


    }

    public static boolean parRecursivo(int numero){
        if (numero==0){
            return true;
        }
        return imparRecursivo(numero-1);
    }

    public static void main(String[] args) {
        System.out.println(parRecursivo(5));
    }
}
