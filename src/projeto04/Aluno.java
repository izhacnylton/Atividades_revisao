package projeto04;

public class Aluno {
	String nome;
	double nota1, nota2, media = 0;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double calcularMedia() {
		return media = (nota1 + nota2) / 2; 
	}
	
	public void verificarSituacao() {
	 if(media >= 7){
	 	System.out.println("Aprovado.");
	 	}
	 else if(media >= 5){
	 	System.out.println("Recuperação");
	 	}
	 else{
	 	System.out.println("Reprovado");
		 }
	}
}
