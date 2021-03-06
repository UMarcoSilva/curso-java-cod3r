package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {

		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
				
		System.out.println(x + y);		
		System.out.println(x - y);	
		System.out.println(x * y);	
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);		
		System.out.println(a - b);	
		System.out.println(a * b);
		System.out.println(a / b);	
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);	
		
		System.out.println(a % b); //resto da divisao
		System.out.println(8 % 3 );
		
		System.out.println(x + y - a * b);
		
		int n = 3 * 4 - 10;
		int m = (int) Math.pow(n, 3);
		double c = Math.pow(m, 3);
		
		System.out.println(m);
		System.out.println(c);
	}
}
