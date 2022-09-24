package Classes;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame {
	
	public Janela()
	{
		//alterando nome da janela
		super("Janela");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Quadro painel = new Quadro();
		add(painel);
		
		//definindo tamanho da janela
		setSize(500,500);
		//deixando janela visivel
		setVisible(true);
		
		
	}

}
