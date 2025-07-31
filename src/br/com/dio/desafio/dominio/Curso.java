package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    private String status(){
        return "\nMentoria{" +
                "\n\tTitulo='" + getTitulo() + '\'' +
                "\n\tTdescricao='" + getDescricao() + '\'' +
                "\n\tCarga Horaria=" + getCargaHoraria() +
                "\n\t}\n";
    }

    @Override
    public String toString() {
        return status();
    }
}
