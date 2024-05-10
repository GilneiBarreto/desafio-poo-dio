package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Instrutor {
    private String nome;
    private String especialidade;

    public Instrutor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrutor instrutor = (Instrutor) o;
        return Objects.equals(nome, instrutor.nome) && Objects.equals(especialidade, instrutor.especialidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, especialidade);
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
