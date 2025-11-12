package sprint_1.tasca_2.nivel_1.classes;

public class Producto {

    private String name;
    private double price;

    public Producto (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + getName() +
                ", precio=" + getPrice() +
                '}';
    }
}
