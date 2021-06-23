programa
{
	
	funcao inicio()
	{
		inteiro seg, min, hor, tempoHoras, tempoMinutos
		

		escreva("Duração do evento em segundos: ")
		leia(seg)

		tempoHoras= (seg/3600)
		tempoMinutos= (seg/60)

		escreva("Seu tempo em horas é: \n"+tempoHoras)
		escreva("\nSeu tempo em minutos é: \n"+tempoMinutos)


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */