package funcionario;

public class Mensalista extends  Funcionario {
    protected String cargo;

    public Mensalista(String cargo, String matricula, String departamento, String CPF, String nome, String email, String endereco) {
        super(matricula, departamento, CPF, nome, email, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double calculaSalarioBruto() {
        if (cargo.equalsIgnoreCase("ceo")){
            return  70000;
        } else
        if ( cargo.equalsIgnoreCase("presidente") ) {
            return  30000;
        } else
            if ( cargo.equalsIgnoreCase("diretor")){
            return  20000;
        } else
            if (cargo.equalsIgnoreCase("gerente")) {
                return 10000;
            } else
                return 0;
    }

    @Override
    public String toString() {
        return "Mensalista{" +
                "cargo='" + cargo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", CPF='" + CPF + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
