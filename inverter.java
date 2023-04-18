package Atividade2;

public class Inverter {
	
	public static void main(String[] args) {
		
		int vetor[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};
		int vetor2[] = new int [vetor.length];
		inverter(vetor, 0, vetor2);
		imprimir(vetor);
		System.out.println();
		imprimir(vetor2);
	}
	
	public static int[] inverter(int vetor[], int indice, int vetor2[]) {
		
		if (indice == vetor.length) {
			return vetor2;
		}
		else {
			vetor2[vetor2.length - 1 - indice] = vetor[indice];
			return inverter(vetor, indice + 1, vetor2);
		}
	}
	
	public static void imprimir(int vetor[]) {
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("[" + vetor[i] + "]");
		}
	}
}
