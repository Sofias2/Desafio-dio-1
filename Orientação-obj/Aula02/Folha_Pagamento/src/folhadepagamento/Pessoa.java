package folhadepagamento;

public class Pessoa {

    protected String nome;
    protected  String CPF;
    protected String email;

    public Pessoa() {

    }

    public Pessoa(String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void write(){
        System.out.println(this.toString());
    }

}
