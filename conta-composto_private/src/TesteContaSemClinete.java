
public class TesteContaSemClinete {

	public static void main(String[] args) {
		Conta contaDoCassio = new Conta();
		System.out.println(contaDoCassio.saldo);
		contaDoCassio.titular = new Cliente();
		
		contaDoCassio.titular.nome = "cassio";
		System.out.println(contaDoCassio.titular.nome);

	}

}
