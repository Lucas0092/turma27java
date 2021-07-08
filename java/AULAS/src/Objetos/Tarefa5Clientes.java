package Objetos;

public class Tarefa5Clientes {
	
	public String nome;
	public char sexo;
	public int anoNascimento;
	
	public int idadeTotal(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	

}
