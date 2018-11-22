import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Main {


	public static void main(String[] args) throws IOException {
	
		String nome = "nome";
		
		String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s.txt", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
		//é tipo o sprintf em C
		
		
		File file = new File(nomedoarquivo);				//Cria o arquivo com o nome escolhido
		
		
		try {												//O eclipse que sugeriu colocar isso aqui pró código rodar
			if (file.createNewFile())						//Cria o txt
			{
			    System.out.println("File is created!");
			} else {
			    System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();							//Eclipse tb sugeriu isso aqui
		}
		 
		
	}
	

}
