package CriandoConta;

public class TestMetodo {
	
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		System.out.println("Saldo da conta: " + contaPaulo.saldo);
		contaPaulo.deposita(50);
		System.out.println("Saldo da conta: " + contaPaulo.saldo);
		
		Conta contaAna = new Conta();
		System.out.println("Saldo da conta: " + contaAna.saldo);	
	}
	
	
}
