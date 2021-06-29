programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro m1[3][3], somaVetor= 0, somaDiagonal=0, linha=0, coluna=0

		para(linha=0;linha<3;linha++){
			para(coluna=0;coluna<3;coluna++){
				escreva("Digite um valor: ")
				leia(m1[linha][coluna])
				
				somaVetor +=  m1[linha][coluna]
			}
			somaDiagonal += m1[linha][linha]
		}
			escreva(" O valor da soma vetor é: ",somaVetor,"\n")
			escreva(" O valor da soma diagonal é: ",somaDiagonal)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m1, 6, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */