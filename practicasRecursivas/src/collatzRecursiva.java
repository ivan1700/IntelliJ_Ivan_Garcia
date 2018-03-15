public class collatzRecursiva {
    public static int CollatzRecursivo(int numero) {

        if (numero == 1) {
            return 1;
        }
        if (numero % 2 == 0) {
            System.out.println("caso par" + numero);
            return numero = CollatzRecursivo(numero / 2);
        } else if (numero % 2 == 1) {
            System.out.println("caso IMPAR" + numero);
            return numero = CollatzRecursivo((numero * 3) + 1);

        }


        return numero;
    }

    public static void main(String[] args) {

        int piticlin = 18;
        System.out.println("fin" + CollatzRecursivo(piticlin));
    }
}
