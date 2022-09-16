package folhadepagamento;

public abstract class funcionario  extends Pessoa{
    protected String matricula;
    protected String  departamento;

    protected double salario;

    public funcionario(String nome, String CPF, String email, String matricula, String departamento) {
        super(nome, CPF, email);
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public double irrf(){
        double aux;
        if (salario<1800){
            aux = 0.1 * salario;
        } else {
            aux = 0.27 * salario;
        }
        return (aux);
    }

    public double cal_inss(){
        return (0.11 * salario);
    }

    public double calSalario(){
        return this.calSalarioBruto() - this.irrf() - this.cal_inss();
    }

    public abstract double calSalarioBruto();




}
