public class TestaMetodo {
	public static void main(String []args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		//CHAMANDO METODO saldo 
		contaDoPaulo.deposita(50);
		System.out.println("saldo da conta é "+contaDoPaulo.saldo);
		
		//CHAMADA DE METODO SACA
		contaDoPaulo.saca(20);
		System.out.println("Saldo atual do paulo é : "+contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(7000, contaDoPaulo)){
			System.out.println("transferencia com sucesso");
		}else{
			System.out.println("faltou dinheiro");
			
		}
		
		//saldos atuais depois dos metodos 
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo zé pedrão";
		System.out.println(contaDoPaulo.titular);
		
		
	}
}
