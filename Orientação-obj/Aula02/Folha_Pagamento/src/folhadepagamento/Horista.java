package folhadepagamento;

public class Horista extends funcionario{
    private double valorhora;
    private double numhoras;

    public Horista(String nome, String CPF, String email, String matricula, String departamento, double valorhora, double numhoras) {
        super(nome, CPF, email, matricula, departamento);
        this.valorhora = valorhora;
        this.numhoras = numhoras;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public double getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(double numhoras) {
        this.numhoras = numhoras;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "valorhora=" + valorhora +
                ", numhoras=" + numhoras + "matricula= " +  matricula  + '\'' +
                ", departamento='" + departamento +
                ", salario=" + this.calSalario() +
                " CPF = " + CPF +
                " Nome= " + nome +  '\'' +
                '}';
    }

    @Override
    public double calSalarioBruto() {
        return valorhora * numhoras * 4.0;
    }

}
