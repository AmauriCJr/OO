import javax.swing.JOptionPane;

public class termo {
	
	int termo,
		posicao,
		x,
		y;
	
	public int valortermo(int x, int y)
	{
		termo = x;
		posicao = y+1;
		return termo;
	}
	
	void valorposicao()
	{
		String resposta = "";		//Inicia um string vazio
		resposta += "termo: " + termo + '\n';
		resposta += "posição: " + posicao + '\n';
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}
}
