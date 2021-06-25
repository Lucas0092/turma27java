programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		inteiro valorDigitado=0, totalSomatorio=0
		real media=0.0, totalValoresLidos=0.0

		enquanto(valorDigitado>=0){
			escreva("digite um valor positivo ou negativo para sair: ")
			leia(valorDigitado)
			se(valorDigitado>=0){
				totalSomatorio += valorDigitado
				totalValoresLidos++
			}
			
			
		}
		media= totalSomatorio / totalValoresLidos
		escreva("\ntotal somatorio: ",totalSomatorio)
		escreva("\ntotal de numeros lidos: ",totalValoresLidos)
		escreva("\nmedia: ",mat.arredondar(media,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */