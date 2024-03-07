package codigos;

//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre 
//será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
//escreva um programa na linguagem que desejar onde, informado um número, ele calcule
//a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
//ou não a sequência.

public class Exercicio02 {
	private static int primeiro = 0, segundo = 1, proximo = 0;
	
	public void fibonacci(int numero) {
		while(proximo < numero) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}
		
		if(proximo == numero) {
			System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
		} else {
			System.out.println("O numero " + numero + " nao pertence a sequencia de Fibonacci.") ; 
		}
	}
}
