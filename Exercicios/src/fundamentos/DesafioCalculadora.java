package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// ler num1
		// ler num2
		// + - * / %
		double num1;
		double num2;
		String operacao;
		double resultado;

		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextDouble();

		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextDouble();

		System.out.println("Digite a operacao desejada: + ou - ou * ou / ou %");
		operacao = entrada.next();

		resultado = "+".equals(operacao.trim()) ? num1 + num2 : 0;
		resultado = "-".equals(operacao.trim()) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao.trim()) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao.trim()) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao.trim()) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);

		entrada.close();
	}

}
