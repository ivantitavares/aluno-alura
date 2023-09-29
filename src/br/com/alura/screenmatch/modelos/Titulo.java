package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDelancamento;
    boolean incluidoNoPlano;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    };

    public String getNome() {
        return nome;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDelancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: "+ incluidoNoPlano);
    }


    public void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }


}
