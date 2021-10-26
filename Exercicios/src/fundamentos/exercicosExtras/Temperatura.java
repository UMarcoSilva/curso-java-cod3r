package fundamentos.exercicosExtras;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {

		// Criar um programa que leia a temperatura em Celsius e converta para
		// Fahrenheit.

		Scanner input = new Scanner(System.in);

		double f = 0;
		double c = 0;
		double resultado;
		String operacao;
		String texto;

		System.out
				.println("Digite qual operacao deseja fazer: F (Fahrenheit para Celsius) ou C(Celsius para Fahrenheit");
		operacao = input.next();

		texto = operacao.equals("f") ? "digite o valor em F" : "Digite o valor em C";
		System.out.println(texto);
		c = input.nextDouble();

		resultado = "f".equalsIgnoreCase(operacao) ? (f - 32) * 5 / 9 : (c * 9 / 5) + 32;
		System.out.printf("Resultado da conversao %s", resultado);

		input.close();
	}

}
