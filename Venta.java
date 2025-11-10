package sprint_1.tasca_2.nivel_1.classes;

import sprint_1.tasca_2.nivel_1.excepciones.VentaVacia;

import java.util.ArrayList;
import java.util.List;

public class Venta {

    private ArrayList<Producto> productos;
    private double precioTotalVenta;

    public Venta() {
        this.productos = new ArrayList<>();
        this.precioTotalVenta = 0.0;
    }

    public List<Producto> getProductos() {
        return List.copyOf(productos);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        this.precioTotalVenta = 0.0;
    }

    public double calcularTotal() throws VentaVacia {
        if (productos.isEmpty()) {
            throw new VentaVacia("Para hacer una venta primero hay que añadir productos");
        }
        precioTotalVenta = 0.0;
        for (Producto producto : productos) {
            precioTotalVenta += producto.getPrecio();
        }
            return precioTotalVenta;
        }

    public double getPrecioTotalVenta() {
        return precioTotalVenta;

    }
}
