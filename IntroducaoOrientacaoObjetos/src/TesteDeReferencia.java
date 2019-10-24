
public class TesteDeReferencia {
	
	/*Olhando o codigo da uma aparencia de duas contas, porem n�o s�o duas contas 
	 e sim, duas referencias apontando para o mesma conta o mesmo objeto*/

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.0;
		
		System.out.println("saldo primeira conta = "+primeiraConta.saldo);
		System.out.println(primeiraConta.titular);

		//segunda conta � refeerencia da primira conta
		Conta SegundaConta = primeiraConta;
		
	
		primeiraConta.saldo += 300.0;
		System.out.println("saldo segundo conta = "+SegundaConta.saldo);
		System.out.println(SegundaConta.titular);
		
		
		System.out.println("Imprimindo novamente = "+primeiraConta.saldo);
		
		//comparando referencias para ver se � mesma conta 
		if ( primeiraConta == SegundaConta){
		System.out.println("S�o a mesmissima conta");
		}else{
			System.out.println("n�o � a mesma conta");
		}
	}

}
