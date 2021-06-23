programa
{
	
	funcao inicio()
	{
		inteiro dias, mes, ano, idadeAno, idadeMeses, idadeDias
		
		escreva("Digite sua idade em dias: ")
		leia(dias)

		idadeAno= (dias/365)
		idadeMeses= (dias/12)
		idadeDias= (dias/1)

		escreva("\nSua idade em anos é: \n"+idadeAno)
		escreva("\nSua idade em meses é: \n"+idadeMeses)
		escreva("\nSua idade em dias é: \n"+idadeDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */