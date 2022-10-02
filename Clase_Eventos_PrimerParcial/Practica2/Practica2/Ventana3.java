package Practica2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana3 extends JFrame implements ActionListener{

	private JTextField text1;
	private JButton boton1;
	private JLabel lable1;
	
	public Ventana3() {
		
		setLayout(null);
		lable1= new JLabel("Ingresa un texto:");
		lable1.setBounds(10,10,100,30);
		add(lable1);
		
		text1 =new JTextField("");
		text1.setBounds(120, 17, 150, 20);
		add(text1);
		
		boton1=new JButton("Aceptar");
		boton1.setBounds(100,80,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String texto = text1.getText();
			setTitle(texto);
		}
	}
	}			
	