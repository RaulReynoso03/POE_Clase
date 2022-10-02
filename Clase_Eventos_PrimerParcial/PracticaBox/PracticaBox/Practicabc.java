package PracticaBox;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;


public class Practicabc {
	
	private JLabel titulo;
	private JPanel panelizquierdo,panelinferiro,panelderecho,panelsuperior;
	private JButton boton1,boton2;
	private JLabel seleccion;
	
	public void conspanelizquierdo() {
		panelizquierdo = new JPanel();
		seleccion = new JLabel("Selecciona la tabla que quieres estudiar");
		JRadioButton dos=new JRadioButton("Tabla del 2");
		JRadioButton tres = new JRadioButton("Tabla del 3");
		JRadioButton cuatros=new JRadioButton("Tabla del 4");
		JRadioButton cinco=new JRadioButton("Tabla del 5");
		JRadioButton seis=new JRadioButton("Tabla del 6");
		JRadioButton siete=new JRadioButton("Tabla del 7");
		JRadioButton ocho=new JRadioButton("Tabla del 8");
		JRadioButton nueve=new JRadioButton("Tabla del 9");
		JButton aceptar=new JButton("Seleccionar");
		panelizquierdo.setLayout(new BoxLayout(panelizquierdo,BoxLayout.Y_AXIS));
		panelizquierdo.add(seleccion);
		panelizquierdo.add(dos);
		panelizquierdo.add(tres);
		panelizquierdo.add(cuatros);
		panelizquierdo.add(cinco);
		panelizquierdo.add(seis);
		panelizquierdo.add(siete);
		panelizquierdo.add(ocho);
		panelizquierdo.add(nueve);
		panelizquierdo.add(aceptar);

	}
	public void conspanelderecho() {
		panelderecho =new JPanel();
		JLabel instruccion = new JLabel("Instrcciones");
		JLabel seleccionarmulti=new JLabel("Puedes seleccionar unas de las diferentes tablas dando clic sobre su icono");
		JLabel aceptar = new JLabel("Da clic sobre la obcion aceptar para poder aceder al repaso");
		JLabel salir=new JLabel("Si quieres salir del programa da click sobre el boton salir");
		panelderecho.setLayout(new BoxLayout(panelderecho,BoxLayout.Y_AXIS));
		panelderecho.setBackground(Color.white);
		panelderecho.add(instruccion);
		panelderecho.add(seleccionarmulti);
		panelderecho.add(aceptar);
		panelderecho.add(salir); 
	}
	
	public void conspanelposterior() {
		panelsuperior=new JPanel();
		JLabel label=new JLabel("TABLAS DE MULTIPLICAR");
		panelsuperior.setLayout(new FlowLayout());
		panelsuperior.setBackground(Color.green);
		panelsuperior.add(label);
		
	}
	
	
	public void conspanelInferior() {
		panelinferiro =new JPanel();
		JButton cancelar=new JButton("Salir");
		JLabel nombre=new JLabel("Hecho por :Reynoso Santana Raul");
		panelinferiro.setLayout(new BoxLayout(panelinferiro,BoxLayout.X_AXIS));
		panelinferiro.setLayout(new FlowLayout());
		panelinferiro.setBackground(Color.gray);
		panelinferiro.add(nombre);
		panelinferiro.add(cancelar);
		
	}
	
	public void ventana() {
		JFrame ventana =new JFrame();

		ventana.setLayout(new BorderLayout());
		
		ventana.add(panelsuperior,BorderLayout.NORTH);
		ventana.add(panelinferiro,BorderLayout.SOUTH);
		ventana.add(panelizquierdo,BorderLayout.WEST);
		ventana.add(panelderecho,BorderLayout.EAST);
		
		ventana.pack();
		ventana.setVisible(true);
		ventana.setSize(700,350);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
	}
	  public Practicabc(){
	        conspanelizquierdo();
	        conspanelInferior();
	        conspanelposterior();
	        conspanelderecho();
	        ventana();
	    }
	 public static void main (String [] inforux){
	        new Practicabc();
	    }
	

	}
	

