package br.com.alura.calculos;

import br.com.alura.model.Filme;
import br.com.alura.model.Serie;
import br.com.alura.model.Titulo;

public class CalculadoraTempo {

    private int tempoTotal;

//    public void gerenciadorFilme(Filme filme){
//        tempoTotal += filme.getDuracaoMinutos();
//    }
//
//    public void gerenciadorFilme(Serie serie){
//        tempoTotal += serie.getDuracaoMinutos();
//    }

    public void gerenciadorTempo(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}
