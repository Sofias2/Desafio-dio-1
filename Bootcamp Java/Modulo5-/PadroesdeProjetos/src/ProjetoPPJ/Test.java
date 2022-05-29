package ProjetoPPJ;

import ProjetoPPJ.Facade.Facade;
import ProjetoPPJ.Singleton.SingletonEager;
import ProjetoPPJ.Singleton.Singletonlazy;
import ProjetoPPJ.Strategy.*;

public class Test {
    public static void main(String[] args) {
        Singletonlazy lazy = Singletonlazy.getInstancia();
        System.out.println(lazy);
        lazy = Singletonlazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        Comportamento defensivo = new ComportamentoDefensivamente();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Jhon","2234435");


    }

}
