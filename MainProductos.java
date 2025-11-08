package sprint_1.tasca_2.nivel_1;

public class MainProductos {

    public static void main (String[] args) {

        Venta cesta = new Venta ();

        Producto p1 = new Producto ("Jugo", 2.50);
        Producto p2 = new Producto ("Galletas", 1.80);

        cesta.agregarProducto(p1); //Debemos comentar esta linea (12)...
        cesta.agregarProducto(p2); //...y esta linea (13) para que salte el error.

        try {
            System.out.println("El total de esta venta es: " + cesta.calcularTotal());
        }
        catch (VentaVacia e) {
            System.out.println(e.getMessage());
        }

        double tresPorUno = 0.0;

        // Codigo para hacer saltar y atrapar la exception IndexOutBounds

        try {
            for (int i = 0; i < 3; i++) {
                tresPorUno += cesta.getProductos().get(i).getPrecio();
                tresPorUno = tresPorUno * 0.7;
                System.out.println("Este es el total a pagar despues del  descuento: " + tresPorUno);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tiene que haber al menos 3 elementos en la venta para hacer un descuento");
        }


    }
}
