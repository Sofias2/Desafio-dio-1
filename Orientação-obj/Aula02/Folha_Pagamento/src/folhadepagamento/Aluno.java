package folhadepagamento;

public class Aluno extends Pessoa{
    private String RA;

    public Aluno(String nome, String CPF, String email, String RA) {
        super(nome, CPF, email);
        this.RA = RA;
    }

    public String getRA() {
        return RA;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RA='" + RA + " Nome= " + nome  + " CPF= " + CPF + '\'' +
                '}';
    }
}
