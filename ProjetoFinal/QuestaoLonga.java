package form;



import javax.swing.JOptionPane;

public class QuestaoLonga extends QuestaoAberta {
  
	
		void criar() {
		
                    
		
			String texto = JOptionPane.showInputDialog("Informe a questão desejada:");
		
			String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Questao_%d.txt",pastadestino, numeroquestao); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
		
			numeroquestao = numeroquestao +1;
			tipopergunta = 2;
			
			texto = tipopergunta + "^" + texto;
			
			Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
			arquivo.escreve(texto, nomedoarquivo);				//Escreve no arquivo
			
		}	
	
}
