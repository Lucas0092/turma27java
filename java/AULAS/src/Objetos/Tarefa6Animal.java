package Objetos;

public class Tarefa6Animal {
	
	public static void main(String[] args) {
			
		Tarefa6Cachorro cachorro = new Tarefa6Cachorro();
		Tarefa6Cavalo cavalo = new Tarefa6Cavalo();
		Tarefa6Preguiça preguica = new Tarefa6Preguiça();
		String nome;
		
		
		System.out.println("cachorro lata");
		cachorro.emitirSom();
		
		System.out.println("\nAgora dê um grande uivo");
		cachorro.uivar();
		
		System.out.println("\nCavalo vamos correr");
		cavalo.correr();
		
		System.out.println("\nVoce esta feliz?");
		cavalo.emitirSom();
		
		System.out.println("\nPreguiça pega uma fruta para mim?");
		preguica.subirArvore();
		
		System.out.println("\nVoce esta feliz?");
		preguica.emitirSom();
	

	}
}
