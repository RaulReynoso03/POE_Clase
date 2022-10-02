package Recuperar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana3 extends JFrame {

	public Ventana3() {

		setSize(900, 550);
		setTitle("Iniciar sesion");

		setLocationRelativeTo(null);
		setResizable(false);
		Image icon3=new ImageIcon("Proyecto/Panel_sobre_panel/Icono.jpeg").getImage();
		setIconImage(icon3);
		
		panel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

	}

	public void panel() {

		JLayeredPane PanelBase = new JLayeredPane();

		// Panel Principal
		PanelBase.setLayout(null);
		PanelBase.setBackground(Color.DARK_GRAY);
		PanelBase.setBounds(0, 0, 900, 600);
		PanelBase.setOpaque(true);
		// Paneles Secundarios
		JPanel panelbajo = new JPanel();
		panelbajo.setSize(new Dimension(700, 600));
		panelbajo.setBounds(450, 0, 700, 600);
		panelbajo.setBackground(new Color(232,52,35));
		PanelBase.add(panelbajo, new Integer(1));
		
		
		

		JPanel panelTop = new JPanel();
		panelTop.setSize(new Dimension(400, 460));
		panelTop.setLocation(470, 30);
		panelTop.setBackground(new Color(27,26,26));
		PanelBase.add(panelTop, new Integer(2));

		JPanel panelderecho = new JPanel();
		panelderecho.setSize(new Dimension(450, 550));
		panelderecho.setLocation(0, 0);
		panelderecho.setBackground(Color.CYAN);
		PanelBase.add(panelderecho, new Integer(3));

		JPanel Nombre = new JPanel();
		Nombre.setSize(new Dimension(340, 40));
		Nombre.setLocation(500, 120);
		Nombre.setBackground(Color.BLACK);
		PanelBase.add(Nombre, new Integer(4));

		JPanel Contra = new JPanel();
		Contra.setSize(new Dimension(340, 40));
		Contra.setLocation(500, 170);
		Contra.setBackground(Color.BLACK);
		PanelBase.add(Contra, new Integer(5));

		JPanel linea = new JPanel();
		linea.setSize(new Dimension(400, 2));
		linea.setLocation(470, 430);
		linea.setBackground(Color.BLACK);
		PanelBase.add(linea, new Integer(7));

		
		this.getContentPane().add(PanelBase);

	}

	public static void main(String[] args) {
		Ventana3 ventan = new Ventana3();
		ventan.setVisible(true);

	}

}
