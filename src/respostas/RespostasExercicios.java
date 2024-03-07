package respostas;

import java.util.Scanner;

import codigos.Exercicio01;
import codigos.Exercicio02;
import codigos.Exercicio03;
import codigos.Exercicio04;
import codigos.Exercicio05;

public class RespostasExercicios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Resposta Ex 01
		Exercicio01 exercicio01 = new Exercicio01();
		exercicio01.soma();
		
		// Resposta Ex 02
		Exercicio02 exercicio02 = new Exercicio02();	
		System.out.print("Ex.02) Informe um numero: ");	
		int numero = scanner.nextInt();
		scanner.nextLine();
		exercicio02.fibonacci(numero);
		
//		// Resposta Ex 03
		Exercicio03 exercicio03 = new Exercicio03();			
		exercicio03.respostas();
		
//		// Resposta Ex 04
		Exercicio04 exercicio04 = new Exercicio04();			
		exercicio04.verificarInterruptores();
		
//		// Resposta Ex 05
		Exercicio05 exercicio05 = new Exercicio05();
		System.out.print("Ex.05) Insira uma palavra: ");	
		String palavra = scanner.nextLine();
		exercicio05.inverter(palavra);
	}
}
