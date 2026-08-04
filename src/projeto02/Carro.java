package projeto02;

public class Carro {
	String modelo;
	String marca;
	int ano;

	public Carro(String modelo, String marca, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public void exibirDados() {
		System.out.println("Modelo: " + modelo + "\n Marca: " + marca + "\n Ano: " + ano + "\n");
	}
}
