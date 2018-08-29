import javax.swing.JOptionPane;

public class PA {
	int a0,
		razao,
		n;
	
	void lerParametros()		//cria um modo de funcionamento---> le os valores do teclado
	{
		String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo");
		a0 = Integer.parseInt(strA0);
		
		String strRazao = JOptionPane.showInputDialog("Informe a razão");
		razao = Integer.parseInt(strRazao);
		
		String strN = JOptionPane.showInputDialog("Informe o número de termos");
		n = Integer.parseInt(strN);
	}
	
	void imprimirPA()
	{
		String resposta = "";		//Inicia um string vazio
		resposta += "a0: " + a0 + '\n';
		resposta += "razao: " + razao + '\n';
		resposta += "n: " + n + '\n';
		
		JOptionPane.showMessageDialog(null, resposta);
	}
	
	void progressao()
	{
		int i = 0;
		while(i<n)
		{
			System.out.print(a0 + " ");
			a0 = a0 + razao;
			i++;
		}
	}
	
}
