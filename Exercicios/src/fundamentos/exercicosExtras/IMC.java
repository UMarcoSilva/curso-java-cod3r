package fundamentos.exercicosExtras;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {

		// Criar um programa que leia o peso e a altura do usuário e imprima no console
		// o IMC.

		Scanner input = new Scanner(System.in);

		double altura;
		double peso;
		double resultado;

		System.out.println("Digite a sua altura(m): ");
		altura = input.nextDouble();

		System.out.println("Digite o seu peso(kg): ");
		peso = input.nextDouble();

		resultado = peso / (Math.pow(altura, 2));

		System.out.println("O seu imc é " + resultado);

		input.close();
	}

}
