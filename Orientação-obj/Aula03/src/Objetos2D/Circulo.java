package Objetos2D;

public class Circulo implements  Figura2D{
    private Ponto2D centro;
    private double raio;

    public Circulo(Ponto2D centro, double raio) {
        this.centro = new Ponto2D(centro.getX(),centro.getY());
        this.raio = raio;
    }

    public Ponto2D getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double perimetro() {
        return (2*Math.PI)*raio;
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

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", raio=" + raio +
                ", \n area= " + area() +
                ", perimetro= " + perimetro() +
                '}';
    }
}
