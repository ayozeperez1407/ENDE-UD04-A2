package figuras;

import java.awt.Color;

/**
 * Clase que representa un cuadrado.
 * Es un caso particular de rectángulo donde todos los lados son iguales.
 * 
 * @author Ayozeperez
 */
public class Cuadrado extends Rectángulo {

    /**
     * Constructor de la clase Cuadrado.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color del cuadrado
     * @param lado longitud del lado del cuadrado
     */
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}