package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//a = "...";
		
		//var infere o tipo de variavel
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5;
		
		double d; //variavel foi declarada
		d = 123.5; // variavel foi incializada
		System.out.println(d); // usada
		
		var e = 1235.45;
		System.out.println(e);
		
		var f = 12; //inteiro 
		//f = 12.01;
		System.out.println(f);
		
	}

}
