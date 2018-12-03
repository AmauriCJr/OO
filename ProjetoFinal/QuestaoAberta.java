package form;

import java.io.IOException;

import javax.swing.JOptionPane;

public class QuestaoAberta extends Questao {

	
    public static void novaQuestaoAberta() throws IOException  {
    
        	String opcoes[] = {
        			"-- Selecione sua opcao --",
        			"Resposta Curta", 
        			"Resposta de tamanho livre", 
        			"Retornar ao Menu Anterior"  }; 
        
        	Object opcao = JOptionPane.showInputDialog(null, "Questoes Abertas", 
        			"Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
        	switch (opcao.toString()) {
            case "Resposta Curta":
            	QuestaoCurta qc = new QuestaoCurta();
            	qc.criar();
            	break;
	
            case "Resposta de tamanho livre":
            	QuestaoLonga ql = new QuestaoLonga();
            	ql.criar();
            	break;
            	
            case "Retornar ao Menu Anterior":
            	new Questao();
        		Questao.mostrar();
            	break;
			}

       
    
       
       
    }
}
