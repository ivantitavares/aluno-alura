public class Filme {
    String nome;
    int anoDelancamento;
    boolean incluidoNoPlano;
   private int totalDeAvaliacoes;
    private double somaDasAvaliacao;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    };
    double getSomaDasAvaliacao(){
        return somaDasAvaliacao;
    }

    
    void exibeFichaTecnica(){
        System.out.println("Nome do Filma: "+nome);
        System.out.println("Ano de lançamento: "+anoDelancamento);
    }


    void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }


}

