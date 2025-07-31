package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private String status(){
        return "\nMentoria{" +
                "\n\tTitulo='" + getTitulo() + '\'' +
                "\n\tDescricao='" + getDescricao() + '\'' +
                "\n\tData=" + data +
                "\n\t}\n";
    }

    @Override
    public String toString() {
        return status();
    }
}
