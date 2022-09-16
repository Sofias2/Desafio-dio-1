package Objetos2D;

public class Quadrado implements Figura2D{
    private Ponto2D p0;
    private double lado;

    public Quadrado(Ponto2D p0, double lado) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.lado = lado;
    }

    public Ponto2D getP0() {
        return p0;
    }

    public void setP0(Ponto2D p0) {
        this.p0 = p0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Ponto2D calcP1(){
        return new Ponto2D(p0.getX() + lado, p0.getY());
    }

    public Ponto2D calcP2(){
        return new Ponto2D(p0.getX(), p0.getY() + lado);
    }

    public Ponto2D calcP3(){
        return new Ponto2D(p0.getX() + lado, p0.getY() + lado);
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0= " + p0 +
                    ", p1=" + calcP1() +
                    ", p2=" + calcP2() +
                    ", p3=" + calcP3() +
                    ", \n lado= " + lado +
                    ", area= " + area() +
                    ", perimetro= " + perimetro() +
                    '}';
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX,dY);
    }

    //time 45:06
}
