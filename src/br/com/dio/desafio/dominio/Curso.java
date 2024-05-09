package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHraria) {
        this.cargaHoraria = cargaHraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHraria=" + getCargaHraria() +
                '}';
    }

}
