package Objetos;

public class Tarefa5Aviao {
	
	public String nome;
	public boolean ligado;
	public int tamanhoAviao;
	public int metros=500;
	public int velocidade= 0;
	
	public void ligar() {
		ligado = true;
		System.out.println("Avião ligado...");
	}
	public void desligar() {
			ligado = false;
			System.out.println("Avião desligado...");
		}
	
	
	public void tamAviao() {
		if(tamanhoAviao > metros) {
			System.out.println("Boing");
		}
		else {
			System.out.println("Teco teco");
		}
	
	
	}

}
