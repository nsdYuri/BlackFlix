package br.com.alura.view;

import br.com.alura.calculos.CalculadoraTempo;
import br.com.alura.model.Filme;
import br.com.alura.model.Serie;

public class Catalogo {
    public static void main(String[] args) {

        Filme bob = new Filme();

        bob.setTipo("Filme");
        bob.setNome("Bob Marley: One Love");
        bob.setDiretor("Reinaldo Marcus Green");
        bob.setCategoria("Documentario");
        bob.setAnoLancamento(2024);
        bob.setDuracaoMinutos(107);
        bob.setClassificcao(16);
        bob.setEmCartaz(true);
        bob.setInclusoPlano(false);

        bob.exibeFichaTecnica();

        bob.avalia(9);
        bob.avalia(9.5);
        bob.avalia(10);

        Filme curtis = new Filme();
        curtis.setTipo("Filme");
        curtis.setNome("Get Rich or Die Tryin' - Vencer ou Morrer");
        curtis.setDiretor("Jim Sheridan");
        curtis.setCategoria("Crime/Musical");
        curtis.setAnoLancamento(2005);
        curtis.setDuracaoMinutos(134);
        curtis.setClassificcao(16);
        curtis.setEmCartaz(false);
        curtis.setInclusoPlano(true);

        curtis.exibeFichaTecnica();

        curtis.avalia(10);
        curtis.avalia(9.5);
        curtis.avalia(10);


        Serie air = new Serie();
        air.setTipo("Série");
        air.setNome("Bel-Air");
        air.setPlataforma("Star+");
        air.setCategoria("Drama");
        air.setAnoLancamento(2022);
        air.setClassificcao(14);
        air.setQtdTemp(2);
        air.setQtdEpTemp(10);
        air.setMinutosEp(60);
        air.setInclusoPlano(false);

        air.exibeFichaTecnica();
        System.out.println("São necessários " + air.getDuracaoMinutos() + " minutos para maratonar a série.");

        air.avalia(10);
        air.avalia(8);
        air.avalia(8.7);

        CalculadoraTempo calc = new CalculadoraTempo();

        calc.gerenciadorTempo(bob);
        System.out.println("Tempo total de " + bob.getNome() + " é: " + calc.getTempoTotal() + " minutos");

        calc.gerenciadorTempo(curtis);
        System.out.println("Tempo total de " + curtis.getNome() + " é: " + calc.getTempoTotal() + " minutos");



    }
}
