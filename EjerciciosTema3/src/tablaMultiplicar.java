public class tablaMultiplicar {
    private int numero;


    public static final int POR_1 = 1;
    public static final int POR_2 = 2;
    public static final int POR_3 = 3;
    public static final int POR_4 = 4;
    public static final int POR_5 = 5;
    public static final int POR_6 = 6;
    public static final int POR_7 = 7;
    public static final int POR_8 = 8;
    public static final int POR_9 = 9;
    public static final int POR_10 = 10;


    public tablaMultiplicar(int numero) {
        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }

    public String salida() {
        String salida = "La tabla de multiplicar de: " + getNumero() + " es...\n"
                + getNumero() + " * " + POR_1 + " = " + getNumero() * POR_1 + "\n"
                + getNumero() + " * " + POR_2 + " = " + getNumero() * POR_2 + "\n"
                + getNumero() + " * " + POR_3 + " = " + getNumero() * POR_3 + "\n"
                + getNumero() + " * " + POR_4 + " = " + getNumero() * POR_4 + "\n"
                + getNumero() + " * " + POR_5 + " = " + getNumero() * POR_5 + "\n"
                + getNumero() + " * " + POR_6 + " = " + getNumero() * POR_6 + "\n"
                + getNumero() + " * " + POR_7 + " = " + getNumero() * POR_7 + "\n"
                + getNumero() + " * " + POR_8 + " = " + getNumero() * POR_8 + "\n"
                + getNumero() + " * " + POR_9 + " = " + getNumero() * POR_9 + "\n"
                + getNumero() + " * " + POR_10 + " = " + getNumero() * POR_10 + "\n";

        return salida;
    }
}
