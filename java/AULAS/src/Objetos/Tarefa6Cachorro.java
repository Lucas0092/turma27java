package Objetos;

public class Tarefa6Cachorro extends Tarefa6Animal{
	
		private String cachorro;
		private boolean latir;
	
		public void emitirSom()
		{
			latir = true;
			System.out.println("AU AU");
		}
		
		public void uivar()
		{
			latir = false;
			System.out.println("AUUUUUUUUUUUUW");
		}

}
