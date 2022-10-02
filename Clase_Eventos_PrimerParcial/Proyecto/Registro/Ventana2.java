package Registro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ventana2 {
	private JPanel panelIzquierdo, panelInferior, panelderecho, panelcentral, arriba;
	private ButtonGroup combonu;
	private JScrollPane barra1, barra2;
	private JTextArea area;
	private JTextField texto;

	public void construyepanelcentral() {
		panelcentral = new JPanel();

		panelcentral.setBackground(new Color(27, 26, 26));
		panelcentral.setLayout(null);
		JLabel titulo = new JLabel("QKIE");
		titulo.setFont(new Font("Serif", Font.PLAIN, 20));
		titulo.setForeground(Color.white);
		titulo.setBounds(0, 0, 200, 20);
		panelcentral.add(titulo);

		Image imagen2 = new ImageIcon("Proyecto/Registro/Icono.jpeg").getImage();
		ImageIcon ico2 = new ImageIcon(imagen2.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel cancelar = new JLabel();
		cancelar.setIcon(ico2);
		cancelar.setBounds(60, 0, 100, 20);
		panelcentral.add(cancelar);

		JPanel linea = new JPanel();
		linea.setSize(new Dimension(2200, 2));
		linea.setLocation(0, 23);
		linea.setBackground(Color.WHITE);
		panelcentral.add(linea, new Integer(1));

		JLabel crear = new JLabel("CREAR CUENTA");
		crear.setFont(new Font("Serif", Font.PLAIN, 20));
		crear.setBounds(2, 30, 200, 20);
		crear.setForeground(Color.white);
		panelcentral.add(crear);

		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(2, 70, 200, 20);
		nombre.setFont(new Font("Serif", Font.PLAIN, 15));
		nombre.setForeground(Color.white);
		panelcentral.add(nombre);

		JLabel apellido = new JLabel("Apellidos:");
		apellido.setBounds(2, 110, 200, 20);
		apellido.setFont(new Font("Serif", Font.PLAIN, 15));
		apellido.setForeground(Color.white);
		panelcentral.add(apellido);

		JLabel correo = new JLabel("Correo Electronico:");
		correo.setBounds(2, 150, 200, 20);
		correo.setFont(new Font("Serif", Font.PLAIN, 15));
		correo.setForeground(Color.white);
		panelcentral.add(correo);

		JLabel contraseña = new JLabel("Contraseña:");
		contraseña.setBounds(2, 190, 200, 20);
		contraseña.setFont(new Font("Serif", Font.PLAIN, 15));
		contraseña.setForeground(Color.white);
		panelcentral.add(contraseña);

		JLabel ccontraseña = new JLabel("Confirmar Contraseña:");
		ccontraseña.setBounds(2, 230, 200, 20);
		ccontraseña.setFont(new Font("Serif", Font.PLAIN, 15));
		ccontraseña.setForeground(Color.white);
		panelcentral.add(ccontraseña);

		JCheckBox sino = new JCheckBox();
		sino.setBounds(2, 260, 20, 20);
		sino.setForeground(new Color(0, 186, 255));
		sino.setFocusPainted(true);
		sino.setBorderPainted(false);
		sino.setContentAreaFilled(false);
		panelcentral.add(sino);

		JLabel confirmar = new JLabel("Mostrar contraseña");
		confirmar.setBounds(30, 260, 200, 20);
		confirmar.setForeground(Color.white);
		panelcentral.add(confirmar);

		JLabel Foto = new JLabel("Foto de perfil");
		Foto.setBounds(600, 30, 200, 20);
		Foto.setFont(new Font("Serif", Font.PLAIN, 20));
		Foto.setForeground(Color.WHITE);
		panelcentral.add(Foto);

		Image imagen3 = new ImageIcon("Proyecto/Registro/usuario-de-perfil.png").getImage();
		ImageIcon ico3 = new ImageIcon(imagen3.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		JButton foto = new JButton();
		foto.setIcon(ico3);
		foto.setBounds(610, 80, 100, 100);
		foto.setFocusPainted(true);
		foto.setBorderPainted(true);
		foto.setContentAreaFilled(false);
		panelcentral.add(foto);

		Image imagen4 = new ImageIcon("Proyecto/Registro/mas.png").getImage();
		ImageIcon ico4 = new ImageIcon(imagen4.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel foto2 = new JLabel();
		foto2.setIcon(ico4);
		foto2.setBounds(690, 125, 100, 100);
		panelcentral.add(foto2);

		JLabel foto1 = new JLabel("Agrega una foto de perfil");
		foto1.setBounds(590, 115, 200, 200);
		foto1.setForeground(Color.WHITE);
		panelcentral.add(foto1);

		JButton iniciar = new JButton("Iniciar sesion en su lugar");
		iniciar.setBounds(0, 470, 190, 30);
		iniciar.setForeground(new Color(0, 186, 255));
		iniciar.setFocusPainted(true);
		iniciar.setBorderPainted(false);
		iniciar.setContentAreaFilled(false);
		panelcentral.add(iniciar);

		JButton Crearc = new JButton("Crear");
		Crearc.setBounds(750, 470, 190, 30);
		Crearc.setForeground(new Color(0, 186, 255));
		Crearc.setFocusPainted(true);
		Crearc.setBorderPainted(false);
		Crearc.setContentAreaFilled(false);
		panelcentral.add(Crearc);

		JLabel fecha = new JLabel("Fecha de nacimiento:");
		fecha.setBounds(2, 290, 190, 30);
		fecha.setForeground(Color.white);
		fecha.setFont(new Font("Serif", Font.PLAIN, 15));
		panelcentral.add(fecha);

		JComboBox combo = new JComboBox();
		String datos[] = new String[32];
		datos[0] = "Dia";
		datos[1] = "2";
		datos[2] = "3";
		datos[3] = "4";
		datos[4] = "5";
		datos[5] = "6";
		datos[6] = "7";
		datos[7] = "8";
		datos[8] = "9";
		datos[9] = "10";
		datos[10] = "11";
		datos[11] = "12";
		datos[12] = "13";
		datos[13] = "14";
		datos[14] = "15";
		datos[15] = "16";
		datos[16] = "17";
		datos[17] = "18";
		datos[18] = "19";
		datos[19] = "20";
		datos[20] = "21";
		datos[21] = "22";
		datos[22] = "23";
		datos[23] = "24";
		datos[24] = "25";
		datos[25] = "26";
		datos[26] = "27";
		datos[27] = "28";
		datos[28] = "29";
		datos[29] = "30";
		datos[30] = "31";
		datos[31] = "31";
		JComboBox combo2 = new JComboBox(datos);
		combo2.setBounds(3, 320, 50, 20);
		panelcentral.add(combo);
		panelcentral.add(combo2);

		JComboBox combo1 = new JComboBox();
		String datos1[] = new String[13];
		datos1[0] = "Mes";
		datos1[1] = "Enero";
		datos1[2] = "Febrero";
		datos1[3] = "Marzo";
		datos1[4] = "Abril";
		datos1[5] = "Mayo";
		datos1[6] = "Junio";
		datos1[7] = "Julio";
		datos1[8] = "Agosto";
		datos1[9] = "Septiembre";
		datos1[10] = "Octubre";
		datos1[11] = "Noviembre";
		datos1[12] = "Diciembre";
		JComboBox combo3 = new JComboBox(datos1);
		combo3.setBounds(55, 320, 100, 20);
		panelcentral.add(combo1);
		panelcentral.add(combo3);

		JComboBox combo5 = new JComboBox();
		String datos5[] = new String[13];
		datos5[0] = "Año";
		datos5[1] = "2005";
		datos5[2] = "2000";
		datos5[3] = "1999";
		datos5[4] = "1998";
		datos5[5] = "1997";
		datos5[6] = "1996";
		datos5[7] = "1995";
		datos5[8] = "1994";
		datos5[9] = "1993";
		datos5[10] = "1992";
		datos5[11] = "1991";
		datos5[12] = "1989";
		JComboBox combo6 = new JComboBox(datos5);
		combo6.setBounds(158, 320, 80, 20);
		panelcentral.add(combo5);
		panelcentral.add(combo6);

		JLabel sexo = new JLabel("Selecciona tu sexo:");
		sexo.setForeground(Color.white);
		sexo.setBounds(3, 350, 145, 30);
		sexo.setFont(new Font("Serif", Font.PLAIN, 15));
		panelcentral.add(sexo);

		combonu = new ButtonGroup();

		JRadioButton h = new JRadioButton("Hombre");
		h.setBounds(3, 390, 90, 20);
		h.setOpaque(false);
		h.setForeground(Color.white);
		JRadioButton m = new JRadioButton("Mujer");
		m.setOpaque(false);
		m.setForeground(Color.white);
		m.setBounds(3, 420, 90, 20);

		combonu.add(m);
		combonu.add(h);
		panelcentral.add(h);
		panelcentral.add(m);

		JTextArea nombre1 = new JTextArea("");
		nombre1.setBounds(68, 73, 200, 18);
		nombre1.setBackground(Color.black);
		nombre1.setForeground(Color.white);
		panelcentral.add(nombre1);

		JTextArea Apellido = new JTextArea("");
		Apellido.setBounds(68, 113, 200, 18);
		Apellido.setBackground(Color.black);
		Apellido.setForeground(Color.white);
		panelcentral.add(Apellido);

		JTextArea correo1 = new JTextArea(" @gmail.com");
		correo1.setBounds(126, 153, 200, 18);
		correo1.setBackground(Color.black);
		correo1.setForeground(Color.white);
		panelcentral.add(correo1);

		JTextArea contra1 = new JTextArea("");
		contra1.setBounds(80, 193, 200, 18);
		contra1.setBackground(Color.black);
		contra1.setForeground(Color.white);
		panelcentral.add(contra1);

		JTextArea contra2 = new JTextArea("");
		contra2.setBounds(150, 233, 200, 18);
		contra2.setBackground(Color.black);
		contra2.setForeground(Color.white);
		panelcentral.add(contra2);

		JLabel des = new JLabel("Ingresa una pequeña descripcion sobre ti");
		des.setBounds(540, 270, 300, 33);
		des.setForeground(Color.white);
		des.setBackground(Color.black);
		des.setFont(new Font("Serif", Font.PLAIN, 15));
		panelcentral.add(des);

		area = new JTextArea();
		barra1 = new JScrollPane(area);
		barra1.setBounds(540, 300, 255, 70);
		area.setBackground(Color.black);
		area.setForeground(Color.WHITE);
		panelcentral.add(barra1);

		barra2 = new JScrollPane(texto);
		barra2.setBounds(540, 300, 255, 70);
		panelcentral.add(barra2);

		JPanel line2 = new JPanel();
		line2.setBounds(450, 23, 2, 765);
		panelcentral.add(line2);

	}

	public void contruyePanelIzquierdo() {
		panelIzquierdo = new JPanel();
		panelIzquierdo.setBackground(new Color(255, 84, 24));

	}

	public void contruyePanelInferior() {
		panelInferior = new JPanel();
		panelInferior.setBackground(new Color(255, 84, 24));

	}

	public void contruyepanelderecho() {
		panelderecho = new JPanel();
		panelderecho.setBackground(new Color(255, 84, 24));
	}

	public void construyepanelsuperiro() {
		arriba = new JPanel();
		arriba.setBackground(new Color(255, 84, 24));

	}

	public void contruyeVentana() {
		JFrame frame = new JFrame();

		frame.setLayout(new BorderLayout());
		Image icon3 = new ImageIcon("Proyecto/Panel_sobre_panel/Icono.jpeg").getImage();
		frame.setIconImage(icon3);
		frame.setTitle("Registro");
		frame.add(arriba, BorderLayout.NORTH);
		frame.add(panelcentral, BorderLayout.CENTER);
		frame.add(panelIzquierdo, BorderLayout.WEST);
		frame.add(panelderecho, BorderLayout.EAST);
		frame.add(panelInferior, BorderLayout.SOUTH);
		frame.pack();

		frame.setVisible(true);
		frame.setSize(900, 550);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public Ventana2() {

		construyepanelsuperiro();
		contruyePanelInferior();
		contruyePanelIzquierdo();
		contruyepanelderecho();
		construyepanelcentral();
		contruyeVentana();
	}

	public static void main(String[] inforux) {
		new Ventana2();
	}
}