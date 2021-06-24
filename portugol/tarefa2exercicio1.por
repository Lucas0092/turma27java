programa
{
	
	funcao inicio()
	{
		inteiro peso, excesso
		real multa

		escreva("Digite o peso dos tomates em kg: ")
		leia(peso)
		
		se(peso>50)
		{
			excesso= (peso-50)
			escreva(excesso+ "Kg Excesso de peso\n" + "Voce pagara 4 reais de multa por Kg")
			
		}
		senao
		{
			escreva("Peso compativel")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */