package sintaxeVariaveisFluxos;

public class TesteIR {
	
	public static void main(String[] args) {
		double salario = 2800.0;
		
		if(salario >= 1900 && salario <= 2800 ){
			System.out.println("O IR é de 7.5% pode deduzir na declaração o valor de R$ 142");
		}else{
			if(salario >= 2800.01 || salario <= 3751.0){
				System.out.println("o IR é de 15% e pode deduzir R$ 350");
				}else {
						System.out.println("o IR é de 15% e pode deduzir R$ 350");
				}	
		}
	}

}
