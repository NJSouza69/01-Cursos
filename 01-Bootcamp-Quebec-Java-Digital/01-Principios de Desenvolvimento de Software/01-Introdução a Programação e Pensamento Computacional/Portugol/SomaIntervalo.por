programa {
	funcao inicio() {
		inteiro x,y
		
		escreva("Digitre os números para executar a soma do intervaloÇ")
		leia (x)
		leia (y)
		
		escreva (soma_intervalo(x,y))
	}
	
	funcao inteiro  soma_intervalo(inteiro x, inteiro y) {
	    inteiro total, resultado_parcial
	    total =  y/2
	    resultado_parcial = x+y
	    
	    inteiro resultado = total * resultado_parcial
	    retorne resultado
	}
}
