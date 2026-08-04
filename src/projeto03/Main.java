package projeto03;

public class Main {
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora(5, 10);
		Calculadora c2 = new Calculadora(100, 50);
		Calculadora c3 = new Calculadora(2, 8);
		Calculadora c4 = new Calculadora(10, 2);
	
		System.out.println("Soma: " + c1.soma());
		System.out.println("Subtração: " + c2.subtracao());
		System.out.println("Multiplicação: " + c3.multiplicacao());
		System.out.println("divisão: " + c4.divisao());
		
		
		
	}
}
