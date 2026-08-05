package projeto09;

public class Main {
	public static void main(String[] args) {
		
		ConversorTemperatura ct1 = new ConversorTemperatura();
		
		System.out.printf("\nConvertendo 35°C para Fahrenheit: %.2f", ct1.converterCelsius(35));
		System.out.printf("\nConvertendo 78 F° para Celsius: %.2f", ct1.converterFahrenheit (78));
		
	}
}
