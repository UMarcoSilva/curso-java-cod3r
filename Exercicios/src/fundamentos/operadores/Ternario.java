package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {

		double media = 7.6;
		String resultadoFinal = media >= 7.00 ? 
				"Aprovado" : "Recupera??o";	
		System.out.println("O aluno est? " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "n?o";
		
		System.out.printf("Tem deconto? %s", resultado);
		
	}
}
