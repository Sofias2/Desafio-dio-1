package Dio.esxercicio;

import java.util.Scanner;

public class Ex1_NomeeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.println("Informe o nome do aluno");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Informe a idade do aluno");
            idade = scan.nextInt();

        }
        
    }


}
