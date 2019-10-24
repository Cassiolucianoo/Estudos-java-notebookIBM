import javax.swing.JOptionPane;


public class ProgramaImprimeNome {
	public static void main (String []args){
		int idade;
		String nome;
		String mensagem;
		
		nome = JOptionPane.showInputDialog("infome o seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade "+nome));
		
			if(idade < 18){
				
				mensagem = "Cara você é meio novinho vai usar drogas";
				
			}if (idade > 40){
				
				mensagem = "Cara você está meio velho!";
				
			}else{
				
				mensagem = "Você aguenta trampa ainda";
				
			}
		
		JOptionPane.showMessageDialog(null,"Seu nome é "+nome +"\n Você tem :"+idade+" Anos \n"+mensagem );
		System.out.println("Meu nome é cassio\nMinha idade é :"+idade+" Anos !!/n"+mensagem );
		
	}

}
