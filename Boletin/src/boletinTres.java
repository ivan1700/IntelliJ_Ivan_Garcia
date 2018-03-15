public class boletinTres {
    public static void main(String[] args) {
        try {
            String mensaje = null;

            if (mensaje.equals("piticlin")) throw new ME1("Error de ME1");
            throw new ME2("Error de ME2");
        } catch (NullPointerException nullPointer) {
            System.out.println("El mensaje está vacio");
        } catch (RuntimeException runtime) {
            System.out.println("Error durante la ejecución");
        } catch (ME2 mensaje2) {
            mensaje2.printStackTrace();
        } catch (ME1 mensaje1) {
            mensaje1.printStackTrace();
        } finally {
            System.out.println("finalizado");
        }

        try {

            int numero = 7 / 0;
            System.out.println(numero);
            if (numero == 0) throw new ME2("El número es 0");
        } catch (ArithmeticException arithmetic) {
            System.out.println("Error de calculo");
        } catch (ME2 mensaje2) {
            mensaje2.printStackTrace();
        } finally {
            System.out.println("finalizado");
        }
    }
}

