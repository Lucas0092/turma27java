programa
{
	
	funcao inicio()
	{
		cadeia alunos[4]
		inteiro notas[4], soma=0
		

		para(inteiro x=0; x<4;x++){
			escreva("Seu nome: ",alunos[x])
			leia(alunos[x])
			escreva("\nSua nota: ",notas[x])
			leia(notas[x])

			se(notas[x]<=5){
				escreva("Ainda não, estude mais\n")
			}
			senao{
				escreva("Parabens voce foi aprovado\n")
			}

			soma += notas[x]
		}
			escreva("A soma das notas é: ",soma)	
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */