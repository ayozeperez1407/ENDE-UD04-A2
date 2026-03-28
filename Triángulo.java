package figuras;

import java.awt.Color;

/**
 * Clase que representa un triángulo.
 * Permite calcular su área y perímetro.
 * 
 * @author Ayozeperez
 */
public class Triángulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Constructor del triángulo.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color del triángulo
     * @param lado1 lado 1
     * @param lado2 lado 2
     * @param lado3 lado 3
     */
    public Triángulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * @return lado 1
     */
    public double getLado1() { return lado1; }

    /**
     * @return lado 2
     */
    public double getLado2() { return lado2; }

    /**
     * @return lado 3
     */
    public double getLado3() { return lado3; }

    /**
     * @param lado1 nuevo valor del lado 1
     */
    public void setLado1(double lado1) { this.lado1 = lado1; }

    /**
     * @param lado2 nuevo valor del lado 2
     */
    public void setLado2(double lado2) { this.lado2 = lado2; }

    /**
     * @param lado3 nuevo valor del lado 3
     */
    public void setLado3(double lado3) { this.lado3 = lado3; }

    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return perímetro
     */
    @Override
    public double perímetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área del triángulo usando la fórmula de Herón.
     * 
     * @return área del triángulo
     */
    @Override
    public double área() {
        double sp = perímetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}