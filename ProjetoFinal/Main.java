import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Questao formulario = new Questao();
		
		formulario.criar();
		
		Responder form = new Responder();
		
		form.responder();
	}
}



