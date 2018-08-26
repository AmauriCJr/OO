import javax.swing.JOptionPane;

public class PA {

	public static void main(String[] args) {
		int first, tamanho, razao;
		String strfirst, strtamanho, strrazao;
		strfirst = JOptionPane.showInputDialog("Informe o Primeiro Termo");
		strrazao = JOptionPane.showInputDialog("Informe a Razão");
		strtamanho = JOptionPane.showInputDialog("Informe o Tamanho");
		first = Integer.parseInt(strfirst);
		tamanho = Integer.parseInt(strtamanho);
		razao = Integer.parseInt(strrazao);
		
		int i = 0;
		
		//while(i < tamanho)
		//{
		//	System.out.print(first + " ");
		//	first = first + razao;
		//	i++; 
		//}
		 for(i = 0; i < tamanho ; i++)
		 {
			 System.out.print(first + " ");
			 first = first + razao;
			 
		 }
	}

}
