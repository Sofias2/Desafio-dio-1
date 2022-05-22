package desafio.dio;


public class Main {
    public static void main(String[] args) {
        Cliente sofia= new Cliente();
        sofia.setNome("Sofia");

        Conta cc = new ContaCorrente(sofia);
        cc.depositar(200);

        Conta poupanca = new ContaPoupanca(sofia);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}
