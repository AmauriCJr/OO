import javax.swing.JOptionPane;

public class IdadeUsuario {

	public static void main(String[] args) {
		String nome,
				stranoNascimento;
		int idade,
			anoNascimento;
		nome = JOptionPane.showInputDialog("Informe seu nome");
		stranoNascimento = JOptionPane.showInputDialog("Informe seu ano de nascimento");
		anoNascimento = Integer.parseInt(stranoNascimento);
		idade = 2018 - anoNascimento;
		JOptionPane.showMessageDialog(null, nome + '\n' + idade);
		
		
		
	}

}
