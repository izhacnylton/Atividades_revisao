package projeto07;

public class Main {
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo(5.0, 10.0);
		
		System.out.printf("Base:  %.2f", r1.base);
		System.out.printf("\nAltura: %.2f", r1.altura);
		
		System.out.printf("\nCálculo da área: %.2f", r1.calcularArea());
		
		System.out.printf("\nCálculo do perímetro: %.2f", r1.calcularPerimetro());
		
	}
}
