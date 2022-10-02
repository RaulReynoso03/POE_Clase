package Practica;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class Ventana3 extends JFrame {
	
	Ventana3() {
		
		setTitle("VENTANA_2");
		setBounds(700, 0, 490,350);	
		contenido();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void contenido() {	
		Container con=new Container();
		JLabel nom=new JLabel("Nombre de usuario");
		JLabel est=new JLabel("Contraseña");
		JLabel sexo=new JLabel("Aceptas nuestros terminos");
		
		JTextField tnom=new JTextField(15);

		JTextField test=new JTextField(10);
		
		JButton aceptar=new JButton("Iniciar seccion");
		JButton registro=new JButton("Regristrarme");
		
		JRadioButton mujer=new JRadioButton("Si");
		JRadioButton hombre=new JRadioButton("No");
		
		FlowLayout v1=new FlowLayout(FlowLayout.RIGHT,30,40);
		FlowLayout v2=new FlowLayout(FlowLayout.RIGHT,30,40);
		FlowLayout v3=new FlowLayout(FlowLayout.RIGHT,30,40);
		FlowLayout v4=new FlowLayout(FlowLayout.RIGHT,30,40);
		
		con.setLayout(v1);
		
		this.add(con);
		con.add(nom);		con.add(tnom);

		
		con.setLayout(v2);
		this.add(con);
		
		con.add(est);		con.add(test);
		
		con.setLayout(v3);
		this.add(con);
		con.add(sexo);   	con.add(mujer); con.add(hombre);
		
		con.setLayout(v4);
		this.add(con);
		con.add(aceptar); 	con.add(registro);
		}
	

}
