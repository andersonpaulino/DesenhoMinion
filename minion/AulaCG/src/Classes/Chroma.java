package Classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Chroma extends JPanel {
		
	
	@Override
	protected void paintComponent(Graphics graph) {
		// TODO Auto-generated method stub
		super.paintComponent(graph);
		
		Graphics2D g = (Graphics2D) graph;
		
		BufferedImage img;
		BufferedImage ceu;
		
		
		
		try 
		{
			img = ImageIO.read(new File("imagens/foto.jpg"));
			ceu = ImageIO.read(new File("imagens/ceu.jpg"));
			
			int largura = img.getWidth();
			int altura = img.getHeight();
			
			for (int i = 0; i < altura; i++) {
				for (int j = 0; j < largura; j++) {
					
					Color px = new Color(img.getRGB(j, i));
					int red = px.getRed();
					int green = px.getGreen();
					int blue = px.getBlue();
					
					if(green > 77 && red < 105 && blue < 73){
						
						img.setRGB(j, i, ceu.getRGB(j, i));
					}
				}
				
			}
			
			g.drawImage(img, null, 10, 10);

			
		} catch (IOException e) {
			
						
		}
		
	}

}
