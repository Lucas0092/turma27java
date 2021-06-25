programa
{
	
	funcao inicio()
	{
		real g1, g2, g3

		escreva("Indique o valor da emissao de g1: ")
		leia(g1)
		escreva("Indique o valor da emissao de g2: ")
		leia(g2)
		escreva("Indique o valor da emissao de g3: ")
		leia(g3)

		se(g1>0.3 e g1<=0.4){
		escreva(g1+ " g1 Intimação para suspender a fabrica\n")
	}
		senao{
			escreva(g1+ " g1 Dentro do limite\n")
		}
		se (g1+g2 >0.4){
			escreva(g1+ " g1 e g2 Intimação para suspender a fabrica\n")
			escreva(g2+ " g1 e g2 Intimação para suspender a fabrica\n")
		}
		senao{
			escreva(g1+ " condiçao normal\n") 
			escreva(g2+ " condiçao normal\n")
		}
		se(g1+g2+g3 >0.4 e g1+g2+g3<=0.5){
			escreva(g1+" Notificação de paralisação de atividades\n")
			escreva(g2+" Notificação de paralisação de atividades\n")
			escreva(g3+" Notificação de paralisação de atividades\n")
		}
		senao{
			escreva(g1+ " Dentro da condição\n")
			escreva(g2+ " Dentro da condição\n")
			escreva(g3+ " Dentro da condição\n")
		}
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */