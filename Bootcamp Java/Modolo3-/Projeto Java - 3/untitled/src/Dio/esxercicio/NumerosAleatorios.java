package Dio.esxercicio;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numaleatorios = new int [20];

        for (int i=0; i<numaleatorios.length;i++){
            int num = random.nextInt(100);
            numaleatorios[i]=num;

        }
        System.out.println("Numeros Aleatorios");
        for ( int num : numaleatorios){
            System.out.println(num + " ");

        }

        System.out.println("Sucessores dos Numeros Aleatorios");
        for ( int num : numaleatorios){
            System.out.println((num+1) + " ");

        }


    }

}
