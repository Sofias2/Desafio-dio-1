package funcionario;

public abstract class Funcionario extends Pessoa implements  Empregado{
    protected String matricula;
    protected String departamento;


    public Funcionario(String matricula, String departamento, String CPF, String nome, String email, String endereco) {
        super(CPF, nome, email, endereco);
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public double calculaSalario() {
        return calculaSalarioBruto() - calculaIRRF() - calculaINSS();
    }

   /* @Override
    public double calculaSalarioBruto() {
        return 0;
    }*/

    @Override
    public double calculaINSS() {
        double salario = calculaSalarioBruto();
        if(salario <= (float)1693.72)
            return (float)(salario*0.08);
        else
        if(salario <= (float)2822.90)
            return (float)(salario*0.09);
        else
            return (float)(salario*0.11);
    }

    @Override
    public double calculaIRRF() {
        double  salario = calculaSalarioBruto()-calculaINSS();
        if(salario <= (float)1903.98)
            return (float) 0.0;
        else
        if(salario <= 2826.65)
            return (float)(salario*0.075-142.8);
        else
        if(salario <= 3751.06)
            return (float)(salario*0.15-354.8);
        else
        if(salario < 4664.68)
            return (float)(salario*0.225-636.13);
        else
            return (float)(salario*0.275-869.36);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
