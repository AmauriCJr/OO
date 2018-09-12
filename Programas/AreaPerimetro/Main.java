
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		float base, altura;
		
		Triangulo t; //cria a referencia para a classe triangulo
		
		
		//String forma = JOptionPane.showInputDialog("Informe a figura");
		
		String strbase = JOptionPane.showInputDialog("Informe a base");
		base= Float.parseFloat(strbase);
		
		String straltura = JOptionPane.showInputDialog("Informe a altura");
		altura= Float.parseFloat(straltura);
		
		
		t = new Triangulo(base, altura);
		
		float perimetro = t.perimetro();
		float area = t.area();

		String mensagem = "Área = " + area + "\n" + "Perímetro = " + perimetro;
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
