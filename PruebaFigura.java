package figuras;

import java.util.Scanner;
import java.awt.Color;

/**
 * Clase de prueba para trabajar con figuras geométricas.
 * Permite crear distintas figuras y calcular sus propiedades.
 * 
 * @author Ayozeperez
 */
public class PruebaFigura {

    /**
     * Método principal del programa.
     */
    public static void main(String[] args) {

        int opción;
        Scanner teclado = new Scanner(System.in);

        do {
            opción = mostrarMenú();

            if (opción != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();

                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();

                switch (opción) {

                    case 1:
                        System.out.print("Introduzca lado 1: ");
                        double l1 = teclado.nextDouble();
                        System.out.print("Introduzca lado 2: ");
                        double l2 = teclado.nextDouble();
                        System.out.print("Introduzca lado 3: ");
                        double l3 = teclado.nextDouble();

                        Triángulo t = new Triángulo(x, y, Color.red, l1, l2, l3);
                        System.out.println("Perímetro: " + t.perímetro());
                        System.out.println("Área: " + t.área());
                        break;

                    case 2:
                        System.out.print("Base: ");
                        double base = teclado.nextDouble();
                        System.out.print("Altura: ");
                        double altura = teclado.nextDouble();

                        Rectángulo r = new Rectángulo(x, y, Color.red, base, altura);
                        System.out.println("Perímetro: " + r.perímetro());
                        System.out.println("Área: " + r.área());
                        break;

                    case 3:
                        System.out.print("Lado: ");
                        double lado = teclado.nextDouble();

                        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
                        System.out.println("Perímetro: " + c.perímetro());
                        System.out.println("Área: " + c.área());
                        break;
                }
            }

        } while (opción != 4);

        teclado.close();
    }

    /**
     * Muestra el menú y devuelve la opción elegida.
     */
    public static int mostrarMenú() {

        int opción;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1) Triángulo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Cuadrado");
            System.out.println("4) Salir");

            System.out.print("Opción: ");
            opción = teclado.nextInt();

        } while (opción < 1 || opción > 4);

        return opción;
    }
}