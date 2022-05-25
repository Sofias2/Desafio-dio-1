package model;

import java.util.Objects;

public class Gato {

    private String nome;
    private String cor;
    private integer idade;

    public Gato() {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public integer getIdade() {
        return idade;
    }

    public void setIdade(integer idade) {
        this.idade = idade;
    }


}
