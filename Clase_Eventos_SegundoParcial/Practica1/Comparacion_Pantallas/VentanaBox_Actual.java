package Comparacion_Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class VentanaBox_Actual extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBox_Actual frame = new VentanaBox_Actual();
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
	public VentanaBox_Actual() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\X_mark.svg.png"));
		setTitle("Tablas de multiplicar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 51));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Tablas de multiplicar");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Hecho por:Raul Reynoso Santana                                                                            ");
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Salir");
		
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("Selecciona la tabla que quieres estudiar");
		lblNewLabel_2.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tabla del 2");
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tabla del 3");
		rdbtnNewRadioButton_1.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tabla del 4");
		rdbtnNewRadioButton_2.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_2);
		panel_2.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tabla del 5");
		rdbtnNewRadioButton_3.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_3);
		panel_2.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Tabla del 6");
		rdbtnNewRadioButton_4.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_4);
		panel_2.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Tabla del 7");
		rdbtnNewRadioButton_5.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_5);
		panel_2.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Tabla del 8");
		rdbtnNewRadioButton_6.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_6);
		panel_2.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Tabla del 9");
		rdbtnNewRadioButton_7.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(rdbtnNewRadioButton_7);
		panel_2.add(rdbtnNewRadioButton_7);
		
		JButton btnNewButton_1 = new JButton("Seleccionar");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setAlignmentY(2.0f);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("INSTRUCCIONES");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Selecciona una de las tablas dando click\r\n \r\nsobre una  ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Da click sobre la opcion seleccionar para acceder al ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("repaso.Si quieres salir da click sobre el boton salir");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_6);
	}

}
