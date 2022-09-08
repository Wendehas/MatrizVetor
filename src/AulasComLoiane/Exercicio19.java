package AulasComLoiane;

import java.util.Scanner;

//19.Ler as duas notas bimestrais para um conjunto de 10 alunos.
//Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
//tipo real. Escreva um programa que calcule a média aritmética simples 
//das notas informadas armazenando o resultado em um vetor “Result” de 
//mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. 
//Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, caso contrário, 
//a situação do aluno será “reprovado”.
public class Exercicio19 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
//por boa pratica notas1 por que  esta usando uma lista alternada de dados, facilita a leitura do programa.
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas2.length];

//		na linha 17 coloquei o notas1.length porque caso queira aumentar o tamanho do meu array fica muito mais facil.
//	    double[] notas1 = new double[10]; nesse projeto queo 10 alunos mais caso eu trabalha com projeto que pedisse ex: 40 alunos era só mudar 
//		e ao inves de 10 passaria 40 alunos na propiredade "length que é o tamanho do meu vetor"
		for (int i = 0; i < notas1.length; i++) {

			System.out.println("Informe a nota 1 do aluno : " + (i + 1));
			notas1[i] = leia.nextDouble();

			System.out.println("Informe a nota 2 do aluno : " + (i + 1));
			notas2[i] = leia.nextDouble();

			result[i] = (notas1[i] + notas2[i]) / 2;
//			a condiçao acima soma nota1 com nota2 e divide por 2.

		}

		System.out.print("Notas 1 = ");
		for (int i = 0; i < notas1.length; i++) {
			System.out.print(notas1[i] + " ");

		}
		System.out.println();

		System.out.print("Notas 2 = ");
		for (int i = 0; i < notas2.length; i++) {
			System.out.print(notas2[i] + " ");

		}
		System.out.println();

		System.out.println("Resultados : ");
		for (int i = 0; i < result.length; i++) {
//			controla o contador que acima é i=0 com o proprio vetor.
			if (result[i] >= 7) {
				System.out.println(result[i] + " - PARABÉNS (a) Aluno Aprovado  ");
			} else {
				System.out.println(result[i] + " - INFELIZMENTE Aluno Reprovado");
			}

		}
		leia.close();
	}

}
