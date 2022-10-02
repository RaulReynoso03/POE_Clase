package Comparacion_Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.DebugGraphics;

public class VentanaBird_Actual extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBird_Actual frame = new VentanaBird_Actual();
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
	public VentanaBird_Actual() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\cuestionario.png"));
		setTitle("Cuestionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Cuestionario");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		panel_1.setBackground(Color.DARK_GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Salir");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(true);
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton_3 = new JButton("¿Que edad tienes?");
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton_3.setBackground(Color.GREEN);
		panel_2.add(btnNewButton_3);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("¿Cual es tu color favorito?");
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBackground(Color.GREEN);
		panel_2.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("¿Cual es tu comida favorita?");
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBackground(Color.GREEN);
		panel_2.add(btnNewButton_4);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("¿Cuantos idiomas hablas?");
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBackground(Color.GREEN);
		panel_2.add(btnNewButton_5);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("¿Cual es tu serie favorita?");
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setBackground(Color.GREEN);
		panel_2.add(btnNewButton_6);
		
		textField_4 = new JTextField();
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("¿Cual es tu hobby?");
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setBackground(Color.GREEN);
		panel_2.add(btnNewButton_7);
		
		textField_5 = new JTextField();
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Instrucciones");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel_4.add(panel_8, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Responde las preguntas");
		panel_8.add(lblNewLabel_1);
	}

}
