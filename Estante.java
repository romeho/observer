package romero.pg.avancada;

import java.util.ArrayList;

public class Estante implements Subject {

		private ArrayList<Observer> observers;
		private int prateleira;
		private String nomeLivro;
		
		public Estante() {
			observers = new ArrayList<>();
		}
		
		public void setDados(int prateleira, String nomeLivro) {
			this.prateleira = prateleira;
			this.nomeLivro = nomeLivro;
			
			notifyObservers();
		}
		
		@Override
		public void addObserver(Observer observer) {
			observers.add(observer);
		}

		@Override
		public void removeObserver(Observer observer) {
			int index = observers.indexOf(observer);
			if(index > -1) {
				observers.remove(observer);
			}
		}

		@Override
		public void notifyObservers() {
			for(Observer o : observers) {
				o.update(prateleira, nomeLivro);
			}
		}
}
