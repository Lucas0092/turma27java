programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro n1[4][6]
		inteiro n2[4][6]
		inteiro m1[4][6]
		inteiro m2[4][6]
		

		para(inteiro l=0;l<4;l++){
			para(inteiro c=0;c<6;c++){

				n1[l][c]=  Util.sorteia(3,5)
				n2[l][c]=  Util.sorteia(1,3)

				m1[l][c] = n1[l][c] + n2[l][c]
				m2[l][c] = n1[l][c] - n2[l][c]
				
			}
		}

		escreva(" Matriz n1: \n")
		para(inteiro l=0;l<4;l++){
			para(inteiro c=0;c<4;c++){
				escreva(n1[l][c], " ")
				
			}
			escreva("\n")
			
		}
		escreva("\n")

		escreva(" Matriz n2: \n")
		para(inteiro l=0;l<4;l++){
			para(inteiro c=0;c<4;c++){
				escreva(n1[l][c], " ")
				
			}
			escreva("\n")
			
		}
		escreva("\n")

		escreva(" Matriz m1: \n")
		para(inteiro l=0;l<4;l++){
			para(inteiro c=0;c<4;c++){
				escreva(m1[l][c], " ")
				
			}
			escreva("\n")
			
		}
		escreva("\n")

		escreva(" Matriz m2: \n")
		para(inteiro l=0;l<4;l++){
			para(inteiro c=0;c<4;c++){
				escreva(m2[l][c], " ")
				
			}
			escreva("\n")
			
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 953; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */