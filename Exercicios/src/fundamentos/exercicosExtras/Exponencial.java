package fundamentos.exercicosExtras;

import java.util.Scanner;

public class Exponencial {
	public static void main(String[] args) {

		// Criar um programa que leia um valor e apresente os resultados ao quadrado e
		// ao cubo do valor.
		
		Scanner input = new Scanner(System.in);

		double valor;
		double quadrado;
		double cubo;

		System.out.println("Digite o valor para as operações ^2 e ^3: ");
		valor = input.nextDouble();

		quadrado = Math.pow(valor, 2);
		cubo = Math.pow(valor, 3);

		System.out.printf("O valor ao quadrado é: %.2f e o valor ao cubo é: %.2f", quadrado, cubo);

		input.close();
	}

}
