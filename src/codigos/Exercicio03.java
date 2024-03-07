package codigos;

//3) Descubra a lógica e complete o próximo elemento:
//
//
//
//a) 1, 3, 5, 7, ___
//
//b) 2, 4, 8, 16, 32, 64, ____
//
//c) 0, 1, 4, 9, 16, 25, 36, ____
//
//d) 4, 16, 36, 64, ____
//
//e) 1, 1, 2, 3, 5, 8, ____
//
//f) 2,10, 12, 16, 17, 18, 19, ____

public class Exercicio03 {

	public void respostas() {
		// resposta 03) a)
		int[] sequenciaA = {1, 3, 5, 7 };
		System.out.println("Ex.03)\ta) " + (sequenciaA[sequenciaA.length - 1] + 2));

		// resposta 03) b)
		int[] sequenciaB = {2, 4, 8, 16, 32, 64 };
		System.out.println("\tb) " + (sequenciaB[sequenciaB.length - 1] * 2));

		// resposta 03) c)
		int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
		System.out.println("\tc) " + (sequenciaC.length * sequenciaC.length));

		// resposta 03) d)
		int[] sequenciaD = {4, 16, 36, 64};
		System.out.println("\td) " + ((2 * (sequenciaD.length + 1)) * (2 * (sequenciaD.length + 1))));

		// resposta 03) e)
		int[] sequenciaE = {1, 1, 2, 3, 5, 8};
		System.out.println("\te) " + (sequenciaE[sequenciaE.length-2] + sequenciaE[sequenciaE.length-1]));

		// resposta 03) f)
		System.out.println("\tf) Nao soube responder.");
	}
}
