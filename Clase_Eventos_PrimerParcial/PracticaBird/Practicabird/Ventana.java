package Practicabird;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Ventana {

	private JPanel panelizquierdo,panelinferiro,panelsuperior;

	public void conspanelizquierdo() {
		panelizquierdo = new JPanel();
		panelizquierdo.setLayout(new GridLayout(10,5));
		
		JButton uno=new JButton("a");
		JButton dos=new JButton("a");
		JButton tres=new JButton("b");
		JButton cuatro=new JButton("b");
		JButton cinco=new JButton("c");
		JButton seis=new JButton("c");
		JButton siete=new JButton("d");
		JButton ocho=new JButton("d");
		JButton nueve=new JButton("f");
		JButton dies=new JButton("f");
		JButton once=new JButton("g");
		JButton doce=new JButton("g");
		JButton trece=new JButton("h");
		JButton catorce=new JButton("h");
		JButton quince=new JButton("j");
		JButton dieceis=new JButton("j");
		JButton diesisite=new JButton("k");
		JButton disiocho=new JButton("k");
		JButton disinueve=new JButton("l");
		JButton veinte=new JButton("l");
		
		panelizquierdo.add(uno);
		panelizquierdo.add(dos);
		panelizquierdo.add(tres);
		panelizquierdo.add(cuatro);
		panelizquierdo.add(cinco);
		panelizquierdo.add(seis);
		panelizquierdo.add(siete);
		panelizquierdo.add(ocho);
		panelizquierdo.add(nueve);
		panelizquierdo.add(dies);
		panelizquierdo.add(once);
		panelizquierdo.add(doce);
		panelizquierdo.add(trece);
		panelizquierdo.add(catorce);
		panelizquierdo.add(quince);
		panelizquierdo.add(dieceis);
		panelizquierdo.add(diesisite);
		panelizquierdo.add(disiocho);
		panelizquierdo.add(disinueve);
		panelizquierdo.add(veinte);
		
		uno.setBackground(Color.blue);
		dos.setBackground(Color.blue);
		tres.setBackground(Color.green);
		cuatro.setBackground(Color.green);
		cinco.setBackground(Color.red);
		seis.setBackground(Color.red);
		siete.setBackground(Color.black);
		ocho.setBackground(Color.black);
		nueve.setBackground(Color.cyan);
		dies.setBackground(Color.cyan);
		once.setBackground(Color.darkGray);
		doce.setBackground(Color.darkGray);
		trece.setBackground(Color.MAGENTA);
		catorce.setBackground(Color.MAGENTA);
		quince.setBackground(Color.PINK);
		dieceis.setBackground(Color.PINK);
		diesisite.setBackground(Color.DARK_GRAY);
		disiocho.setBackground(Color.DARK_GRAY);
		disinueve.setBackground(Color.lightGray);
		veinte.setBackground(Color.lightGray);
		
		uno.setForeground(Color.WHITE);
		dos.setForeground(Color.WHITE);
		tres.setForeground(Color.WHITE);
		cuatro.setForeground(Color.WHITE);
		cinco.setForeground(Color.WHITE);
		seis.setForeground(Color.WHITE);
		siete.setForeground(Color.WHITE);
		ocho.setForeground(Color.WHITE);
		nueve.setForeground(Color.WHITE);
		dies.setForeground(Color.WHITE);
		once.setForeground(Color.WHITE);
		doce.setForeground(Color.WHITE);
		trece.setForeground(Color.WHITE);
		catorce.setForeground(Color.WHITE);
		quince.setForeground(Color.WHITE);
		dieceis.setForeground(Color.WHITE);
		diesisite.setForeground(Color.WHITE);
		disiocho.setForeground(Color.WHITE);
		disinueve.setForeground(Color.WHITE);
		veinte.setForeground(Color.WHITE);
		
	}
	
	public void conspanelposterior() {
		panelsuperior=new JPanel();
		JLabel label=new JLabel("MEMORAMA");
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
		
		ventana.pack();
		ventana.setVisible(true);
		ventana.setSize(300,300);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
	}
	  public Ventana(){
	        conspanelizquierdo();
	        conspanelInferior();
	        conspanelposterior();
	        ventana();
	    }
	 public static void main (String [] inforux){
	        new Ventana();
	    }
	

	}