public class Main {


	public static void main(String[] args) throws IOException {
	
		String nome = "batata";
		
		String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s.txt", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
		//é tipo o sprintf em C
		
		
		File file = new File(nomedoarquivo);				//Cria o arquivo com o nome escolhido
		
		
		try {												//O eclipse que sugeriu colocar isso aqui pró código rodar
			if (file.createNewFile())						
			{
			    System.out.println("Arquivo Criado");
			} else {
			    System.out.println("Já existe um arquivo com esse nome");
			}
		} catch (IOException e) {
			e.printStackTrace();							//Eclipse tb sugeriu isso aqui
		}
		 
		Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
		arquivo.escreve(nome, nomedoarquivo);				//Escreve no arquivo
			
	}
	

}

