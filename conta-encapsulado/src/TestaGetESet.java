public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setNumero(1337892);
		conta.setAgencia(2004);	
		conta.setSaldo(40);
		conta.deposita(200);
		
		System.out.println("Numero da conta :"
				+ " "+conta.getNumero()+"\n"
				+conta.getAgencia()
				+"\n"+conta.getSaldo());

        //em poucas linhas
		Cliente cassio = new Cliente();
		cassio.setNome("cassio luciano da silva");
		cassio.setCpf ("222.222.222 - 22");
		cassio.setProfissao("programador jr 1 \n ");	

		
	    conta.setTitular(cassio);
	    
	   //outra forma de chamar 
	    conta.getTitular().setProfissao("programador jr 2"); 
		
	   
	    
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		
	
	}

}
