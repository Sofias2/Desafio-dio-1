package Dio.esxercicio;

import java.util.Scanner;

public class Ex3_MaioreMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cont=0;
        int maior = 0;
        int soma;

        System.out.println("Informe os números");

        do {
            System.out.println("Informe o número");
            num = scan.nextInt();

            soma = soma + num;

            if ( num > maior) maior = num;
            cont = cont + 1;
        } while (cont < 5)

        System.out.println("Maior número: " + maior);
        System.out.println("Media: " + (soma/5));

    }

}
