package form;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class Opcional extends QuestaoFechada{
    	static  ArrayList<String> opcoes = new ArrayList<String>();

            void criar(){
          
            	String texto = "";
            	
    
            	String nomePergunta = JOptionPane.showInputDialog("Informe qual é a pergunta:");  
                 
            	String nomedoarquivo = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Questao_%d.txt",pastadestino, numeroquestao); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
            	//é tipo o sprintf em C
                        
            	numeroquestao = numeroquestao +1;
            	tipopergunta = 6;
     	
            	texto = tipopergunta + "^" + nomePergunta + ".";
                        
            	Escreve arquivo = new Escreve();					//Cria uma referência pra classe que escreve
            	arquivo.escreve(texto, nomedoarquivo);	
                
               // Object[] result = yes_no.toArray();
                          
                        
                            
                            
        }
                       
                       
                    } 
