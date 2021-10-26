package fundamentos.exercicosExtras;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {

		// Criar um programa que leia o valor da base e da altura de um triângulo e
		// calcule a área.
		
		Scanner input = new Scanner(System.in);

		double base;
		double altura;
		double area;

		System.out.println("Digite o valor da base");
		base = input.nextDouble();

		System.out.println("Digite o valor da altura");
		altura = input.nextDouble();

		area = (base * altura) / 2;

		System.out.println("o resultado é: " + area);

		input.close();
	}

}
