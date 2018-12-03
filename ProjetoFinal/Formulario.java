package form;
import java.io.IOException;
import java.io.File;
import javax.swing.JOptionPane;


public class Formulario {
	
	protected static String pastadestino;
	protected static int numRespostas = 1;

	public static void mostrar() throws IOException {
        String opcoes[] = {
        "-- Selecione sua opcao --",
        "Criar", 
        "Responder" }; 
        
        Object opcao = JOptionPane.showInputDialog(null, "Menu Principal", 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
        switch (opcao.toString()) {
	
        case "Responder":
        	Responder r = new Responder();
	        r.responder();
        	
        break;
            
        case "Criar":	
             
		String nome = JOptionPane.showInputDialog("Informe o Titulo do formulário:");
		
		pastadestino = nome;
		
		String nomedapasta = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
		//é tipo o sprintf em C
		
		
		
		File pasta = new File(nomedapasta);
        pasta.mkdir();											//Cria uma pasta para guardar as perguntas
		
								
		
		
		String texto = JOptionPane.showInputDialog("Informe a descricao desejado:");
		
		
		String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Descricao.txt", nome); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
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
			
			
			
	        Questao.main();
	        break;
			

            }
		}

    public static void main(String[] args) throws IOException {
    	
    	
    	
    	while(true)
    	{
    	new Formulario();
		Formulario.mostrar();
    	}
    }
    
    
       
}
