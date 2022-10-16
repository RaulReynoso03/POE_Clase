package Menus;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField bus1;
	private JTextField pr1;
	private JTextField pr2;
	private JTextField pr3;
	private JTextField pr4;
	private JTextField Buscart2;
	private JButton Guardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\prueba.png"));
		setResizable(false);
		setTitle("Cuestionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 531, 369);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel Foto = new JLabel("");
		Foto.setBounds(374, 229, 89, 51);
		panel.add(Foto);
		
		Image imagen4=new ImageIcon("Practica8/Menus/Pro.png").getImage();
		ImageIcon logo=new ImageIcon(imagen4.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		Image imagen2=new ImageIcon("Practica8/Menus/datos.png").getImage();
		ImageIcon logo2=new ImageIcon(imagen2.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		Image imagen3=new ImageIcon("Practica8/Menus/Robot.png").getImage();
		ImageIcon log3=new ImageIcon(imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		
		JComboBox pr5 = new JComboBox();	
		pr5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==pr5) {
					
					String go=pr5.getSelectedItem().toString();
					if(go=="Programacion") {
						Foto.setIcon(logo);
					}else if (go=="Ciencia de datos") {
						Foto.setIcon(logo2);
					}else if (go=="Mecatronica") {
						Foto.setIcon(log3);
					}else {
						Foto.setIcon(null);
					}
				}
				
			}
		});
		
		
		pr5.setModel(new DefaultComboBoxModel(new String[] {"Carrera", "Programacion", "Ciencia de datos", "Mecatronica"}));
		pr5.setBounds(209, 243, 96, 22);
		panel.add(pr5);
	

		pr4 = new JTextField();
		pr4.setBounds(209, 219, 96, 20);
		panel.add(pr4);
		pr4.setColumns(10);

		pr3 = new JTextField();
		pr3.setBounds(209, 194, 96, 20);
		panel.add(pr3);
		pr3.setColumns(10);

		pr2 = new JTextField();
		pr2.setBounds(209, 169, 96, 20);
		panel.add(pr2);
		pr2.setColumns(10);

		pr1 = new JTextField();
		pr1.setBounds(209, 144, 96, 20);
		panel.add(pr1);
		pr1.setColumns(10);

		JLabel lblNewLabel = new JLabel("CUESTIONARIO");
		lblNewLabel.setBounds(200, 11, 105, 14);
		panel.add(lblNewLabel);

		Guardar = new JButton("Guardar");
		Guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == Guardar) {

					String g1 = pr1.getText();
					String g2 = pr2.getText();
					String g3 = pr3.getText();
					String g4 = pr4.getText();

					pr1.setEnabled(false);
					pr2.setEnabled(false);
					pr3.setEnabled(false);
					pr4.setEnabled(false);
					pr5.setEnabled(false);
					Foto.setIcon(null);
				}
			}
		});
		Guardar.setBounds(10, 335, 89, 23);
		panel.add(Guardar);

		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Salir) {
					System.exit(0);

				}
			}
		});
		Salir.setBounds(432, 335, 89, 23);
		panel.add(Salir);

		JButton Nuevo = new JButton("Nuevo");
		Nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Nuevo) {

					pr1.setText(null);
					pr2.setText(null);
					pr3.setText(null);
					pr4.setText(null);

					pr1.setEnabled(true);
					pr2.setEnabled(true);
					pr3.setEnabled(true);
					pr4.setEnabled(true);
					pr5.setEnabled(true);
					Foto.setIcon(null);
				}

			}
		});
		Nuevo.setBounds(333, 335, 89, 23);
		panel.add(Nuevo);

		JButton Modificar = new JButton("Modificar");
		Modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == Modificar) {
					pr1.setEnabled(true);
					pr2.setEnabled(true);
					pr3.setEnabled(true);
					pr4.setEnabled(true);
					pr5.setEnabled(true);
					Foto.setIcon(null);
				}

			}
		});
		Modificar.setBounds(104, 335, 89, 23);
		panel.add(Modificar);

		JButton Buscar = new JButton("Buscar");
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Buscar) {

					String b1 = bus1.getText();
					String d1 = "Nombre";
					String d2 = "Edad";
					String d3 = "Semestre";
					String d4 = "Grupo";

					if (b1.equals(d1)) {
						pr1.setText("Raul");
					} else if (b1.equals(d2)) {
						pr2.setText("17");
					} else if (b1.equals(d3)) {
						pr3.setText("3");
					} else if (b1.equals(d4)) {
						pr4.setText("AM-P");
					}

				}

			}
		});
		Buscar.setBounds(10, 50, 89, 23);
		panel.add(Buscar);

		bus1 = new JTextField();
		bus1.setBounds(109, 51, 96, 20);
		panel.add(bus1);
		bus1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Constesta el formulario ");
		lblNewLabel_1.setBounds(10, 105, 195, 14);
		panel.add(lblNewLabel_1);

		JLabel p1 = new JLabel("Ingresa tu nombre:");
		p1.setBounds(10, 147, 183, 14);
		panel.add(p1);

		JLabel p2 = new JLabel("Ingresa tu edad:");
		p2.setBounds(10, 172, 183, 14);
		panel.add(p2);

		JLabel p3 = new JLabel("Ingresa tu semestre:");
		p3.setBounds(10, 197, 183, 14);
		panel.add(p3);

		JLabel lblNewLabel_5 = new JLabel("Ingresa tu grupo:");
		lblNewLabel_5.setBounds(10, 222, 183, 14);
		panel.add(lblNewLabel_5);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 40, 22);
		panel.add(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem Guardar2 = new JMenuItem("Guardar");
		Guardar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Guardar2) {

					String g1 = pr1.getText();
					String g2 = pr2.getText();
					String g3 = pr3.getText();
					String g4 = pr4.getText();

					pr1.setEnabled(false);
					pr2.setEnabled(false);
					pr3.setEnabled(false);
					pr4.setEnabled(false);
					pr5.setEnabled(false);
					
				}
			}
		});

		mnNewMenu.add(Guardar2);

		JMenuItem Modificar2 = new JMenuItem("Modificar");
		Modificar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Modificar2) {
					pr1.setEnabled(true);
					pr2.setEnabled(true);
					pr3.setEnabled(true);
					pr4.setEnabled(true);
					pr5.setEnabled(true);

				}

			}
		});
		mnNewMenu.add(Modificar2);

		JMenuItem Nuevo2 = new JMenuItem("Nuevo");
		Nuevo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == Nuevo2) {

					pr1.setText(null);
					pr2.setText(null);
					pr3.setText(null);
					pr4.setText(null);

					pr1.setEnabled(true);
					pr2.setEnabled(true);
					pr3.setEnabled(true);
					pr4.setEnabled(true);
					pr5.setEnabled(true);
					Foto.setIcon(null);

				}

			}
		});
		mnNewMenu.add(Nuevo2);

		JMenuItem Salir2 = new JMenuItem("Salir");
		Salir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==Salir2) {
					System.exit(0);
				}
			}
		});
		mnNewMenu.add(Salir2);

		JMenuItem Buscar2 = new JMenuItem("Buscar");
		Buscar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Buscar2) {

					String b1 = Buscart2.getText();
					String d1 = "Nombre";
					String d2 = "Edad";
					String d3 = "Semestre";
					String d4 = "Grupo";

					if (b1.equals(d1)) {
						pr1.setText("Raul");
					} else if (b1.equals(d2)) {
						pr2.setText("17");
					} else if (b1.equals(d3)) {
						pr3.setText("3");
					} else if (b1.equals(d4)) {
						pr4.setText("AM-P");
					}

				}
				
				
			}
		});
		mnNewMenu.add(Buscar2);

		Buscart2 = new JTextField();
		mnNewMenu.add(Buscart2);
		Buscart2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Selecciona tu carrera:");
		lblNewLabel_6.setBounds(10, 247, 183, 14);
		panel.add(lblNewLabel_6);

		JButton Eliminar = new JButton("Eliminar");
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Eliminar) {

					JOptionPane.showMessageDialog(Eliminar, "Borrando datos");
					pr1.setText(null);
					pr2.setText(null);
					pr3.setText(null);
					pr4.setText(null);

					pr1.setEnabled(true);
					pr2.setEnabled(true);
					pr3.setEnabled(true);
					pr4.setEnabled(true);
					pr5.setEnabled(true);
					Foto.setIcon(null);

				}

			}
		});
		Eliminar.setBounds(222, 335, 89, 23);
		panel.add(Eliminar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}