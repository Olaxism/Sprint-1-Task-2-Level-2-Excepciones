package sprint_1.tasca_2.nivel_1.classes;

import sprint_1.tasca_2.nivel_1.excepciones.VentaVacia;

import java.util.ArrayList;
import java.util.List;

public class Venta {

    private ArrayList<Producto> products;
    private double totalVentaPrice;

    public Venta() {
        this.products = new ArrayList<>();
        this.totalVentaPrice = 0.0;
    }

    public List<Producto> getProducts() {
        return List.copyOf(products);
    }

    public void addProducto(Producto producto) {
        products.add(producto);
        this.totalVentaPrice = 0.0;
    }

    public double calculateTotal() throws VentaVacia {
        if (products.isEmpty()) {
            throw new VentaVacia("Error atrapado: Para hacer una venta primero hay que añadir productos");
        }
        totalVentaPrice = 0.0;
        for (Producto producto : products) {
            totalVentaPrice += producto.getPrice();
        }
            return totalVentaPrice;
        }

    public double getTotalVentaPrice() {
        return totalVentaPrice;

    }
}