import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.File;

public class Responder {


	public static void main(String[] args) throws IOException {}
	
		void responder() throws IOException {
		
		char [] lidochar = new char[100];
		
		String lido = "";
			
		System.out.println("agora to aqui");
		String nome = JOptionPane.showInputDialog("Informe o nome do formulário que deseja responder:");
		
		if (!"fim".equals(nome))						//não deseja responder
		{
		
		String respostatxt = "";
		
		
		for (int i = 1; i < 10000; i++) 
		{
			lido = "";
		
			String nomedaquestao = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\%s_Questao_%d.txt",nome, nome, i); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
			
			
			File file = new File(nomedaquestao);				//Cria o arquivo com o nome escolhido para colocar as respostas
		
			if(file.exists() && !file.isDirectory()) 			//checa se a questão existe
			{ 
			
				FileReader ler = new FileReader(nomedaquestao);
								
						
				ler.read(lidochar);
					
					      
				for(char c : lidochar)
					lido = lido + c;
						
						
				String resposta = JOptionPane.showInputDialog(lido);
					 
				ler.close();
						
				respostatxt = respostatxt + " " + resposta + " ";
			}else 
			{
				break;
			}
			
			
		}
		
		for (int i = 1; i < 10000; i++) 
		{
		
		String nomedaquestao = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Respostas_%d.txt",nome, i);
		
		File file = new File(nomedaquestao);
		
		try {												//O eclipse que sugeriu colocar isso aqui pró código rodar
			if (file.createNewFile())						
				{
					System.out.println("Arquivo Criado");
					Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
					arquivo.escreve(respostatxt, nomedaquestao);				//Escreve no arquivo
					break;
				} else {
					System.out.println("Já existe um arquivo com esse nome");
				}
		} catch (IOException e) {
		e.printStackTrace();							//Eclipse tb sugeriu isso aqui
		}
		}
		
		
		
		}
		
	}
}
