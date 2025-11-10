package sprint_1.tasca_2.nivel_1.classes;

public class Producto {

    private String nombre;
    private double precio;

    public Producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + getNombre() +
                ", precio=" + getPrecio() +
                '}';
    }
}
