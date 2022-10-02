package Practica2;

import javax.swing.JFrame;

public class Ejecucion {

	public static void main(String[] args) {
	 Ventana1 ventana1=new Ventana1();	
		ventana1.setVisible(true);
		ventana1.setSize(300,300);
		ventana1.setTitle("VENTANA 1");
		ventana1.setResizable(false);
		ventana1.setLocationRelativeTo(null);
		
	Ventana2 ventana2=new Ventana2();	
		ventana2.setVisible(true);
		ventana2.setSize(300,300);
		ventana2.setTitle("VENTANA 2");
		ventana2.setResizable(true);
		
	Ventana3 ventana3=new Ventana3();	
	ventana3.setVisible(true);
	ventana3.setBounds(900,200,600,600);
	ventana3.setSize(300,300);
	ventana3.setResizable(false);
	
	}
}
