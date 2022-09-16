package oriobj;

import java.sql.SQLOutput;

public class GestaoConta {

    public static void main(String[] args) {

        ContaCorrente conta01 = new ContaCorrente(0001,"Silva",1000.00,2000.00);
        conta01.depositar(500.00);
        conta01.sacar(100.00);
        System.out.println(conta01.getSaldo());

        ContaCorrente conta02 = new ContaCorrente(0001,"Conserta Felix Jr",0,0);
        System.out.println(conta02.getNomeCliente());
        System.out.println( "Saldo:  " + conta02.getSaldo());
    }

}
