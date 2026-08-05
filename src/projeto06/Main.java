package projeto06;

public class Main {
	public static void main(String[] args) {
		
		ContaBancaria cb1 = new ContaBancaria("Marquinho", 500.00);
		
		System.out.println("Nome: " + cb1.getTitular());
		cb1.consultarSaldo();
		
		cb1.depositar(200);
		System.out.println("\nDepositando R$ 200.00");
		cb1.consultarSaldo();
		
		
		cb1.sacar(400);
		System.out.println("\nSacando R$ 400.00");
		cb1.consultarSaldo();
		
	}
}
