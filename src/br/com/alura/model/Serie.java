package br.com.alura.model;

public class Serie {

    private String plataforma;
    private int qtdTemp, qtdEpTemp, qtdMinutosEp;

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

    public int getQtdMinutosEp() {
        return qtdMinutosEp;
    }

    public void setQtdMinutosEp(int qtdMinutosEp) {
        this.qtdMinutosEp = qtdMinutosEp;
    }
}
