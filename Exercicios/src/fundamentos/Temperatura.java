package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int ajuste = 32;
		final double fator = 5.0 / 9.0;
		
		double Tfahrenheit = 86;
		double Tcelsius = (Tfahrenheit - ajuste) * fator;
		System.out.println("Temperatura em Celsius é " + Tcelsius + "°C");
		
		Tfahrenheit = 0;
		Tcelsius = (Tfahrenheit - ajuste) * fator;
		System.out.println("Temperatura em Celsius é " + Tcelsius + "°C");

	}

}
