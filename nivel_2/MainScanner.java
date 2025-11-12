package sprint_1.tasca_2.nivel_2;

import sprint_1.tasca_2.nivel_2.classes.Entrada;

public class MainScanner {

    public static void main (String[] args) {

        byte edad = Entrada.formatoByte("Intrduce tu edad: ");
        System.out.println("Tu edad es: " + edad);

        int calificacion = Entrada.formatoEntero("Introduce una calificacion (0-10)");
        System.out.println("Calificacion introducida a ha sido: " + calificacion);

        float decimalCorto = Entrada.formatoFloat("Introduce un numero decimal: ");
        System.out.println("Decimal introducido: " + decimalCorto);

        double decimalLargo = Entrada.formatoDouble("Introduce otro decimal: ");
        System.out.println ("Decimal introducido: " + decimalLargo);

        char caracter = Entrada.formatoChar("Introduce un solo caracter: ");
        System.out.println("Caracter introducido: " + caracter);

        String texto = Entrada.formatoString("Introduce algo de texto: ");
        System.out.println("Este ha sido el texto introducido: " + texto);

        boolean respuesta = Entrada.formatoSoN("Te esta gustando el curso?");
        System.out.println("Tu respuesta ha sido: " + respuesta);

        Entrada.closeScanner();

    }
}
