programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5]
		inteiro maiorPontuacao=0

		para(inteiro x=0;x<5;x++){
			escreva("Digite sua Pontuação: ")
			leia(pontuacao[x])
		se(pontuacao[x]>maiorPontuacao){
			maiorPontuacao = pontuacao[x]
		
		}

		}
		
		escreva("A maior pontuação é: \n",maiorPontuacao)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */