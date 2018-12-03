package form;

import java.util.ArrayList;
//import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Exclusiva extends QuestaoFechada {
    	static  ArrayList<String> opcoes = new ArrayList<String>();


            void criar(){
          
		 
         
             
            	int  numeroAlt = 0;
                 
            	String texto = "";
            	
            	String numeroAltStr = JOptionPane.showInputDialog("Informe o número de alternativas:");
            	String nomePergunta = JOptionPane.showInputDialog("Informe qual é a pergunta:");
            	numeroAlt = Integer.parseInt(numeroAltStr);
                
                 
            	for(int i = 1;i<=numeroAlt;i++)
            	{             
            			String nome = JOptionPane.showInputDialog("Informe o nome da alternativa");
            			texto = texto +  nome + ".";
               
            	}
              
            	Object[] result = opcoes.toArray();
            
            	
            	
            	String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Questao_%d.txt",pastadestino, numeroquestao); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
            	//é tipo o sprintf em C
            	
            	numeroquestao = numeroquestao +1;
            	tipopergunta = 4;
     	
            	texto = tipopergunta + "^" + nomePergunta + "." + texto;
                        
            	Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
            	arquivo.escreve(texto, nomedoarquivo);				//Escreve no arquivo
            	
                    
          // Object[] result = jradiobotoes.toArray();
                   
		// int x = JOptionPane.showOptionDialog(null, nomePergunta, "nao esqueca de marcar",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, result, result[0]);
                 
            }  
         
 }
