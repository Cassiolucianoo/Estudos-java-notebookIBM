import javax.swing.JOptionPane;


public class TesteCondicional {

	public static void main (String []args){
		int idade;
		String nome;
		String mensagem = null;
		int acompanhado;
		nome = JOptionPane.showInputDialog("infome o seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade "+nome));
		acompanhado = Integer.parseInt(JOptionPane.showInputDialog(null,"Uma pergunda "+nome+" Est� acompanhado "
				+ "pra festa ? Em quantos ? \n Se sim coloque o numero de pessoas, se n�o coloque - 0 -"));
		
			if( idade >= 18  ){
				JOptionPane.showMessageDialog(null," IF 1 () Bem vindo");
				mensagem =  "bem vindo !";
				
			}else if (idade < 18 ){
	
				JOptionPane.showMessageDialog(null," IF 2 () n�o bem vindo");
				mensagem =  "Voc� � de menor !";
				
					if (acompanhado == 0){
						
						JOptionPane.showMessageDialog(null," IF 3 () n�o bem vindo");
						mensagem =  "Voc� � de menor, porem est� com mais alguem.";
					}
				
			}

		
		JOptionPane.showMessageDialog(null,"Seu nome � "+nome +"\n Voc� tem :"+idade+" Anos \n"+mensagem);
		//System.out.println("Meu nome � cassio\nMinha idade � :"+idade+" Anos !!/n"+mensagem );
		
	}

}
