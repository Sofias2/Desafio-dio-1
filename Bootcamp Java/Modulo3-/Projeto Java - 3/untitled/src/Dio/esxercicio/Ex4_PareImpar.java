package Dio.esxercicio;

import java.util.Scanner;

public class Ex4_PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantnum;
        int num;
        int quantpar = 0,quantimpar = 0 ;

        System.out.println("Digite a Quantidade de números ");
        quantnum= scan.nextInt();

        int cont=0;

        do {
            System.out.println("Número: ");
            num = scan.nextInt();

            if (num % 2 == 0) quantpar++;
            else quantimpar++;

            cont++;

        } while (cont<quantnum);
        System.out.println("Quantidade par " + quantpar);
        System.out.println("Quantidade impar " + quantimpar);
    }

}
