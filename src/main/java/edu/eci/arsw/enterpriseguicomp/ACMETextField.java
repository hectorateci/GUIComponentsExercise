package edu.eci.arsw.enterpriseguicomp;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTextField;

public class ACMETextField extends JTextField {

	public ACMETextField() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ACMETextField(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x1i=0;
		int y1i=this.getHeight();
		int x2i=5;
		int y2i=0;
		
		g.setColor(Color.RED);
		
		for (int i=0;i<100;i++){
			g.drawLine(x1i, y1i, x2i, y2i);
			x1i+=10;
			x2i+=10;
		}
		
		// TODO Auto-generated method stub
		
	}

	
	
}
