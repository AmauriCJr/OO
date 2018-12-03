package form;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Questao extends Formulario{
 	
	
	protected static int numeroquestao = 1;
	protected static int tipopergunta = 0;

    public static void mostrar() throws IOException  {
        	String opcoes[] = {
        			"-- Selecione sua opcao --",
        			"Questao Aberta", 
        			"Questao Fechada", 
        			"Retornar ao Menu Anterior"  }; 
        
        	Object opcao = JOptionPane.showInputDialog(null, "Escolha um tipo de questão", 
        			"Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       
  
        	switch (opcao.toString()) {
        	case "Questao Aberta":
        		QuestaoAberta qa = new QuestaoAberta();
        		qa.novaQuestaoAberta();
        		break;

	
        	case "Questao Fechada":	
        		QuestaoFechada qf = new QuestaoFechada();
        		qf.novaQuestaoFechada();
        		break;
        		
        	case "Retornar ao Menu Anterior":
        		new Formulario();
        		Formulario.mostrar();
            	break;

        
				}

        	
        	
    }
      public static void main() throws IOException {
    	  
         while(true)
          {
        	 new Questao();
        	 Questao.mostrar();
          }
      }
       
       
       

}
