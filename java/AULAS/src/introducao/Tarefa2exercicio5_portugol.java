package introducao;

import java.util.Scanner;

public class Tarefa2exercicio5_portugol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double g1, g2, g3;
		
		System.out.println("Indique o valor da emissão de g1: ");
			g1 = leia.nextDouble();
		System.out.println("Indique o valor da emissão de g2: ");
			g2 = leia.nextDouble();
		System.out.println("Indique o valor da emissão de g3: ");
			g3 = leia.nextDouble();
		
			if(g1>0.3 && g1<=0.4){
				System.out.println(g1+ " g1 Intimação para suspender a fabrica\n");
			}
			else{
				System.out.println(g1+ " g1 Dentro do limite\n");
				}
				if(g1+g2 >0.4){
					System.out.println(g1+ " g1 e g2 Intimação para suspender a fabrica\n");
					System.out.println(g2+ " g1 e g2 Intimação para suspender a fabrica\n");
				}
				else{
					System.out.println(g1+ " condiçao normal\n"); 
					System.out.println(g2+ " condiçao normal\n");
				}
				if(g1+g2+g3 >0.4 && g1+g2+g3<=0.5){
					System.out.println(g1+" Notificação de paralisação de atividades\n");
					System.out.println(g2+" Notificação de paralisação de atividades\n");
					System.out.println(g3+" Notificação de paralisação de atividades\n");
				}
				else{
					System.out.println(g1+ " Dentro da condição\n");
					System.out.println(g2+ " Dentro da condição\n");
					System.out.println(g3+ " Dentro da condição\n");
				}
	}

}
