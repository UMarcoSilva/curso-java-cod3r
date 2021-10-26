package fundamentos.exercicosExtras;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		/*
		 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;

		System.out.println("Digite o valor de A: ");
		a = input.nextDouble();

		System.out.println("\nDigite o valor de B: ");
		b = input.nextDouble();

		System.out.println("\nDigite o valor de C: ");
		c = input.nextDouble();
		
		delta =  ((Math.pow(b, 2)) - 4 * a * c);
		
		x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
		x2 = (-(b) - Math.sqrt(delta)) / 2 * a;
		
		System.out.printf("\nValores: a= %.2f b= %.2f c= %.2f", a, b, c);
		
		System.out.println("\nDelta = " + delta);
		
		System.out.printf("\nx1= %.2f e x2 = %.2f", x1, x2);
		
		
		
		input.close();
	}
}
