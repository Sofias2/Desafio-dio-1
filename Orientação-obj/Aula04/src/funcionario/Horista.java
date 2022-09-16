package funcionario;

public class Horista extends Funcionario {
    protected double numHoras;
    protected double valorHoras;

    public Horista(String matricula, String departamento, String CPF, String nome, String email, String endereco, double numHoras, double valorHoras) {
        super(matricula, departamento, CPF, nome, email, endereco);
        this.numHoras = numHoras;
        this.valorHoras = valorHoras;
    }

    public Horista(String matricula, String departamento, String CPF, String nome, String email, String endereco, double numHoras) {
        super(matricula, departamento, CPF, nome, email, endereco);
        this.numHoras = numHoras;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }


    @Override
    public double calculaSalarioBruto() {
        return valorHoras * (numHoras * 4);
    }

    @Override
    public String toString() {
        return "Horista{" +
                "numHoras=" + numHoras +
                ", valorHoras=" + valorHoras +
                ", matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
