programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		inteiro n1, n2, n3, n4, r1, r2, r3, r4
		cadeia nome

		escreva("Entre com o primeiro numero: ")
		leia(n1)
		
		escreva("Entre com o segundo numero: ")
		leia(n2)
		
		escreva("Entre com o terceiro numero: ")
		leia(n3)
		
		escreva("Entre com o quarto numero: ")
		leia(n4)

		r1= mat.potencia(n1,2)
		r2= mat.potencia(n2,2)
		r3= mat.potencia(n3,2)
		r4= mat.potencia(n4,2)

		se(r3>=1000){
			escreva(r3+ " Imprimir")
		}
		senao{
			escreva(r1+ "\n" +r2+ "\n" +r3+ "\n" +r4+ "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */