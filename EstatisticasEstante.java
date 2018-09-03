package romero.pg.avancada;

public class EstatisticasEstante implements Observer {
	private Subject subjetc;
	private int prateleira;
	private String nomeLivro;
	
	public EstatisticasEstante(Subject subject) {
		this.subjetc = subject;
		this.subjetc.addObserver(this);
	}
	
	void livro() {
		System.out.println("Prateleira: " + prateleira);
		System.out.println("Nome do Livro: " + nomeLivro);
	}

	@Override
	public void update(int prateleira, String nomeLivro) {
		this.prateleira = prateleira;
		this.nomeLivro = nomeLivro;
	
	}
	
}
