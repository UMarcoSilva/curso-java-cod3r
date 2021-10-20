package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);

		// tabela verdade E
		System.out.println("\nTabela verdade E (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);

		// tabela verdade OU
		System.out.println("\nTabela verdade OU (||)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		// tabela verdade OU exlcusivo = XOR
		System.out.println("\nTabela verdade OU exclusivo (^)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// tabela verdade Nao
		System.out.println("\nTabela verdade Nao (!)");
		System.out.println(!true);
		System.out.println(!false);
	}
}
