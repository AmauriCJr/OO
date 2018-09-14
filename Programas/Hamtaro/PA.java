import javax.swing.JOptionPane;

public class PA {

	public static void main(String[] args) {
		
		int a0, razao, n = 0, Valor;
		
		
		String strn = JOptionPane.showInputDialog("Informe o número de termos");
		n = Integer.parseInt(strn);
		String stra0 = JOptionPane.showInputDialog("Informe o primeiro termo");
		a0 = Integer.parseInt(stra0);
		
		String strrazao = JOptionPane.showInputDialog("Informe a razão");
		razao = Integer.parseInt(strrazao);
		
		
		termo objetos[];
		
		objetos = new termo[n+1];
		
		int i = 1;
		
		while(i<=n)
		{
			objetos[i] = new termo(a0);
			System.out.print(a0 + " ");
			a0 = a0+ razao;
			i++;
		}
		
		String strValor = JOptionPane.showInputDialog("Informe a posição desejada");
		Valor = Integer.parseInt(strValor);
		
		
		String resposta = "";		//Inicia um string vazio
		resposta += "termo: " + objetos[Valor] + '\n';
		resposta += "posição: " + Valor + '\n';
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}
