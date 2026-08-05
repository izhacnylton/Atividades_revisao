package projeto08;

public class Main {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Marquinho", "Aviaozinho do tráfico",  1500.00);
		
		f1.exibirDados();
		
		f1.aumentarSalario(0.10);
		System.out.println("\nSalário aumentado em 10%\n");
		
		f1.exibirDados();
	}
}
