programa
{
	
	funcao inicio()
	{
		inteiro num
		
		escreva("Digite um numero: ")
		leia(num)

		se(num % 2 ==0){
			escreva(num+ " Esse numero é par\n")
		}
		senao{
			escreva(num+ " Esse numero é impar\n")
		}
		se(num<0){
			escreva(num+ " Esse numero é negativo\n")
		}
		senao{
			escreva(num+ " Esse numero é positivo")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */