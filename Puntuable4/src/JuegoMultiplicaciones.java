public class JuegoMultiplicaciones {

    private int numero = (int) (Math.random() * 10) + 1;
    private int multiplicador = (int) (Math.random() * 10) + 1;
    private int resultado = (numero * multiplicador);


    public JuegoMultiplicaciones() {
    }

    public int getResultado() {
        return resultado;
    }


    public String pregunta() {

        return "¿ " + this.numero + " X " + this.multiplicador + " ?";
    }

    public String muestraTabla() {

        String salida = "Has fallado: Recuerda la tabla: \n";

        for (int i = 0; i < 10; i++) {
            String tabla = this.numero + " X " + (i + 1) + " = " + this.numero * (i + 1) + "\n";
            salida += tabla;
        }


        return salida;
    }

    public String preguntaSalirPrograma() {
        return "¿Seguro que desea salir?";
    }




}
