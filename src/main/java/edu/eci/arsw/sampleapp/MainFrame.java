package edu.eci.arsw.sampleapp;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import edu.eci.arsw.enterpriseguicomp.ACMEButton;
import edu.eci.arsw.enterpriseguicomp.ACMESignatures;
import edu.eci.arsw.enterpriseguicomp.ACMETextArea;
import edu.eci.arsw.enterpriseguicomp.ACMETextField;

public class MainFrame extends JFrame {

	
	ACMEButton b1;
	ACMEButton b2;
	ACMETextField tf;
	ACMETextArea ta;
	ACMESignatures as;
	
	public MainFrame(String arg0) throws HeadlessException {
		
		super(arg0);		
		
		as=new ACMESignatures();
		
		this.setTitle(as.getCompanyDescription());
		
		this.setLayout(null);
		
		b1=new ACMEButton();
		b1.setText("Press this button");
		b1.setSize(100,100);
		b1.setLocation(10,200);
		
		b2=new ACMEButton();
		b2.setText("Say hi!");
		b2.setSize(100,50);
		b2.setLocation(200,300);
		
		b2.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null, "Hello!, by:"+as.getCompanyName());
					}
				}
		);
		
		
		
		tf=new ACMETextField();
		tf.setSize(100,20);
		tf.setLocation(10,100);
		
		tf.setText("This application was provided by:"+as.getCompanyName());
		
		
		ta=new ACMETextArea();
		ta.setText("Enter text here!. Remember to call us at:"+as.getPhone()+"\nEmail:"+as.getContactEmail());
		
		
		JScrollPane jsp=new JScrollPane();
		jsp.getViewport().add(ta);
		jsp.setSize(200,200);
		jsp.setLocation(150,50);
		
		this.getContentPane().add(b1);
		this.getContentPane().add(b2);
		this.getContentPane().add(tf);
		this.getContentPane().add(jsp);
		
	}
	
	public static void main(String[] args) {
		MainFrame mf=new MainFrame("");
		
		mf.setSize(400,400);
		mf.setVisible(true);
	}

	
	
}
