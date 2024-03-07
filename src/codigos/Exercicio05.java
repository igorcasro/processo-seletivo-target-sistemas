package codigos;

public class Exercicio05 {
	private static String invertida;
	private static int indicesFrase;
	
	public void inverter(String frase) {
		indicesFrase = frase.length() - 1;
		invertida = "";

		for(int i = indicesFrase; i >= 0; i--) {
			invertida += frase.charAt(i);
		}
		
		System.out.println("Ex. 05) Ao inverter \'" + frase + "\' obtemos: " + invertida);
	}
}
