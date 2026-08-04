package projeto03;

public class Calculadora {
	
	int num01, num02;
	
	public Calculadora(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	
	public int soma() {
		return num01 + num02;
	}
	
	public int subtracao() {
		return num01 - num02;
	}
	
	public int multiplicacao() {
		return num01 * num02;
	}
	
	public int divisao() {
		return num01 / num02;
	}
}
