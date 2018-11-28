import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws IOException {

		Questao formulario = new Questao();
		Responder form = new Responder();
		
		JFrame f=new JFrame("Criador de formulário");
	    
	    
	    JButton criar=new JButton("Criar");
	    criar.setBounds(100,50,200,30); 
	    JButton responder=new JButton("Responder"); 
	    responder.setBounds(100,100,200,30);
	    JButton sair=new JButton("Sair"); 
	    sair.setBounds(100,150,200,30);
	    
	    f.add(responder); 
	    f.add(criar);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	    criar.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		formulario.criar();
	        }          
	    });
		
	    responder.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		try {
					form.responder();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	        }          
	    });
	    
	    sair.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		
	        }          
	    });
		
		
	}
}

