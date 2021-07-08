package Objetos;

public class Carros {

	public String carro;
	public int ano;
	public char marca;
	public boolean modelo;
	public boolean ligado;
	public int velocidade;
	
	public void ligar() {
		ligado = true;
		System.out.println("carro ligado...");
	}
	
	public void desligar() {
		if(velocidade == 0) {
			ligado = false;
			System.out.println("carro desligado...");
			
		}
		else {
			System.out.println("desacelere o carro...");
		}
		
	}
	public void acelerar() {
		velocidade++;
	}
		
	
}
