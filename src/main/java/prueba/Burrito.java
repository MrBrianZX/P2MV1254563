package prueba;

import java.util.Scanner;

public class Burrito {
    private Scanner sc= new Scanner(System.in);
    private String sabor;
    private String tortilla;
    private int precio;

    Burrito(){
        System.out.print("Ingrese el sabor del Burrito:");
        this.setSabor(sc.next());
        System.out.print("Ingrese el precio del Burrito:");
        this.setPrecio(sc.nextInt());
        System.out.print("Ingrese el tipo de tortilla del Burrito:");
        this.setTortilla(sc.next());
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Burrito el burrito sabe a " + sabor + " tiene tortilla de " + tortilla  + " y cuesta " + precio + " pesos";
    }
}
