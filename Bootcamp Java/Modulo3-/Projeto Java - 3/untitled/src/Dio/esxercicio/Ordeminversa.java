package Dio.esxercicio;

public class Ordeminversa {
    public static void main(String[] args) {
        int [] vetor = {8,5,-4,3,2,60};
        int cont=0;

        System.out.println("Vetor ");

        while (cont<(vetor.length-1)){
            System.out.println(vetor[cont] + " ");
            cont++;
        }

        System.out.println("\nVetor - Ordem inversa ");

        for (int i= vetor.length-1; i>=0 ;i--){
            System.out.println(vetor[i] + " ");
        }


    }
}
