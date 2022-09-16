package Objeto3D;

import Objetos2D.Objeto2D;

public interface Objeto3D extends Objeto2D {

    void moverZ(double dz);

    void  moverXZ(double dX, double dZ);

    void moveYZ(double dY, double dZ);

    void moveXYZ(double dX, double dY, double dZ);



}
