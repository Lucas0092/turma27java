programa
{
	
	funcao inicio()
	{
	inteiro idade, contador=1

		escreva (" Digite sua idade: ")
		leia (idade)
		
		enquanto (idade <18) {
			escreva ("você não tem permissão para acessar\n")

			escreva (" Digite sua idade: ")
			leia (idade)
			contador++
			se(contador>=3){
				escreva("voce tentou 3 vezes desista!")
			pare
			}
		}
			se(contador==1){
				escreva ("agora que você é cringe tem total acesso")	
			}
			senao{
				escreva ("voce nao tem acesso")
			}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */