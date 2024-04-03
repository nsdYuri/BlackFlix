package br.com.alura.model;

public class Titulo {

    private String nome, categoria;
    private int anoLancamento, duracaoMinutos, totalAvaliacoes, classificcao;
    private double somaAvaliacoes;
    private boolean inclusoPlano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getClassificcao() {
        return classificcao;
    }

    public void setClassificcao(int classificcao) {
        this.classificcao = classificcao;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public boolean isInclusoPlano() {
        return inclusoPlano;
    }

    public void setInclusoPlano(boolean inclusoPlano) {
        this.inclusoPlano = inclusoPlano;
    }
}
