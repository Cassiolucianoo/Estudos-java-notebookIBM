import javax.swing.JOptionPane;


public class ProgramaImprimeNome {
	public static void main (String []args){
		int idade;
		String nome;
		String mensagem;
		
		nome = JOptionPane.showInputDialog("infome o seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade "+nome));
		
			if(idade < 18){
				
				mensagem = "Cara voc� � meio novinho vai usar drogas";
				
			}if (idade > 40){
				
				mensagem = "Cara voc� est� meio velho!";
				
			}else{
				
				mensagem = "Voc� aguenta trampa ainda";
				
			}
		
		JOptionPane.showMessageDialog(null,"Seu nome � "+nome +"\n Voc� tem :"+idade+" Anos \n"+mensagem );
		System.out.println("Meu nome � cassio\nMinha idade � :"+idade+" Anos !!/n"+mensagem );
		
	}

}
