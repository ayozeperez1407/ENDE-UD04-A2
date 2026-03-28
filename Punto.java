package figuras;

/**
 * Clase que representa un punto en el plano cartesiano.
 * 
 * @author Ayozeperez
 */
public class Punto {

    private double x;
    private double y;

    /**
     * Constructor por defecto (0,0)
     */
    public Punto() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor con coordenadas
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor copia
     */
    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    /**
     * Calcula la distancia a otro punto.
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    /**
     * Devuelve el punto simétrico respecto al eje Y.
     */
    public Punto simétrico() {
        return new Punto(this.x * -1, this.y);
    }

    /**
     * Compara si dos puntos son iguales.
     */
    public boolean compara(Punto p) {
        return p.x == x && p.y == y;
    }

    /**
     * Representación en texto del punto.
     */
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}