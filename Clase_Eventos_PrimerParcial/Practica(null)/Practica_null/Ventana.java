package Practica_null;
import java.awt.Component;
import java.awt.Container;

import javax.swing.*;
public class Ventana extends JFrame {

	public Ventana() {
			
	Container hoja=new Container();	
		
	JLabel iblcar = new JLabel("Carrera");
	
	
	JTextField tx=new JTextField(10);

	hoja.setLayout(null);
	
	
	hoja.add(iblcar);
	hoja.add(tx);
	iblcar.setBounds(50,50,100,30);
	this.add(hoja);
	
	}
	
}
