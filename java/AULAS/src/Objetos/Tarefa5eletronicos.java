package Objetos;

public class Tarefa5eletronicos {
	
	public String nome;
	public char modelo;
	public boolean ligado;
	
	public void ligar() {
		ligado = true;
		System.out.println("Produto ligado");
		
	}
	public void desligar() {
		ligado = false;
		System.out.println("Produto desligado");
	}
	

}
