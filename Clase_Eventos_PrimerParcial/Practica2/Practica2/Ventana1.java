package Practica2;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ventana1 extends JFrame implements ActionListener {
	
	private JButton boton1;
	private JLabel label1;
	public Ventana1() {
		
		setLayout(null);
		boton1 = new JButton("Hola");
		boton1.setBounds(150,200,60,20);
		add(boton1);
		
		label1=new JLabel("Ventana 1");
		label1.setBounds(20,60,200,10);
		add(label1);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public Image getIconImage() {
		Image retValue =Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagen/Logo_TV_2015.png"));
		return retValue;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
