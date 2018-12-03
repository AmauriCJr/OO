package form;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.io.FileReader;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.io.File;


public class Responder extends Formulario{
	

		static  ArrayList<String> opcoes = new ArrayList<String>();
	
		void responder() throws IOException {
		
		char [] lidochar = new char[100];
		
		int  j = 1,  verificador = 0;
		
		
		String tipo = "", resposta = "", nomePergunta = "";
		
		String lido = "";
		
		String endereco;
		
		char borracha = ' ';
		
		Escreve arquivo = new Escreve();
			
		String nome = JOptionPane.showInputDialog("Informe o nome do formulário que deseja responder:");
		
		String nomedaquestao = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s", nome);
		
		
		
		
		String pastaResposta = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Respostas_%d",nome, numRespostas);
		
		File pastaRespostas = new File(pastaResposta);
        pastaRespostas.mkdir();
		
		File pasta =new File(nomedaquestao);
		
		boolean teste = pasta.exists();							//cria uma variavel pra testar se a pasta existe
		
		if(teste == true)										//testa se a pasta existe
		{
		
		
		
		while(true) 
		{
			
			System.out.println("to aqui");
			nomePergunta = "";
			lido = "";
			
			verificador = 0;
			
			opcoes.clear();
			opcoes.removeAll(opcoes);
			System.out.println("caralho" + opcoes);
			
			pastaResposta = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Respostas_%d",nome, numRespostas);
			lido = "";
		
			nomedaquestao = String.format("C:\\Users\\amaur\\OneDrive\\Área de Trabalho\\Teste\\%s\\Questao_%d.txt",nome, j); //cria uma variavel com o caminho do arquivo e o nome especifico do formulario
			//é tipo o sprintf em C
			
			
			
			File file = new File(nomedaquestao);				//cria a referencia para abrir a questão
		
			if(file.exists() && !file.isDirectory()) 			//checa se a questão existe
			{ 
			
				FileReader ler = new FileReader(nomedaquestao);
								
						
				ler.read(lidochar);
					
				for(char c : lidochar) {
					if(c == '^') {
						c = borracha;
						break;
					}
					tipo = lido + c;
				}
				
				System.out.println(tipo);
				
				Object[] result; 
				
				
				int x = 0;
				
				switch (tipo) {
	        	case "1":
	        		opcoes.clear();
	        		opcoes.removeAll(opcoes);
	        		result =opcoes.toArray();
	        		nomePergunta = "";
	        		int tamanhoResposta = 0;
	        		for(char c : lidochar) {
						lido = lido + c;
						if(c == '^')
							lido ="";
						if (tamanhoResposta >= 120)
						{
							c = borracha;
							break;
						}
					}
	        		resposta = JOptionPane.showInputDialog(lido);
					 
					ler.close();
					
					endereco = String.format("\\RespostaQuestao_%d.txt", j);
					
					pastaResposta = pastaResposta + endereco;
					
					arquivo.escreve(resposta, pastaResposta);				//Escreve no arquivo
	        		
					opcoes.clear();
					opcoes.removeAll(opcoes);
					nomePergunta = "";
	        		break;
	        	case "2":
	        		opcoes.clear();
	        		result =opcoes.toArray();
	        		nomePergunta = "";
	        		for(char c : lidochar) {
						lido = lido + c;
						if(c == '^')
							lido ="";
						
					}
	        		resposta = JOptionPane.showInputDialog(lido);
					 
					ler.close();
	        		
					endereco = String.format("\\RespostaQuestao_%d.txt", j);
					
					pastaResposta = pastaResposta + endereco;
					
					arquivo.escreve(resposta, pastaResposta);					//Escreve no arquivo
	        		
					opcoes.clear();
					opcoes.removeAll(opcoes);
					nomePergunta = "";
	        		
	        		break;
	        	case "3":
	        		opcoes.clear();
	        		opcoes.removeAll(opcoes);
	        		result =opcoes.toArray();
	        		nomePergunta = "";
	        		
	        		for(char c : lidochar) {
	        			if(c == '.') {
	        				c = borracha;
							break;
	        			}
	        			nomePergunta =nomePergunta + c;
						if(c == '^')
							nomePergunta = "";
						
					}
	        		for(char c : lidochar) {
	        			lido = lido + c;
	        			if (c == '.' && verificador == 1) {
	        				opcoes.add(lido);
	        				lido = "";
	        			}
						if(c == '.' && verificador == 0) {
							lido = "";
							verificador = 1;
						}
	        		}  
	        		
	        		
	        		ler.close();
	             
	        		result =opcoes.toArray();

	                JPanel gui = new JPanel(new BorderLayout());
	                JList<Object> list = new JList<Object>(result);
	                gui.add(new JScrollPane(list));

	                JOptionPane.showMessageDialog(null, gui,nomePergunta,JOptionPane.QUESTION_MESSAGE);
	                List items = (List)list.getSelectedValuesList();
	                for (Object item : items) {
	                	resposta = resposta + item;
	                }
	                
        			
	        		
        			endereco = String.format("\\RespostaQuestao_%d.txt", j);
					
					pastaResposta = pastaResposta + endereco;
					
					arquivo.escreve(resposta, pastaResposta);				//Escreve no arquivo
        			
					opcoes.clear();
					opcoes.removeAll(opcoes);
					nomePergunta = "";
					
	        		break;
	        	case "4":
	        		opcoes.clear();
	        		opcoes.removeAll(opcoes);
	        		result =opcoes.toArray();
	        		nomePergunta = "";
	        		for(char c : lidochar) {
	        			if(c == '.') {
	        				c = borracha;
							break;
	        			}
	        			nomePergunta =nomePergunta + c;
						if(c == '^')
							nomePergunta = "";
						
					}
	        		for(char c : lidochar) {
	        			lido = lido + c;
	        			if (c == '.' && verificador == 1) {
	        				opcoes.add(lido);
	        				lido = "";
	        			}
						if(c == '.' && verificador == 0) {
							lido = "";
							verificador = 1;
						}
	        		}  
	        		
	        		result = opcoes.toArray();
	        		
	        		ler.close();
	        		
	        		x = JOptionPane.showOptionDialog(null, nomePergunta, "nao esqueca de marcar",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, result, result[0]);


	                if (x != -1 && result[x] != "sair") {
	                System.out.println("Sua escolha foi: " + result[x]);
	                } else if(result[x]== "sair") {
	                	System.out.println("nao escolheu nada");
	                }
	                else{
	                	System.out.println("lul");
	                }
	        		
	                resposta = "" + result[x];
	        		
        			endereco = String.format("\\RespostaQuestao_%d.txt", j);
					
					pastaResposta = pastaResposta + endereco;
					
					arquivo.escreve(resposta, pastaResposta);				//Escreve no arquivo
        			
					opcoes.clear();
					opcoes.removeAll(opcoes);
					nomePergunta = "";
	        		
	        		break;
	        	case "5":
	        		opcoes.clear();
	        		opcoes.removeAll(opcoes);
	        		result =opcoes.toArray();
	        		nomePergunta = "";
	        		
	        		for(char c : lidochar) {
	        			if(c == '.') {
	        				c = borracha;
							break;
	        			}
	        			nomePergunta =nomePergunta + c;
						if(c == '^')
							nomePergunta = "";
						
					}
	        		for(char c : lidochar) {
	        			lido = lido + c;
	        			if (c == '.' && verificador == 1) {
	        				opcoes.add(lido);
	        				lido = "";
	        			}
						if(c == '.' && verificador == 0) {
							lido = "";
							verificador = 1;
						}
	        		}
	        		
	        		result = opcoes.toArray();

	        		ler.close();

	                Object y = JOptionPane.showInputDialog(null, "Escolha", "Formulario", JOptionPane.QUESTION_MESSAGE, null, result, result[0]);
	        		
	        		
	        		resposta = "" + y;
	        		
	        		endereco = String.format("\\RespostaQuestao_%d.txt", j);
					
					pastaResposta = pastaResposta + endereco;
					
					arquivo.escreve(resposta, pastaResposta);
	        		
					opcoes.clear();
					opcoes.removeAll(opcoes);
					nomePergunta = "";
					
	        		break;
	        	case "6":
	        		opcoes.clear();
	        		opcoes.removeAll(opcoes);
	        		result =opcoes.toArray();
	        		nomePergunta = "";
	        		for(char c : lidochar) {
	        			if(c == '.') {
	        				c = borracha;
							break;
	        			}
	        			nomePergunta =nomePergunta + c;
						if(c == '^')
							nomePergunta = "";
						
					}
	        		for(char c : lidochar) {
	        			lido = lido + c;
	        			if (c == '.' && verificador == 1) {
	        				opcoes.add(lido);
	        				lido = "";
	        			}
						if(c == '.' && verificador == 0) {
							lido = "";
							verificador = 1;
						}
	        		}  
	        			
	        		 opcoes.add(nomePergunta);
	        		
	        		 System.out.println("caralho" + opcoes);
	        		 
	        		 ler.close();
	        		 
	        		 ArrayList<String> yes_no = new ArrayList<String>();
	        		 for (int p = 0; p < opcoes.size(); p++) 
	        		 {
	        			 String alternativa = new String(opcoes.get(p));
	        			 yes_no.add(alternativa);
	        			 x = JOptionPane.showConfirmDialog(null, alternativa, "Escolha uma opcao", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
	  		  
	        		 }
	        		 
	        		if (x == 0) {
	        			resposta = "Sim";	
	        		}
	        		 if(x == 1) {
	        			 resposta = "Não";
					}

	        		result = yes_no.toArray();
		        		
	                endereco = String.format("\\RespostaQuestao_%d.txt", j);
						
	                pastaResposta = pastaResposta + endereco;
	                  
	                arquivo.escreve(resposta, pastaResposta);
	        		
	                opcoes.clear();
	                opcoes.removeAll(opcoes);
	                nomePergunta = "";
	                
	        		break;
						
				}	
			}else 
			{
				break;
			}
			
			j = j + 1;
		}
		
		
		}
		else {
			JOptionPane.showMessageDialog(null, "Formulário não existe");
			
		}
		}
		
	}
