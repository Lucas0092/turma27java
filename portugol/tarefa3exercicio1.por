programa
{
	
	funcao inicio()
	{
		inteiro numeroFilhos, habitantes=20, mediaFilhos 
		inteiro totalFilhos=0, contador=0
		real salario=0.00, totalSalario=0.00, mediaSalario=0.00, maiorSalario=0.00, porcentagem

		para(inteiro x=1;x<=20;x++){
			escreva("digite o numero de filhos: ")
			leia(numeroFilhos)
			

			totalFilhos += numeroFilhos
		}

		mediaFilhos= (totalFilhos / habitantes)
			escreva(" A media de filhos é: ",mediaFilhos,"\n")
			
		para(real x=1.00;x<=20.00;x++){
			escreva("digite seu salario: ")
			leia(salario)

			totalSalario += salario

		se(salario>maiorSalario){
			maiorSalario = salario
		}
		se(salario<=100){
			contador++
			
		}
		
		}
				
				porcentagem= ((contador * 100)/20)
				escreva("O maior salario sera: ",maiorSalario,"\n")
				mediaSalario= (totalSalario / habitantes)
				escreva(" A media de salario é: ",mediaSalario,"\n")
				escreva("porcentagem de pessoas com salario ate 100 é: ",porcentagem, "%")
			
	}
			
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */