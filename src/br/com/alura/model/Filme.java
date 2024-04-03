package br.com.alura.model;

public class Filme extends Titulo{

    private String diretor;
    private boolean emCartaz;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public boolean isEmCartaz() {
        return emCartaz;
    }

    public void setEmCartaz(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }
}
