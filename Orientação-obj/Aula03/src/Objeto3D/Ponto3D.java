package Objeto3D;

public class Ponto3D implements Objeto3D{

    private double x;
    private double y;
    private double z;

    public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public void moverZ(double dz) {
        z += dz;
    }

    @Override
    public void moverXZ(double dX, double dZ) {
        x += dX;
        z += dZ;
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        y += dY;
        z += dZ;
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        x += dX;
        y += dY;
        z += dZ;

    }

    @Override
    public void moveX(double dX) {
        x+=dX;
    }

    @Override
    public void moveY(double dY) {
        y+=dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x+=dX;
        y+=dY;
    }

    @Override
    public String toString() {
        return "Ponto3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
