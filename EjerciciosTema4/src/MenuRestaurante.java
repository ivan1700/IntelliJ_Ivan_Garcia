import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class MenuRestaurante {
    private int codigo;
    private double precio;
    private String producto;
    private boolean esComida;


    public MenuRestaurante(int codigo, double precio, String producto, boolean esComida) {
        this.codigo = codigo;
        this.precio = precio;
        this.producto = producto;
        this.esComida = esComida;
    }

    public MenuRestaurante(int codigo, String producto) {
        this.codigo = codigo;
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getProducto() {
        return producto;
    }

    public String getEsComida() {
        String salida = this.esComida==true? "Es comida" : "Es bebida";
        return salida;
    }



    public String salida() {
        String salida = "El producto que ha elegido es " + getProducto() + " Cuyo precio es " + getPrecio() + "€ Y " + getEsComida();
        return salida;
    }
}
