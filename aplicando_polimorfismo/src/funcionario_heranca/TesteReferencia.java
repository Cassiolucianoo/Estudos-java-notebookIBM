package funcionario_heranca;

public class TesteReferencia {

	public static void main(String[] args) {
		 Gerente gerente1 = new Gerente ();
		 gerente1.setNome("Cassio Luciano da silva ");
		 gerente1.setSalario(5000.0);
		 
		 ControleBonificacao controle = new ControleBonificacao();
		 controle.registra(gerente1);
		 
		 System.out.println(controle.getSoma()+ gerente1.getSalario());

	}

}
