package introducao;

public class Temperatura {

	public static void main(String[] args) {
		
		String nome;
		double F, C, K;
		
		nome= "ED\n";
		F= 55;
		
		C= (F-32)/1.8;
		K= C + 273.15;
		
		System.out.println("OLA, "+nome+ "A TEMPERATURA DE HOJE É: "+C+ "Cº e "+K+ "K.");
		System.out.printf("%s sua temperatura é %.2f \n",nome,C);
	}

}
