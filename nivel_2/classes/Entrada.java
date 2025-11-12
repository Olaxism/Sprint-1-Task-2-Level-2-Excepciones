package sprint_1.tasca_2.nivel_2.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    private static Scanner sc = new Scanner (System.in);


    public static byte formatByte(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextByte();
            }catch (InputMismatchException e) {
                System.out.println("ERROR!!! Tienes que introducir un numero entre el -128 y el 127");

                sc.nextLine();
            }
        }
    }

    public static int formatEntero(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("ERROR!!! Tienes que introducir un numero entero.");

                sc.nextLine();
            }
        }
    }

    public static float formatFloat (String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextFloat();
            }catch (InputMismatchException e) {
                System.out.println("ERROR!!! Hay que introducir un numero decimal.");

                sc.nextLine();
            }
        }
    }

    public static double formatDouble(String mensaje) {
        while (true) {
            try {
                System.out.println(mensaje);
                return sc.nextDouble();
            }catch (InputMismatchException e) {
                System.out.println("ERROR!!! Introduce correctamente un numero decimal");

                sc.nextLine();
            }
        }
    }

    public static char formatChar(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String input = sc.next();


                if (input.length() !=1) {
                    throw new Exception ("Tienes que introducir un solo caracter");
                }

                return input.charAt(0);

            }catch (Exception e) {
                System.out.println("ERROR!!! " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static String formatString(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                sc.nextLine();
                String input = sc.nextLine();

                if (input == null || input.trim().isEmpty()) {
                    throw new Exception("Se debe introducir texto");
                }

                return input.trim();

            } catch (Exception e) {
                System.out.println("ERROR !!!" + e.getMessage());
            }
        }

    }

    public static boolean formatSoN(String mensaje) {
            while (true) {
                try {
                    System.out.print(mensaje + "(s/n): ");
                    String input = sc.next();

                    if (input.equals("s")) {
                        return true;
                    }else if (input.equals("n")) {
                        return false;
                    }else {
                        throw new Exception("Solo se puede introducir (s) para sí o (n) para no.");
                    }
                }catch (Exception e) {
                    System.out.println("ERROR!!! " + e.getMessage());
                    sc.nextLine();
                }
            }
        }

    public static void closeScanner() {
        sc.close();
    }

}
