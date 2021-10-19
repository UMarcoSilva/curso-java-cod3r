package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);

		String salario1;
		String salario2;
		String salario3;

		System.out.println("Digite o valor do primeiro salario: ");
		salario1 = Scanner.nextLine().replace(",", ".");

		System.out.println("Digite o valor do segundo salario: ");
		salario2 = Scanner.nextLine().replace(",", ".");

		System.out.println("Digite o valor do terceiro salario: ");
		salario3 = Scanner.nextLine().replace(",", ".");

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		double mediaSalario = (valor1 + valor2 + valor3) / 3;

		System.out.println("A média dos salários é: R$" + mediaSalario);

		Scanner.close();
	}
}
