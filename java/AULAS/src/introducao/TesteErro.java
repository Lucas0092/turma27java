package introducao;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		String nome[] = new String[3];
		
		try {
			System.out.println("Digite a posi�ao do vetor de 0 a 2 para cadastro do nome: ");
			valor = leia.nextInt();
			System.out.println("digite o nome da pessoa em quest�o: ");
			nome[valor] = leia.next();
			
			
		}
		catch(java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("vc colocou um tamanho errado ou posi��o incorreta da matriz");
			
		}
		catch(java.util.InputMismatchException erro) {
			System.out.println("Digite um numero por favor...");
		}
		
		
		System.out.println("Posi�ao escolhida "+valor+" nome regidtrado: "+nome[valor]);
	}

}
