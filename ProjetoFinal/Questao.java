import java.io.IOException;
import java.io.File;
import javax.swing.JOptionPane;

public class Questao {


	public static void main(String[] args) throws IOException {}
	
		void criar() {
		
		System.out.println("to aqui");
		String nome = JOptionPane.showInputDialog("Informe o nome do formulário:");
		
		if (!"fim".equals(nome))								//não deseja criar
		{
		
		String nomedapasta = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
		//é tipo o sprintf em C
		
		
		File pasta = new File(nomedapasta);
        pasta.mkdir();											//Cria uma pasta para guardar as perguntas
		
		for (int i = 1; i < 10000; i++) 						//Laço infinito para criar quantas perguntas o usuário desejar
		{
		
			String texto = JOptionPane.showInputDialog("Informe a questão desejada:");
		
			if(texto.equals("fim"))									//Condicional que quebra o laço
			{
				break;
			}
		
			String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\%s_Questao_%d.txt", nome, nome, i); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
		
		
			File file = new File(nomedoarquivo);				//Cria o arquivo com o nome escolhido
			
			
			try {												//O eclipse que sugeriu colocar isso aqui pró código rodar
				if (file.createNewFile())						//Checa se existe um arquivo com esse nome				
					{
						System.out.println("Arquivo Criado");
					} else {
						System.out.println("Já existe um arquivo com esse nome");
					}
			} catch (IOException e) {
			e.printStackTrace();							//Eclipse tb sugeriu isso aqui
			}
		 
			Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
			arquivo.escreve(texto, nomedoarquivo);				//Escreve no arquivo
		}
		}
	}
}

