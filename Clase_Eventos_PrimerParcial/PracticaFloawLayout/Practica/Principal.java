package Practica;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class Principal extends JFrame {
	
	Principal() {
		
		setTitle("VENTANA_1");
		setBounds(0, 0, 500,400);

		contenido();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void contenido() {	
		Container con=new Container();
		JLabel nom=new JLabel("Nombre");
		JLabel car=new JLabel("Edad");
		JLabel est=new JLabel("Numero de telefono(10 digitos)");
		JLabel sexo=new JLabel("Seleciona tu sexo");
		
		JTextField tnom=new JTextField(15);
		JTextField tcar=new JTextField(3);
		JTextField test=new JTextField(10);
		
		JButton aceptar=new JButton("Aceptar");
		
		JRadioButton mujer=new JRadioButton("Mujer");
		JRadioButton hombre=new JRadioButton("Hombre");
		
		FlowLayout v1=new FlowLayout(FlowLayout.LEFT,50,50);
		FlowLayout v2=new FlowLayout(FlowLayout.LEFT,50,20);
		FlowLayout v3=new FlowLayout(FlowLayout.LEFT,50,40);
		FlowLayout v4=new FlowLayout(FlowLayout.LEFT,50,60);
		
		con.setLayout(v1);
		
		this.add(con);
		con.add(nom);		con.add(tnom);
		con.add(car);		con.add(tcar);
		
		
		con.setLayout(v2);
		this.add(con);
		con.add(est);		con.add(test);
		
		con.setLayout(v3);
		this.add(con);
		con.add(sexo);   	con.add(mujer); con.add(hombre);
		
		con.setLayout(v4);
		this.add(con);
		con.add(aceptar);
		}
	

}
