package figurasGeometricas;

import Objeto3D.Cubo;
import Objeto3D.Esfera;
import Objeto3D.Ponto3D;
import Objetos2D.*;

public class MainFigurasGeometricas {
    public static void main(String[] args) {

        Ponto2D p0 = new Ponto2D(0,1);
        Ponto2D p2 =  new Ponto2D(1,0);
        Ponto3D p1 = new Ponto3D(1,1,1);


        SegReta2D s0 = new SegReta2D(p0, p2);

        Quadrado g0 = new Quadrado(p0,4);
       // System.out.println(g0);

        Retangulo r0 = new Retangulo(p2,2,3);

        Circulo c0 = new Circulo(p2, 2);

       Cubo cb0 = new Cubo(p1,2);

        Esfera e0 = new Esfera(p1,2);

        //System.out.println(r0);

        Objeto2D v[] = new Objeto2D[9];

        v[0] = p0;
        v[1] = p2;
        v[2] = s0;
        v[3] = g0;
        v[4] = r0;
        v[5] = c0;
        v[6] = p1;
        v[7] = cb0;
        v[8] = e0;

        for (int i = 0; i < v.length; i++) {

           /* System.out.println(v[i]);
            v[i].moveXY(-10,10); */
            if (Esfera.class.equals(v[i].getClass()))
            System.out.println("É uma esfera! "+v[i]);

            if (Cubo.class.equals(v[i].getClass()))
                System.out.println("É um cubo! "+v[i]);

        }

       // System.out.println(s0.comprimento());

    }
}