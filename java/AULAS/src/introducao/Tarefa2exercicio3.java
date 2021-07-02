package introducao;

import java.util.Scanner;

public class Tarefa2exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4, r1, r2, r3, r4;
		String nome;
		
		System.out.println("Entre com o primeiro numero: ");
			n1 = leia.nextInt();
		System.out.println("Entre com o segundo numero: ");
			n2 = leia.nextInt();
		System.out.println("Entre com o terceiro numero: ");
			n3 = leia.nextInt();
		System.out.println("Entre com o quarto numero: ");
			n4 = leia.nextInt();
		
			r1= (int) (Math.pow(n1, 2));
			r2= (int) Math.pow(n2, 2);
			r3= (int) Math.pow(n3, 2);
			r4= (int) Math.pow(n4, 2);
			
			if(r3>=1000) {
				System.out.println(r3+ " Imprimir");
			}
			else {
				System.out.println(r1+ "\n"+r2+ "\n"+r3+ "\n"+r4+ "\n");
			}
	}

}
