programa
{
	inclua biblioteca Matematica -->Mat
	
	funcao inicio()
	{
		real d,r,s,a,b,c

		escreva("Digite o valor de a: ")
		leia(a)

		escreva("Digite o valor de b: ")
		leia(b)

		escreva("Digite o valor de c: ")
		leia(c)

		r= Mat.potencia((a+b),2)
		
		s= Mat.potencia((b+c),2)
		
		d= (r+s)/2

		escreva("O valor de d é: "+d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */