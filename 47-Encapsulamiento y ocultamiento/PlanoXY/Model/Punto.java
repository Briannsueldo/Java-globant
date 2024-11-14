package Model;

public class Punto {
    
    private int x;
    private int y;

    public Punto() {

    };

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanciaAlOrigen(int x, int y) {
        return Math.sqrt((x * x) + (y * y));
    }

    public static double distanciaEntrePuntos(Punto p1, Punto p2) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public static double estanAlineados(Punto p1, Punto p2, Punto p3) {
        int dx12 = p2.getX() - p1.getX();
        int dy12 = p2.getY() - p1.getY();
        double distancia12 = Math.sqrt((dx12 * dx12) + (dy12 * dy12));

        int dx13 = p3.getX() - p1.getX();
        int dy13 = p3.getY() - p1.getY();
        double distancia13 = Math.sqrt((dx13 * dx13) + (dy13 * dy13));

        int dx23 = p3.getX() - p2.getX();
        int dy23 = p3.getY() - p2.getY();
        double distancia23 = Math.sqrt((dx23 * dx23) + (dy23 * dy23));

        return ((distancia12 + distancia23 - distancia13));
    }
}
