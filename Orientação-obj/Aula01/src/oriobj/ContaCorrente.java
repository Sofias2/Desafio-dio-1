package oriobj;

public class ContaCorrente {
    private int numero;
    private String nomeCliente;
    private double saldo;
    private double limite;

    public ContaCorrente(int numero, String nomeCliente, double saldo, double limite) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setLimite(double limite) {
        this.limite = limite;

    }

    public void sacar (double valor){
        this.saldo = saldo - valor;

    }

    public void depositar (double valor){
        saldo = saldo + valor;
    }
}
