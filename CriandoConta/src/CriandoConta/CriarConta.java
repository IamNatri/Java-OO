package CriandoConta;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200; 
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo = 50;
		primeiraConta.titular = "Matheus Bastos";
		primeiraConta.numero = 124365;
		primeiraConta.agencia = 123;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		segundaConta.titular = "Matheus Bastos";
		segundaConta.numero = 124365;
		segundaConta.agencia = 123;
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		

		
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		segundaConta.saldo = primeiraConta.saldo;
		System.out.println(segundaConta.saldo);
		
	
	
	}
}
