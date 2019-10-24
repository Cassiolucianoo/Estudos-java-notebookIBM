import javax.swing.JOptionPane;


public class TesteCondicional2 {
	//salario com desconto de 15% acima de 1.000
	
	public static void main(String[] args) {
	double salario;
	String nome ;
	int porcetagem = 15;
	
	
	nome = JOptionPane.showInputDialog(null,"Informe seu nome : ");
	salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Infome o salario "+nome));
		
		if ( salario > 1000){
			 salario = (  salario * porcetagem  ) / 100;
			 System.err.println(salario);
		}

	JOptionPane.showMessageDialog(null,"Salario de "+nome+"\n Salario é : "+salario);	

	}

}
