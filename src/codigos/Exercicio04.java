package codigos;

//4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. 
//Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas 
//vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
//
//Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual 
//interruptor controla cada lâmpada?

public class Exercicio04 {
	//Considerando 4 salas (3 salas distintas com lampadas e 1 sala com os interruptores) nao consegui 
	//responder à pergunta (por ser possível de interpretar pelo enunciado)
	
	//salas 1, 2, 3
	//interruptores a, b, c
	
	
	//acendo dois interruptores: a, b
	//entro em 1
	//se	luz apagada					luz acesa
			//c = 1						//c != 1; A ou B = 1
			//apago a 					//apago b
			//entro em 2				//acendo c
			//se luz acesa				//entro em 2
				//b = 2					//se 	luz apagada			luz acesa
				//a = 3							//b = 2				//precisaria de mais ao menos uma ida à uma das salas de lampadas
			//senao								//a = 1
				//a = 2							//c = 3
				//b = 3					
	
	//Considerando somente 2 salas (1 sala com as lampadas e 1 sala com os interruptores)
	public void verificarInterruptores() {
		System.out.println("Ex.04) Ligo 1 dos interruptores");
		System.out.println("\tVou ate a sala de lampadas: a lampada que esta acesa eh referente ao interruptor ligado");
		System.out.println("\tVolto para a sala de interruptores");
		System.out.println("\tLigo 1 dos outros 2 interruptores e desligo o primeiro");
		System.out.println("\tVou ate a sala de lampadas: a lampada que esta acesa eh referente ao interruptor ligado e a que se manteve desligada eh referente ao restante");
	}
	
}
