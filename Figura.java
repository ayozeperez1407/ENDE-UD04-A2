package figuras;

import java.awt.Color;

/**
 * Clase abstracta que define las propiedades básicas de una figura geométrica.
 * Contiene información sobre el centro y el color de la figura.
 * 
 * @author Ayozeperez
 */
public abstract class Figura {

    /** Punto que representa el centro de la figura */
    private Punto centro;

    /** Color de la figura */
    private Color color;

    /**
     * Constructor de la clase Figura.
     * 
     * @param x coordenada X del centro
     * @param y coordenada Y del centro
     * @param color color de la figura
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    /**
     * Imprime el color de la figura por consola.
     */
    public void imprimirColor() {
        System.out.println("El color de la figura es: " + this.color);
    }

    /**
     * Compara el área de esta figura con otra.
     * 
     * @param otraFigura figura con la que comparar
     * @return 1 si es mayor, -1 si es menor, 0 si son iguales
     */
    public int esMayorQue(Figura otraFigura) {
        int resultadoComparacion;
        if (this.área() > otraFigura.área())
            resultadoComparacion = 1;
        else if (this.área() < otraFigura.área())
            resultadoComparacion = -1;
        else
            resultadoComparacion = 0;

        return resultadoComparacion;
    }

    /**
     * Obtiene la coordenada X del centro.
     * 
     * @return coordenada X
     */
    public double getXCentro() {
        return centro.getX();
    }

    /**
     * Obtiene la coordenada Y del centro.
     * 
     * @return coordenada Y
     */
    public double getYCentro() {
        return centro.getY();
    }

    /**
     * Obtiene el color de la figura.
     * 
     * @return color de la figura
     */
    public Color getColor() {
        return color;
    }

    /**
     * Establece la coordenada X del centro.
     * 
     * @param x nueva coordenada X
     */
    public void setXCentro(double x) {
        centro.setX(x);
    }

    /**
     * Establece la coordenada Y del centro.
     * 
     * @param y nueva coordenada Y
     */
    public void setYCentro(double y) {
        centro.setY(y);
    }

    /**
     * Establece el color de la figura.
     * 
     * @param color nuevo color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Calcula el perímetro de la figura.
     * 
     * @return perímetro
     */
    public abstract double perímetro();

    /**
     * Calcula el área de la figura.
     * 
     * @return área
     */
    public abstract double área();
}