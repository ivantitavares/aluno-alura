import br.com.alura.screenmatch.calculos.CalculadorDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
   public static void main(String[] args) {
      Filme meuFilme = new Filme();
      meuFilme.setNome("O podereso Chefão");
      meuFilme.setAnoDelancamento(1970);
      meuFilme.setDuracaoEmMinutos(180);
      System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

      meuFilme.exibeFichaTecnica();
      meuFilme.avalia(8);
      meuFilme.avalia( 5);
      meuFilme.avalia( 10);

      System.out.println("Total de Avaliações: "+ meuFilme.getTotalDeAvaliacoes());

      System.out.println("Média de avaliações: "+ meuFilme.pegaMedia());
        //    meuFilme.somaDasAvaliacao = 10;
      //      meuFilme.totalDeAvaliacoes = 1;

      Serie serie = new Serie();
      serie.setNome("Lost");
      serie.setAnoDelancamento(2000);
      serie.exibeFichaTecnica();
      serie.setTemporadas(10);
      serie.setEpisodiosPorTemporada(10);
      serie.setMinutosPorEpisodio(50);
      System.out.println("Duração para Maratonar: " + serie.getDuracaoEmMinutos());

      Filme outroFilme = new Filme();
      outroFilme.setNome("Avatar");
      outroFilme.setAnoDelancamento(2023);
      outroFilme.setDuracaoEmMinutos(200);

      CalculadorDeTempo calculadora = new CalculadorDeTempo();
      calculadora.inclui(meuFilme);
      calculadora.inclui(outroFilme);
      calculadora.inclui(serie);
      System.out.println(calculadora.getTempoTotal());

      FiltroRecomendacao filtro = new FiltroRecomendacao();
      filtro.filtra(meuFilme);

      Episodio episodio = new Episodio();
      episodio.setNumero(1);
      episodio.setSerie(serie);
      episodio.setTotalVisualizacoes(300);
      filtro.filtra(episodio);

   }
}