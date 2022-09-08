package AulasComLoiane;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia  = new Scanner(System.in);
		
		int[] vetorA = new int [8];
		int[] vetorB = new int [8];
		
		vetorA[0] = 10;
		vetorA[1] = 20;
		vetorA[2] = 30;
		vetorA[3] = 40;
		vetorA[4] = 50;
		vetorA[5] = 60;
		vetorA[6] = 70;
		vetorA[7] = 80;
		
		for (int i=0; i< vetorA.length; i++) {
			
			vetorB[i] = vetorA[i];
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = leia.nextInt();
			
			vetorB[i] = vetorA[i];
			
			
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i< vetorA.length; i++) {
		System.out.print(vetorA[i]+ " ");
		
	}
		System.out.println();
	
	System.out.print("Vetor B = ");
	for (int i=0; i<vetorB.length; i++) {
	System.out.print(vetorB[i] + " ");
	}
	System.out.println();

	}
}
//		for (int i=0; i<vetorA.length; i++) {
//			vetorB[i] = vetorA[i];
//		}
//		