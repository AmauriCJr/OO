import javax.swing.JOptionPane;

public class PA {

	public static void main(String[] args) {
		
		int a0,
			razao,
			n,
			Valor;
		
		termo[]	t;
				
		
		String strA0 = JOptionPane.showInputDialog("Informe o primeiro termo");
		a0 = Integer.parseInt(strA0);
		
		String strRazao = JOptionPane.showInputDialog("Informe a razão");
		razao = Integer.parseInt(strRazao);
		
		String strN = JOptionPane.showInputDialog("Informe o número de termos");
		n = Integer.parseInt(strN);
		
		t = new termo[n];
		int i = 0;
		
		while(i<n)
		{
			t[i] = new termo();
			a0 = t[i].valortermo(a0, i);
			System.out.print(a0 + " ");
			a0 = a0+ razao;
			i++;
		}
		
		String strValor = JOptionPane.showInputDialog("Informe a posição desejada");
		Valor = Integer.parseInt(strValor);
		
		t[Valor-1].valorposicao();
		
		
	}

}
