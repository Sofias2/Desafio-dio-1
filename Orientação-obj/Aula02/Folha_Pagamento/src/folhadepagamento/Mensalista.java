package folhadepagamento;

public class Mensalista extends funcionario{
    private String cargo;

    public Mensalista(String nome, String CPF, String email, String matricula, String departamento, String cargo) {
        super(nome, CPF, email, matricula, departamento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return "Mensalista{" +
                "cargo='" + cargo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + calSalario()+
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public double calSalarioBruto() {
        if (cargo.equals("Junior")){
            return  2500;
        } else
            if ( cargo.equals("Pleno") ) {
            return  3500;

        } else {
            return  5500;
        }
    }
}
