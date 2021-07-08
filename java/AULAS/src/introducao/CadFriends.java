package introducao;

import java.util.Scanner;

public class CadFriends {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		int idadeTeste=0;
		
		System.out.println("amigo 1: ");
		System.out.println("digite o nome: ");
		amigo1.nome=leia.next();
		System.out.println("digite o sexo (M/F/O): ");
		amigo1.genero=leia.next().charAt(0);
		System.out.println("digite o ano de nascimento: ");
		amigo1.anoNascimento=leia.nextInt();
		
		
		System.out.println("amigo 2: ");
		System.out.println("digite o nome: ");
		amigo2.nome=leia.next();
		amigo2.anoNascimento=2000;
		idadeTeste = amigo2.calculaIdade(2030);
		
		System.out.println(amigo1.nome+" sua idade é: "+amigo1.calculaIdade(2030));
		System.out.println(amigo1.nome+" sua idade é: "+idadeTeste);
		
	}



	}


