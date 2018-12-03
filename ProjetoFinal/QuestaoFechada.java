package form;
import java.io.IOException;

import javax.swing.JOptionPane;

public class QuestaoFechada extends Questao {


    public static void novaQuestaoFechada() throws IOException {
        String opcoes[] = {
            "-- Selecione sua opcao --",
            "Lista", 
            "Exclusiva", 
            "Alternativa", 
            "Opcional", 
            "Retornar ao Menu Anterior"  }; 
        
        Object opcao = JOptionPane.showInputDialog(null, "Questoes Fechadas", 
        "Formulario", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
       

            switch (opcao.toString()) {
           
             case "Alternativa":
                 Alternativa as = new Alternativa();
                 as.criar();
            break;
    
            case "Exclusiva":  
                 Exclusiva e = new Exclusiva();
                 e.criar();
            break;

            case "Lista":
                 Lista l = new Lista();
                 l.criar();
            break;


            case "Opcional":
                 Opcional o = new Opcional();
                 o.criar();
            break;
            case "Retornar ao Menu Anterior":
            new Questao();
    		Questao.mostrar();
        	
            break;
            }
    }
