import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.File;


public class Responder {


	public static void main(String[] args) throws IOException {}
	
		void responder() throws IOException {
		
		char [] lidochar = new char[100];
		
		String tipo;
		
		String lido = "";
			
		String nome = JOptionPane.showInputDialog("Informe o nome do formulário que deseja responder:");
		
		String nomedaquestao = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s", nome);
		
		File pasta =new File(nomedaquestao);
		
		boolean teste = pasta.exists();							//cria uma variavel pra testar se a pasta existe
		
		if(teste == true)										//testa se a pasta existe
		{
		
		String respostatxt = "";
		
		
		for (int i = 1; i < 10000; i++) 
		{
			lido = "";
		
			nomedaquestao = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\%s_Questao_%d.txt",nome, nome, i); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
			
			
			
			File file = new File(nomedaquestao);				//Cria o arquivo com o nome escolhido para colocar as respostas
		
			if(file.exists() && !file.isDirectory()) 			//checa se a questão existe
			{ 
			
				FileReader ler = new FileReader(nomedaquestao);
								
						
				ler.read(lidochar);
					
				for(char c : lidochar) {
					tipo = lido + c;
					if(c == '^')
						break;
				}
					      
				for(char c : lidochar) {
					lido = lido + c;
					if(c == '^')
						lido ="";
				}
						
						
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
		
		String arquivoresposta = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Respostas_%d.txt",nome, i);
		
		File file = new File(arquivoresposta);
		
		try {									
			if (file.createNewFile())						
				{
					System.out.println("Arquivo Criado");
					Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
					arquivo.escreve(respostatxt, arquivoresposta);				//Escreve no arquivo
					break;
				} else {
					System.out.println("Já existe um arquivo com esse nome");
				}
		} catch (IOException e) {
		e.printStackTrace();					
		}
		}
		
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Formulário não existe");
			
		}
		}
		
	}
