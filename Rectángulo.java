package figuras;

import java.awt.Color;

/**
 * Clase que representa un rectángulo.
 * Hereda de la clase Figura y permite calcular su área y perímetro.
 * 
 * @author Ayozeperez
 */
public class Rectángulo extends Figura {

    /** Base del rectángulo */
    private double baseRectangulo;

    /** Altura del rectángulo */
    private double alturaRectangulo;

    /**
     * Constructor de la clase Rectángulo.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color del rectángulo
     * @param baseRectangulo base del rectángulo
     * @param alturaRectangulo altura del rectángulo
     */
    public Rectángulo(double x, double y, Color color, double baseRectangulo, double alturaRectangulo) {
        super(x, y, color);
        this.baseRectangulo = baseRectangulo;
        this.alturaRectangulo = alturaRectangulo;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return perímetro del rectángulo
     */
    @Override
    public double perímetro() {
        return 2 * baseRectangulo + 2 * alturaRectangulo;
    }

    /**
     * Calcula el área del rectángulo.
     * 
     * @return área del rectángulo
     */
    @Override
    public double área() {
        return baseRectangulo * alturaRectangulo;
    }
}