package Projeto05;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("Bergamota", 4.44, 144);
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Estoque atual: " + p1.estoque);
		System.out.println("Preco individual do produto: R$ " +  p1.preco);
		System.out.println("Valor total do estoque: " + p1.calcularTotal());
		
		
		//adicionando
		
		p1.adicionar(50);
		
		System.out.println("Novo estoque: " + p1.estoque);
		System.out.println("Novo Valor total do estoque: " + p1.calcularTotal());

    //removendo lroduto
    
		p1.remover(30);
		
		System.out.println("Novo estoque: " + p1.estoque);
		System.out.println("Novo Valor total do estoque: " + p1.calcularTotal());
		
		
	}
}
