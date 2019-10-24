
public class TestaValores {
	public static void main(String [] args) {
		Conta conta = new Conta( 1337 , 24226);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		conta.setAgencia(123444);
		
		Conta conta1 = new Conta( 1339 , 24265);
		
		Conta conta2 = new Conta( 1345 , 24245);
		
		System.out.println(conta.getTotal());
		

		
	}
}
