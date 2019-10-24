public class Conta {
	private double saldo;
	private int numeroConta;
	private int agencia;
	private Cliente titular ;
	private static int total;
	
	public Conta(int agencia , int numero){
		total++;
		System.out.println("o total de contas é "+total);
		this.agencia = agencia;
		this.numeroConta = numero;
		
		System.out.println("estou criando uma conta "+ this.numeroConta);
		
	}
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
	
	//pega saldo
	public double getSaldo(){
		return this.saldo;
		
	}
	public void setSaldo(int saldo){
		this.saldo = saldo;
		
	}
	public int getNumero(){
		return this.numeroConta;
		
	}
	public void setNumero(int numero){
		this.numeroConta = numero;
		
	}
	public int getAgencia(){
		return this.agencia; 
		
	}
	
	public void setAgencia(int agencia){
		this.agencia = agencia; 
		
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	
	
}
