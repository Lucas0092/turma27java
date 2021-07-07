package ListasExerciciosJava;

public class Tarefa4exercicio3 {

	public static void main(String[] args) {
		
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		
		for(int x=0;x<4;x++) {
			for(int y=0;y<6;y++) {
				
				n1[x][y]= (int) (Math.random()*10);
				n2[x][y]= (int) (Math.random()*10);
				
				m1[x][y]= n1[x][y] + n2[x][y];
				m2[x][y]= n1[x][y] - n2[x][y];
				
			}
		}
		
		System.out.println("Matriz n1: \n");
		for(int x=0;x<4;x++) {
			for(int y=0;y<6;y++) {
				
				System.out.println(n1[x][y]+ " ");
			}
			System.out.println("\n");
			
		}
		System.out.println("\n");
		
		System.out.println("Matriz n2: \n");
		for(int x=0;x<4;x++) {
			for(int y=0;y<4;y++) {
				System.out.println(n1[x][y]+ " ");
				
			}
			System.out.println( " \n ");
			
		}
		System.out.println( " \n ");
		
		System.out.println("Matriz m1: \n");
		for(int x=0;x<4;x++) {
			for(int y=0;y<4;y++) {
				System.out.println(m1[x][y]+ " ");

			}
			System.out.println("\n");

		}
			System.out.println("\n");
			System.out.println("Matriz m2: \n");
			for(int x=0;x<4;x++) {
				for(int y=0;y<4;y++) {
					System.out.println(m2[x][y]+ " ");

				}
				System.out.println("\n");

			}
	}
}
