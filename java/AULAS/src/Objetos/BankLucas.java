package Objetos;

public class BankLucas {

	public static void main(String[] args) {
		
		Banco cliente1 = new Banco(1);
		Banco clientevip = new Banco(2, 55.55);
		Banco clienteEspecial = new Banco(3, 199.99, 2000.00);
		
		//Uso do set � para trocar os dados no private
		cliente1.setNumero(888);
		System.out.println("numero da conta "+cliente1.getNumero());
		
		//coloca a fun��o criada na class aqui no principal
		clienteEspecial.imprimeExtrato();
		
		//coloca a fun��o saca na class aqui no principal
		clienteEspecial.saca(100);
		clienteEspecial.imprimeExtrato();
		
		//coloca a fun��o deposita na class aqui no principal
		clienteEspecial.deposita(5000.99);
		clienteEspecial.imprimeExtrato();
		
		
	}

}
