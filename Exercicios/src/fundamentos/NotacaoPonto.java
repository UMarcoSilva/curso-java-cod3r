package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		
		System.out.println(s);

		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("x", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos n�o tem o operador "."
		int a = 3;
		System.out.println(a);
		
		String nome = "Marco";
		int numeroLetras = nome.length();
		System.out.println("N�mero de letras no nome: " + numeroLetras);
	}

}
