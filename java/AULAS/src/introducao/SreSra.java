package introducao;

import java.util.Scanner;

public class SreSra {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeUsuario;
		char sexoUsuario;
		int anoNascimento;
		
		System.out.println("Informe seu nome: ");
		nomeUsuario = leia.next();
		System.out.println("Informe seu sexo[M, F, O]: ");
		sexoUsuario = leia.next().toUpperCase().charAt(0);
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		if(sexoUsuario == 'M') {
			System.out.printf("Oi Sr %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
			
		}
		else if(sexoUsuario == 'F') {
			System.out.printf("Oi Sra %s, sua idade é %d anos.", nomeUsuario, (2021 - anoNascimento));
		}
		else {
			System.out.printf("Oi Sre %s, sua idadeé %d anos.", nomeUsuario, (2021 - anoNascimento));
		}
	}

}
