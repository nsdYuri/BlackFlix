package br.com.alura.model;

public class Serie extends Titulo{

    private String plataforma;
    private int qtdTemp, qtdEpTemp, minutosEp;

    public int getDuracaoMinutos(){
        return qtdEpTemp * qtdEpTemp * minutosEp;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getQtdTemp() {
        return qtdTemp;
    }

    public void setQtdTemp(int qtdTemp) {
        this.qtdTemp = qtdTemp;
    }

    public int getQtdEpTemp() {
        return qtdEpTemp;
    }

    public void setQtdEpTemp(int qtdEpTemp) {
        this.qtdEpTemp = qtdEpTemp;
    }

    public int getMinutosEp() {
        return minutosEp;
    }

    public void setMinutosEp(int minutosEp) {
        this.minutosEp = minutosEp;
    }
}
