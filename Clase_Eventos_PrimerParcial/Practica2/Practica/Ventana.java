package Practica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {
	
	private JButton boton1,boton2,boton3;
	private JLabel lable1,lable2;
	private JTextField text1;
	
	
	public Ventana() {
		
		setLayout(null);
		lable1= new JLabel("Ingresa un texto:");
		lable1.setBounds(10,10,100,30);
		add(lable1);
		
		lable2= new JLabel("NO TOCAR--->");
		lable2.setBounds(10,100,200,30);
		add(lable2);
		
		boton2=new JButton("Precioname");
		boton2.setBounds(310,100,200,20);
		add(boton2);
		boton2.addActionListener((ActionListener) this);
		
		text1 =new JTextField("");
		text1.setBounds(120, 17, 150, 20);
		add(text1);
		
		boton1=new JButton("Aceptar");
		boton1.setBounds(360,15,90,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed1(ActionEvent e) {
		if(e.getSource()==boton1) {
			String texto = text1.getText();
			setTitle(texto);
		}
	}
	
	public void actionPerformed(ActionEvent a) {
		if (a.getSource()== boton2) {
			lable2.setText("Se a precionado el boton ");
}
}		
	
	}


