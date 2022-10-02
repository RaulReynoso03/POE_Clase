package Practicabird2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class Ventana {

	private JPanel panelizquierdo,panelinferiro,panelsuperior,panelderecho;

	
	public void panelderecho() {
		panelderecho=new JPanel();
		panelderecho.setLayout(new BoxLayout(panelderecho,BoxLayout.Y_AXIS));
		JLabel label=new JLabel("Instrucciones");
		JLabel label2=new JLabel("Contesta las preguntas");
		
		panelderecho.add(label);
		panelderecho.add(label2);
		
	}
	
	public void conspanelizquierdo() {
		panelizquierdo = new JPanel();
		panelizquierdo.setLayout(new GridLayout(6,6));
		
		JButton uno=new JButton("¿Que edad tienes?");
		JButton dos=new JButton("¿Cual es tu color favorito?");
		JButton tres=new JButton("¿Cual es tu comida favorita?");
		JButton cuatro=new JButton("¿Cuantos idiomas hablas?");
		JButton cinco=new JButton("¿Cual es tu serie favorita?");
		JButton seis=new JButton("¿Cual es tu hobby?");
		
		uno.setBackground(Color.GREEN);
		dos.setBackground(Color.GREEN);
		tres.setBackground(Color.GREEN);
		cuatro.setBackground(Color.GREEN);
		cinco.setBackground(Color.GREEN);
		seis.setBackground(Color.GREEN);

		JTextArea unot=new JTextArea("");
		JTextArea dost=new JTextArea("");
		JTextArea trest=new JTextArea("");
		JTextArea cuatrot=new JTextArea("");
		JTextArea cincot=new JTextArea("");
		JTextArea seist=new JTextArea("");
		
		
		unot.setBackground(Color.darkGray);
		dost.setBackground(Color.LIGHT_GRAY);
		trest.setBackground(Color.darkGray);
		cuatrot.setBackground(Color.LIGHT_GRAY);
		cincot.setBackground(Color.darkGray);
		seist.setBackground(Color.LIGHT_GRAY);

		panelizquierdo.add(uno);
		panelizquierdo.add(unot);
		panelizquierdo.add(dos);
		panelizquierdo.add(dost);
		panelizquierdo.add(tres);
		panelizquierdo.add(trest);
		panelizquierdo.add(cuatro);
		panelizquierdo.add(cuatrot);
		panelizquierdo.add(cinco);
		panelizquierdo.add(cincot);
		panelizquierdo.add(seis);
		panelizquierdo.add(seist);
		
		
	
	}
	
	public void conspanelposterior() {
		panelsuperior=new JPanel();
		JLabel label=new JLabel("CUESTIONARIO");
		panelsuperior.setLayout(new FlowLayout());
		panelsuperior.setBackground(Color.ORANGE);
		label.setForeground(Color.BLUE);
		
		panelsuperior.add(label);
		
	}
	
	
	public void conspanelInferior() {
		panelinferiro =new JPanel();
		JButton cancelar=new JButton("Salir");
		JButton iniciar=new JButton("Iniciar");
		panelinferiro.setLayout(new BoxLayout(panelinferiro,BoxLayout.X_AXIS));
		panelinferiro.setLayout(new FlowLayout());
		panelinferiro.setBackground(Color.gray);
		panelinferiro.add(iniciar);
		panelinferiro.add(cancelar);
		
	}
	
	public void ventana() {
		JFrame ventana =new JFrame();

		ventana.setLayout(new BorderLayout());
		
		
		ventana.add(panelsuperior,BorderLayout.NORTH);
		ventana.add(panelinferiro,BorderLayout.SOUTH);
		ventana.add(panelizquierdo,BorderLayout.CENTER);
		ventana.add(panelderecho,BorderLayout.EAST);
		
		ventana.pack();
		ventana.setVisible(true);
		ventana.setSize(600,500);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
	}
	  public Ventana(){
	        conspanelizquierdo();
	        conspanelInferior();
	        conspanelposterior();
	        panelderecho();
	        ventana();
	    }
	 public static void main (String [] inforux){
	        new Ventana();
	    }
	

	}