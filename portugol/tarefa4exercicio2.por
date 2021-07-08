programa
{
	
	funcao inicio()
	{
		inteiro lancamento[10], somaLancamento=0, medialanc=0, maiorlanc=0, maiorocorrencia=0
		
		para(inteiro x=0;x<10;x++){
			escreva("qual valor do lançamento: ")
			leia(lancamento[x])
			somaLancamento += lancamento[x]
			medialanc= somaLancamento/10

			se(lancamento[x]>maiorlanc){
				maiorlanc=lancamento[x]
				
			}
			
			
		}	
		
			para(inteiro x=0;x<10;x++){
				se(lancamento[x] == maiorlanc){
					maiorocorrencia++
				}
			}
		escreva("O valor da soma é: ",somaLancamento,"\n")
		escreva("A media de lançamentos é: ",medialanc,"\n")
		escreva("\nA maior numero é: " ,maiorlanc, " sendo a maior ocorrencia: ",maiorocorrencia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 635; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */