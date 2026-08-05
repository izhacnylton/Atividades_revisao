package projeto08;

public class Funcionario {
	String nome, cargo;
	double salario;
	
	public Funcionario(String nome, String cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		}
		
	public double aumentarSalario(double percentual){
			return salario = salario + (salario * percentual);
		}
		
	public void exibirDados(){
		System.out.println("Nome: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f", salario);
		}
	
}
