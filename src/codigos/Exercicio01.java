package codigos;

//1) Observe o trecho de código abaixo:
//
//int INDICE = 13, SOMA = 0, K = 0;
//
//enquanto K < INDICE faça
//
//{
//
//K = K + 1;
//
//SOMA = SOMA + K;
//
//}
//
//imprimir(SOMA);
//
//
//
//Ao final do processamento, qual será o valor da variável SOMA?

public class Exercicio01 {
	private static int indice = 13, soma = 0, k = 0;
	
	public void soma() {
		while (k < indice) {
			k += 1;
			soma += k;
		}
		
		System.out.println("Ex.01) " + soma);
	}
	
}

	
