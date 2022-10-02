package PracticaMenus;

	 import java.awt.BorderLayout;
	 import java.awt.Color;
	 import java.awt.FlowLayout;
	 import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
	 import javax.swing.JMenuBar;
	 import javax.swing.JMenuItem;
	 import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


	 public class Ventana extends JFrame {

			private JTextField texto;
			private JScrollPane barra1,barra2;
			private JTextArea area;
	 	
	 	public Ventana() {
	 		
	 		setLayout(null);
	 		
	 		setTitle("Formulario");
	 		
	 		JMenuBar menu=new JMenuBar();
	 		JMenu munu1=new JMenu("Opciones");
	 		munu1.setFocusPainted(false);
	 		munu1.setBorderPainted(false);
	 		munu1.setContentAreaFilled(false);
	 		
	 		JMenuItem m2=new JMenuItem("Apariencia");			
	 		munu1.add(m2);
	 		menu.add(munu1);		
	 		menu.setBounds(0, 0, 70, 22);
	 		add(menu);
	 		
	 		JMenuBar menu2=new JMenuBar();
	 		JMenu munu2=new JMenu("Ayuda");
	 		munu2.setFocusPainted(false);
	 		munu2.setBorderPainted(false);
	 		munu2.setContentAreaFilled(false);
	 		
	 		JMenuItem m3=new JMenuItem("Comentarios");			
	 		JMenuItem m4=new JMenuItem("Preguntas");	
	 		munu2.add(m3);											
	 		munu2.add(m4);
	 		menu2.add(munu2);		
	 		menu2.setBounds(90, 0, 70, 22);
	 		add(menu2);
	 		
	 		JToolBar tb=new JToolBar();
			tb.add(new JButton("Undo Typing"));
			tb.add(new JButton("Redo"));
			tb.add(new JButton("Paste"));
			tb.add(new JButton("Copy"));
			tb.addSeparator();	
			tb.setBounds(0, 0, 400, 80);
			add(tb);
			
			JLabel p1=new JLabel("Responde el formulario");
			p1.setBounds(120,50,200,80);
			add(p1);
			
			JLabel p3=new JLabel("¿Que edad tienes?");
			p3.setBounds(0, 100, 200, 80);
			add(p3);
			JTextArea r3=new JTextArea("");
			r3.setBounds(125, 135, 30, 15);
			add(r3);
			
			JLabel p2=new JLabel("¿Cual es tu nombre?");
			p2.setBounds(0, 80, 200, 80);
			add(p2);
			JTextArea r2=new JTextArea("");
			r2.setBounds(125, 113, 160, 15);
			add(r2);
			
			JLabel estado=new JLabel("Selcciona tu estado");
			estado.setBounds(0, 160, 160, 15);
			estado.setHorizontalAlignment(SwingConstants.LEFT);
			add(estado);
			
			JLabel sexo=new JLabel("Selcciona tu sexo");
			sexo.setBounds(270, 160, 160, 15);
			sexo.setHorizontalAlignment(SwingConstants.LEFT);
			add(sexo);
			
			JRadioButton h=new JRadioButton("Hombre");
			h.setBounds(270,175,150,20);
			add(h);
			
			JRadioButton m=new JRadioButton("Mujer");
			m.setBounds(270,195,150,20);
			add(m);
			
			JComboBox combo=new JComboBox();			
			String datos[]=new String[3];
				datos[0]="Michoacan";
			  datos[1]="Hidalgo";
			  datos[2]="Veracruz";
			
			  JComboBox combo2=new JComboBox(datos);
			  combo2.setBounds(0, 180, 100, 20);
			  add(combo);
			  add(combo2);
			
			JLabel pre=new JLabel("Ingresa un pequeño texto sobre que te gusta hacer");
			pre.setBounds(40, 230,350,40);
			add(pre);
			
			area = new JTextArea();
			barra1=new JScrollPane(area);
			barra1.setBounds(40,260,300,40);
			add(barra1);
			
			barra2=new JScrollPane(texto);
			barra2.setBounds(10, 50, 200, 10);
			add(barra2);

			Image imagen=new ImageIcon("PracticaMenus/PracticaMenus/enviar.png").getImage();
			ImageIcon ico=new ImageIcon(imagen.getScaledInstance(30, 20, Image.SCALE_SMOOTH));
			
			JButton enviar=new JButton("Enviar");
			enviar.setIcon(ico);
			enviar.setBounds(60, 320, 120, 30);
			add(enviar);
			
			Image imagen2=new ImageIcon("PracticaMenus/PracticaMenus/boton-eliminar.png").getImage();
			ImageIcon ico2=new ImageIcon(imagen2.getScaledInstance(30, 20, Image.SCALE_SMOOTH));
			
			JButton cancelar=new JButton("Cancelar");
			cancelar.setIcon(ico2);
			cancelar.setBounds(200, 320, 120, 30);
			add(cancelar);
			
			setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

	 	}
	 	
	 	 public static void main (String args[]){
	 	     Ventana ventana=new Ventana();
	 	     ventana.setSize(400, 400);
	 	     ventana.setVisible(true);
	 		 
	 		 
	 	    }
	 }

