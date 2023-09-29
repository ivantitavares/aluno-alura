package br.com.alura.screenmatch.calculos;

import java.util.NoSuchElementException;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >=4){
            System.out.println("Está entre o preferidos do momento");
        } else if(classificavel.getClassificacao()>=2){
            System.out.println("Muito bem avalido no momento!");
        } else {
            System.out.println("coloque na sua lista de assitir depois! ;)");
        }
    }
}
