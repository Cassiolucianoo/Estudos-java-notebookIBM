
public class CriaConta {

	public static void main(String[] args) {
	Conta primeiraConta = new Conta();
	primeiraConta.saldo = 300.0;
	System.out.println(primeiraConta.saldo);
	System.out.println(primeiraConta.titular);
	
	Conta segundaConta = new Conta();
	segundaConta.saldo = 200.0;
	System.out.println(segundaConta.saldo);
	System.out.println(segundaConta.titular);
	
	
	//testando referencia 
	if ( primeiraConta == segundaConta){
		System.out.println("São a mesmissima conta");
		}else{
			System.out.println("não é a mesma conta");
		}

	}

}
