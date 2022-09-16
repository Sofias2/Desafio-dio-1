package funcionario;

public class ProfessorHorista extends  Horista {
    protected String titulo;

    public ProfessorHorista(String matricula, String departamento, String CPF, String nome, String email, String endereco, double numHoras, String titulo) {
        super(matricula, departamento, CPF, nome, email, endereco, numHoras);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public double calculaSalarioBruto() {
        if (titulo.equalsIgnoreCase("especialista")) {
            setValorHoras(25);
        } else if (titulo.equalsIgnoreCase("mestre")) {
            setValorHoras(35);
        } else if (titulo.equalsIgnoreCase("doutor")) {
            setValorHoras(45);
        } else {
            setValorHoras(0);
        }

        return numHoras * (valorHoras * 5.25);
    }

    @Override
    public String toString() {
        return "ProfessorHorista{" +
                "titulo='" + titulo + '\'' +
                ", numHoras=" + numHoras +
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
