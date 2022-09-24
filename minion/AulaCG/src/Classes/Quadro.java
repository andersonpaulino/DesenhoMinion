package Classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class Quadro extends JPanel{
	
	@Override
	protected void paintComponent(Graphics graph) {
		// TODO Auto-generated method stub
		super.paintComponent(graph);
		
		Graphics2D g = (Graphics2D)graph;
		
        
		//cabeça
		g.setColor(Color.yellow);
		g.fillArc(270, 140, 170, 80, 0, 180);
		
		
		//corpo
		g.setColor(Color.yellow);
		g.fillRect(270, 171, 170, 150);
		
		//braço esquerdo
		g.setColor(Color.yellow);
		g.drawOval(430, 260, 20, 90);
		g.fillOval(430, 260, 20, 90);
		
		//mao esquerda
		g.setColor(Color.black);
		g.drawRoundRect(433, 340, 15, 10, 10, 7);
		g.fillRoundRect(433, 340, 15, 10, 10, 7);
		g.fillOval(431, 348, 12, 7);
		g.fillOval(435, 348, 8, 13);
		g.fillOval(440, 348, 7, 9);
		
		//braço direito
		g.setColor(Color.yellow);
		g.drawOval(260, 260, 20, 90);
		g.fillOval(260, 260, 20, 90);
		
		//mao direita
		g.setColor(Color.black);
		g.drawRoundRect(263, 340, 15, 10, 10, 7);
		g.fillRoundRect(263, 340, 15, 10, 10, 7);
		g.fillOval(263, 340, 8, 15);
		g.fillOval(267, 340, 8, 21);
		g.fillOval(271, 346, 9, 9);
		
		//calça
		g.setColor(Color.decode("#1480F5"));
		g.fillArc(270, 280, 170, 80, 180, 180);
		
		
		//pe esquerdo
		g.setColor(Color.black);
		g.fillRoundRect(373, 362, 30, 20, 5, 5);
		g.fillOval(378, 372, 35, 15);
		
		//pe direito
		g.setColor(Color.black);
		g.fillRoundRect(305, 362, 30, 20, 5, 5);
		g.fillOval(295, 372, 38, 16);
		
		//perna da calça
		g.setColor(Color.decode("#1480F5"));
		g.fillRect(300, 340, 40, 30); //direita
		g.fillRect(370, 340, 40, 30); //esquerda
		
		//alça da calça
		AffineTransform old = g.getTransform();
		g.rotate(Math.toRadians(18));
		g.setColor(Color.decode("#1480F5"));
		g.fillRect(340, 170, 50, 10);
		g.setTransform(old);
		
		AffineTransform old2 = g.getTransform();
		g.rotate(Math.toRadians(-18));
		g.fillRect(280, 385, 55, 10);
		g.setTransform(old2);
		
		//regiao central da calça
		g.setColor(Color.decode("#1480F5"));
		g.fillRect(310, 280, 80, 40);
		g.setColor(Color.black);
		g.drawRoundRect(330, 300, 40, 20, 10, 10);
		
		//detalhes da calça
		g.setColor(Color.black);
		g.fillOval(307, 282, 7, 7);
		g.fillOval(380, 282, 7, 7);
		
		g.drawArc(409, 305, 30, 30, 180, 180);
		g.drawArc(270, 305, 30, 30, 180, 180);
		
		//oculos
		g.setColor(Color.gray);
		g.drawOval(350, 160, 50, 50);
		g.drawOval(300, 160, 50, 50);
		g.fillOval(340, 150, 70, 70);
		g.fillOval(290, 150, 70, 70);
		
		//globo ocular
		g.setColor(Color.white);
		g.fillOval(350, 160, 50, 50);
		g.fillOval(300, 160, 50, 50);
		//contorno da palpebra
		g.setColor(Color.black);
		g.drawArc(350, 170, 50, 40, 180, 180);
		g.drawArc(300, 170, 50, 40, 180, 180);
		
		//preenchimento palpebras
	//	g.setColor(Color.yellow);
	//	g.fillArc(350, 170, 50, 40,180, 180);
	//	g.fillArc(300, 170, 50, 40,180, 180);
		
		//olho
	    g.setColor(Color.decode("#965D0E"));
	    g.fillOval(350, 170, 25, 25);
		g.fillOval(300, 170, 25, 25);
		
		g.setColor(Color.black);
		g.fillOval(350, 172, 20, 20);
		g.fillOval(300, 172, 20, 20);
		
		//parte do oculos
		g.drawRect(408, 172, 30, 20);
		g.fillRect(408, 172, 30, 20);
		g.drawRect(271, 172, 20, 20);
		g.fillRect(271, 172, 20, 20);
		
		//boca
		g.setColor(Color.black);
		g.fillArc(332, 240, 30, 10,0, 180);
		
		

	}

}
