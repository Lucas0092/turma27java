programa
{
	
	funcao inicio()
	{
		inteiro numero=0
		inteiro totalImparMultiplo3=0
		real contador3impar=0.00
		real media3impar=0.00
		inteiro maiorNumero=0
		
		
		
		faca{
			escreva("digite o numero: ")
			leia(numero)
			
			se( ((numero%2)==1) e ((numero%3)==0) ){
				totalImparMultiplo3 += numero
				contador3impar++
				
			se(numero>maiorNumero){
				maiorNumero = numero
				
				}
				
			}
			
		} enquanto (numero !=0)
		
			media3impar= totalImparMultiplo3 / contador3impar
			escreva("media dos numeros impares multiplos de 3: " +media3impar+ "\n")
			escreva("Maior numero digitado foi " +maiorNumero+ "\n")
			escreva("FIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */