package edu.eci.arsw.enterpriseguicomp;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

public class ACMEButton extends JButton {

	public ACMEButton() {
		super();		
	}

	public ACMEButton(String arg0) {
		super(arg0);			
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		
		int x1i=0;
		int y1i=this.getHeight();
		int x2i=5;
		int y2i=0;
		
		for (int i=0;i<10;i++){
			g.drawLine(x1i, y1i, x2i, y2i);
			x1i+=10;
			x2i+=10;
		}
		
	}

	
	
}
