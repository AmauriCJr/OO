package form;
import java.awt.BorderLayout;
import java.awt.Checkbox;

import javax.swing.JCheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Alternativa extends QuestaoFechada {
    	static  ArrayList<String> opcoes = new ArrayList<String>();

        void criar(){
          
		 
          
             
        	int  numeroAlt = 0;
              
        	String texto = "";
        	
        	String numeroAltStr = JOptionPane.showInputDialog("Informe o número de alternativas:");
        	String nomePergunta = JOptionPane.showInputDialog("Informe qual é a pergunta:");
        	numeroAlt = Integer.parseInt(numeroAltStr);
                
                 
        	for(int i = 1;i<=numeroAlt;i++)
        	{             
        		String nome = JOptionPane.showInputDialog("Informe o nome da alternativa:");
        		opcoes.add(nome);
				texto = texto +  nome + ".";
                   
        	}
              
        
                    
                    
        	String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Questao_%d.txt",pastadestino, numeroquestao); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
        	//é tipo o sprintf em C
                    
        	numeroquestao = numeroquestao +1;
        	tipopergunta = 3;
 	
        	texto = tipopergunta + "^" + nomePergunta + "." + texto;
                    
        	Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
        	arquivo.escreve(texto, nomedoarquivo);				//Escreve no arquivo
        
            }  
         
} 
