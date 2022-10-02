package Practica2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana2 extends JFrame implements ActionListener{

	private JLabel label1;
	private JButton boton1;
	
	public Ventana2() {
	
		setLayout(null);
		boton1=new JButton("Precioname ");
		boton1.setBounds(36,150,150,50);
		add(boton1);
		boton1.addActionListener((ActionListener) this);//Linea para agregar un evento;

		label1 = new JLabel("Preciona el boton :D");
		label1.setBounds(10,10,300,30);
		add(label1);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== boton1) {
			label1.setText("Se a precionado el boton ");
}
}
}