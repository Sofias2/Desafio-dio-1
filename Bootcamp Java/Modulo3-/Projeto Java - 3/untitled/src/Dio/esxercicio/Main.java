package Dio.esxercicio;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Exercicio Calculadora");
        Calculadora.soma(5,2);
        Calculadora.subtracao(10,5);
        Calculadora.multiplicacao(7,2);
        Calculadora.divisão(100,5.0);

        System.out.println("Exercicio Mensagem");
     Mensagem.obterMensagem(9);
     Mensagem.obterMensagem(1);
     Mensagem.obterMensagem(12);

        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }


}
