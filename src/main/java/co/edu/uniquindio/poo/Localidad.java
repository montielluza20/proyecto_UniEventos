package co.edu.uniquindio.poo;

public class Localidad {
    private String nombre;
    private double precio;
    private int capacidadMaxima;
    public Localidad(String nombre, double precio, int capacidadMaxima) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidadMaxima = capacidadMaxima;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    } 
    
}
