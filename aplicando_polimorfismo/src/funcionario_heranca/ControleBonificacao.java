package funcionario_heranca;

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Gerente gerente){
		
		double boni = gerente.getBonificacao();
		this.soma = this.soma + boni;
		
	}

	public double getSoma() {
		return soma;
	}
}
