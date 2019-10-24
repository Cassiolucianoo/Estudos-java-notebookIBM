public class Conta {
	double saldo;
	int numeroConta;
	String titular ;
	int agencia;
	
	//meto sem retorno
	public void deposita(double valor ){
		this.saldo = this.saldo + valor;
	}
	
	//metodo com retorno saca 
	public boolean saca (double valor ){
		if(this.saldo >= valor){
		 this.saldo = this.saldo - valor;
			return true;
		}
			return false;
	}
	
	//transfere valor 
	public boolean transfere (double valor, Conta destino ){
			
		if( this.saldo >= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	
	
	
}
