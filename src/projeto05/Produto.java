package Projeto05;

public class Produto {
	String nome;
	double preco;
	int estoque;
	
	public Produto(String nome, double preco, int estoque){
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		}
		
	public void adicionar(int quantidade){
		 estoque += quantidade;
		}
		
	public void remover(int quantidade){
		if(quantidade <= estoque){
			estoque -= quantidade;
			}
		else{
			System.out.println("Quantidade insuficiente.");
			}
		}
		
	public double calcularTotal(){
		return estoque  *  preco;
		}
}
