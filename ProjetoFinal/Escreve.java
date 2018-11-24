import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class Escreve {

	public void escreve(String texto, String nomedoarquivo) {
	
	File file = new File(nomedoarquivo);	

	try {
	FileWriter writer = new FileWriter(file);			
	writer.write(texto);								//Escreve no txt
	writer.close();										//Fecha o txt
	} catch (IOException e) {
		e.printStackTrace();							//Eclipse tb sugeriu isso aqui
	}
	 
	
	
	}
}
