programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		inteiro horas, codigo, excesso
		real salario, multa, total
		cadeia nome
		
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Horas trabalhadas: ")
		leia(horas)

		salario= (horas*10)

		excesso= (horas-50)

		multa= (excesso*20)

		total= (multa+salario)


		se(horas>50)
		{
			escreva(excesso+ " horas de excesso\n" +multa+ " reais de extras\n" +total+ " reais") 
		}
		senao
		{
			escreva(excesso+ " horas de excesso\n" +multa+ " reais de extras\n" +total+ " reais")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */