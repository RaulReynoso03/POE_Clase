package Panel_sobre_panel;

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

public class Ventan1 extends JFrame {

	public Ventan1() {

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

		Image imagen4=new ImageIcon("Proyecto/Panel_sobre_panel/Icono.jpeg").getImage();
		ImageIcon logo=new ImageIcon(imagen4.getScaledInstance(450, 550, Image.SCALE_SMOOTH));
		
		JLabel Icono=new JLabel();
		Icono.setIcon(logo);
		Icono.setBounds(0, 0, 450,550);
		Icono.setForeground(new Color(0,186,255));
		add(Icono);
		
		
		
		JLabel titulo = new JLabel("Iniciar sesion");
		titulo.setBounds(630, 60, 200, 30);
		titulo.setBackground(Color.white);
		titulo.setForeground(Color.WHITE);
		add(titulo);

		JLabel usuario=new JLabel("Ingresa tu usuario:");
		usuario.setBounds(510, 135, 200, 15);	
		usuario.setForeground(Color.WHITE);
		add(usuario);
		
		JTextArea usuario1=new JTextArea("");
		usuario1.setBounds(625, 135, 200, 17);
		usuario1.setBackground(Color.BLACK);
		usuario1.setForeground(Color.white);
		add(usuario1);
		
		JLabel contraseña=new JLabel("Ingresa tu contraseña:");
		contraseña.setBounds(510, 185, 200, 15);	
		contraseña.setForeground(Color.WHITE);
		add(contraseña);
		
		JTextArea contraseña2=new JTextArea("");
		contraseña2.setBounds(645, 185, 170, 17);
		contraseña2.setBackground(Color.BLACK);
		contraseña2.setForeground(Color.white);
		add(contraseña2);
		
		Image imagen3=new ImageIcon("Proyecto/Panel_sobre_panel/ver (1).png").getImage();
		ImageIcon ver1=new ImageIcon(imagen3.getScaledInstance(15, 15, Image.SCALE_SMOOTH));

		JButton ver=new JButton();
		ver.setIcon(ver1);
		ver.setBounds(803, 175, 50, 30);
		ver.setForeground(new Color(0,186,255));
		ver.setFocusPainted(true);
		ver.setBorderPainted(false);
		ver.setContentAreaFilled(false);
		add(ver);
		
		
		
		JButton olvidar = new JButton("¿Olvidaste tu nombre de usuario o contraseña?");
		olvidar.setBounds(480, 320, 400, 40);
		olvidar.setForeground(new Color(0,186,255));
		olvidar.setFocusPainted(true);
		olvidar.setBorderPainted(false);
		olvidar.setContentAreaFilled(false);
		add(olvidar);

		JLabel No = new JLabel("No tienes cuenta.");
		No.setBounds(596, 370, 300, 40);
		No.setForeground(Color.WHITE);
		add(No);

		JButton registro = new JButton("Regístrate");
		registro.setBounds(680, 383, 100, 15);
		registro.setForeground(new Color(0,186,255));
		registro.setFocusPainted(true);
		registro.setBorderPainted(false);
		registro.setContentAreaFilled(false);
		add(registro);

		JButton terminos = new JButton("Terminos y privacidad");
		terminos.setBounds(700, 453, 165, 15);
		terminos.setForeground(Color.WHITE);
		terminos.setFocusPainted(true);
		terminos.setBorderPainted(false);
		terminos.setContentAreaFilled(false);
		add(terminos);

		JComboBox combo = new JComboBox();
		String datos[] = new String[3];
		datos[0] = "Español(MX)";
		datos[1] = "Ingles";
		datos[2] = "Frances";
		combo.setBackground(Color.GRAY);
		

		JComboBox combo2 = new JComboBox(datos);
		combo2.setBounds(510, 450, 100, 20);
		combo2.setBackground(Color.GRAY);
		combo2.setOpaque(false);
		add(combo);
		add(combo2);

		Image imagen2=new ImageIcon("Proyecto/Panel_sobre_panel/red-mundial.png").getImage();
		ImageIcon ico2=new ImageIcon(imagen2.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		
		JLabel cancelar=new JLabel();
		cancelar.setIcon(ico2);
		cancelar.setBounds(478, 445, 120, 30);
		add(cancelar);
		
		JButton ingresar=new JButton("Iniciar Sesion");
		ingresar.setBounds(570, 270, 200, 30);
		ingresar.setBackground(new Color(6,216,237));
		ingresar.setHorizontalAlignment(SwingConstants.CENTER);
		ingresar.setForeground(Color.WHITE);
		ingresar.setFocusPainted(false);
		ingresar.setBorderPainted(false);
		ingresar.setContentAreaFilled(true);
		add(ingresar);
		
		
		this.getContentPane().add(PanelBase);

	}

	public static void main(String[] args) {
		Ventan1 ventan = new Ventan1();
		ventan.setVisible(true);

	}

}
