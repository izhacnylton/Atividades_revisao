package projeto06;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
		}
		
	public void depositar(double valor){
		saldo += valor;
		}
		
	public void sacar(double valor){
		if(valor <= saldo){
			saldo -=valor;
			}
		else{
			System.out.println("Saldo insuficiente.");
			}
		}
		
	public void consultarSaldo(){
		System.out.printf("Seu saldo é de: R$ %.2f", this.saldo);
		}
		
	public String getTitular(){ return this.titular; }
	public void setTitular(String titular){ this.titular = titular; }
		
	public double getSaldo(){ return this.saldo; }
	public void setSaldo(double saldo){ this.saldo = saldo; }
}
