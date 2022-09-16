package Objetos2D;

public class Ponto2D implements Objeto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    @Override
    public void moveX(double dX) {
        x += dX;
    }

    @Override
    public void moveY(double dY) {
        y += dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x += dX;
        y += dY;

    }
}
