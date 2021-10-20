package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terca (v ou f)
		//trabalho na quinta (v ou f)
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprarTV32 = trabalho1 ^ trabalho2;
		boolean comprarTV50 = trabalho1 || trabalho2;
		boolean tomarSorvete = trabalho1 || trabalho2;
		
		boolean saudavel = !tomarSorvete; // operador unário
		
		System.out.println("Comprou Tv 50\" ? "  + comprarTV50);
		System.out.println("Comprou Tv 32\" ? "  + comprarTV32);
		System.out.println("Comprou Tv 50\" e sorvete ? "  + tomarSorvete);
		
		System.out.println("Saudável? " + saudavel);
		
		
	}

}
