package Objeto3D;

public class Esfera implements Solido3D {
    private Ponto3D centro;
    private double raio;

    public Esfera(Ponto3D centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Ponto3D getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return "Esfera {" +
                "Centro=" + centro +
                ", Raio=" + raio +
                ", Volume=" + volume() +
                '}';
    }

    @Override
    public void moverZ(double dz) {
        centro.moverZ(dz);
    }

    @Override
    public void moverXZ(double dX, double dZ) {
        centro.moverXZ(dX, dZ);
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        centro.moveYZ(dY, dZ);
    }

    @Override
    public void moveXYZ(double dX, double dY, double dZ) {
        centro.moveXYZ(dX, dY, dZ);
    }

    @Override
    public double volume() {
        return ((4*Math.PI)*Math.pow(raio,3))/3;
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        centro.moveXY(dX, dY);
    }
}
