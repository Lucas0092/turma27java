package introducao;

import java.util.Scanner;

public class Tarefa2exercicio5_portugol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double g1, g2, g3;
		
		System.out.println("Indique o valor da emiss�o de g1: ");
			g1 = leia.nextDouble();
		System.out.println("Indique o valor da emiss�o de g2: ");
			g2 = leia.nextDouble();
		System.out.println("Indique o valor da emiss�o de g3: ");
			g3 = leia.nextDouble();
		
			if(g1>0.3 && g1<=0.4){
				System.out.println(g1+ " g1 Intima��o para suspender a fabrica\n");
			}
			else{
				System.out.println(g1+ " g1 Dentro do limite\n");
				}
				if(g1+g2 >0.4){
					System.out.println(g1+ " g1 e g2 Intima��o para suspender a fabrica\n");
					System.out.println(g2+ " g1 e g2 Intima��o para suspender a fabrica\n");
				}
				else{
					System.out.println(g1+ " condi�ao normal\n"); 
					System.out.println(g2+ " condi�ao normal\n");
				}
				if(g1+g2+g3 >0.4 && g1+g2+g3<=0.5){
					System.out.println(g1+" Notifica��o de paralisa��o de atividades\n");
					System.out.println(g2+" Notifica��o de paralisa��o de atividades\n");
					System.out.println(g3+" Notifica��o de paralisa��o de atividades\n");
				}
				else{
					System.out.println(g1+ " Dentro da condi��o\n");
					System.out.println(g2+ " Dentro da condi��o\n");
					System.out.println(g3+ " Dentro da condi��o\n");
				}
	}

}
