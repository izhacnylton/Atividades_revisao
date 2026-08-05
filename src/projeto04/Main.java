package projeto04;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Marquinho", 5, 9);
	
		System.out.println("Media: " + a1.calcularMedia());
		System.out.println("Estado: ");
		a1.verificarSituacao();	
		
	}
}
