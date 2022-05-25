package Dio.esxercicio;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int nota;

        System.out.println("Informe uma nota entre 0 e 10");
        nota= scan.nextInt();

        while (nota< 0 || nota<10){
            System.out.println("Nota Invalida - Digite Novamente");
            nota= scan.nextInt();




        }


    }
}
