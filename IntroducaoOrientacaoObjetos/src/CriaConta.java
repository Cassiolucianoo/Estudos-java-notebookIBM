
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
		System.out.println("S�o a mesmissima conta");
		}else{
			System.out.println("n�o � a mesma conta");
		}

	}

}
