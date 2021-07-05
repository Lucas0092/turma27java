package introducao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0, x=1, aux=1;
		
		System.out.println("digite um numero: ");
		numero = leia.nextInt();
		
		if (numero<=0) {
			System.out.println("numero invalido!!");
		}
		else if (numero==1) {
			System.out.println("1 = 1");
		}
		else {
			do {
				System.out.printf("%d +",x);
				x++;
				aux=aux+x;
			}
			while(x<numero);
			System.out.print(x);
			System.out.print(" = "+aux);
			}
				
		}
	}


