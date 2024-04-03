package br.com.alura.model;

public class Titulo {

    private String nome, tipo, categoria;
    private int anoLancamento, duracaoMinutos, totalAvaliacoes, classificcao;
    private double somaAvaliacoes;
    private boolean inclusoPlano;


    // Método para exibir as principais especificações do filme ou serie
    public void exibeFichaTecnica(){
        System.out.println("Categoria: " + categoria);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Classificação: " + classificcao);
        System.out.println("Duração em minutos: " + duracaoMinutos);
        System.out.println("Incluso na plataforma: " + inclusoPlano);
    }

    // Método para ter a soma de todas as notas e a quantidade
    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    // Método para calcular a média baseado na soma de todas as notas e quantidade delas, informações
    // disponibilizadas pelo método a cima.
    public double calculaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
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
