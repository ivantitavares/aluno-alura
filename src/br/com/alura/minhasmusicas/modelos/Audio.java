package br.com.alura.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private int totalReporducoes;
    private int totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReporducoes() {
        return totalReporducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reprodus(){
        this.totalReporducoes++;
    }

}
