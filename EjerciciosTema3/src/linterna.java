public class linterna {
    private String marca;
    private String modelo;
    private int numPilas;
    private int luminosidad;
    private String estaEncendido;
    private int precio;
    private int descuento;

    public linterna(String marca, String modelo, int numPilas, int luminosidad, String estaEncendido, int precio,int descuento) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPilas = numPilas;
        this.luminosidad = luminosidad;
        this.estaEncendido = estaEncendido;
        this.precio = precio;
        this.descuento=descuento;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPilas() {
        return numPilas;
    }

    public int getLuminosidad() {
        return luminosidad;
    }

    public String getEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(String estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public int getPrecio() {
        return precio;
    }
    public int getDescuento(){
        return descuento;
    }

    public void setDescuento(int descuento){
        this.descuento=descuento;
    }
    String precioEnEuros() {
        String salida = +getPrecio() + " €";
        return salida;
    }
    String salidaDescuento(){
        String salida= descuento>=1?"\nEsta linterna tiene un descuento de "+precioEnEuros()+
                "\nEl precio final es: "+ (precio-descuento)+" €":"";
        return salida;
    }

    String salida() {
        String salida = "Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nNúmero de pílas: " + getNumPilas() +
                "\nLuminosidad: " + getLuminosidad() +
                "\nEstado: " + getEstaEncendido() +
                "\nPrecio: " + precioEnEuros()
                +salidaDescuento();
        return salida;
    }
}
