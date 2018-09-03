package romero.pg.avancada;

public class Launch {

	public static void main(String[] args) {

		Estante estante = new Estante();

		EstatisticasEstante estatisticasEstante = new EstatisticasEstante(estante);

		estante.setDados(1, "Cem anos de solidao");
		estatisticasEstante.livro();
		estante.addObserver(estatisticasEstante);
	}
}
