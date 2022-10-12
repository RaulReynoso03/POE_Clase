package Cuestionario_Focos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField borrar;
	private JTextField Ejemplo;
	private JTextField Cr;
	private JTextField p1;
	private JTextField p2;
	private JTextField p3;
	private JTextField p4;

	String r1;
	String r2;
	String r3;
	String r4;

	String rc1;
	String rc2;
	String rc3;
	String rc4;
	private JTextField textField;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setBounds(0, 0, 493, 263);
		contentPane.add(panel);

		JLabel vacio = new JLabel("*Obligatorio");
		vacio.setBackground(Color.RED);
		vacio.setBounds(312, 110, 89, 14);

		vacio.setVisible(false);
		panel.setLayout(null);
		panel.add(vacio);

		JLabel lblNewLabel = new JLabel("Cuestionario");
		lblNewLabel.setBounds(194, 11, 108, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Borrar");
		lblNewLabel_1.setBounds(10, 49, 49, 14);
		panel.add(lblNewLabel_1);

		borrar = new JTextField();
		borrar.setBounds(10, 63, 49, 20);
		borrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getSource() == borrar) {

					p1.setText(null);
					p2.setText(null);
					p3.setText(null);
					p4.setText(null);
					borrar.setText(null);
					Ejemplo.setText(null);
					Cr.setText(null);

				}
			}
		});
		panel.add(borrar);
		borrar.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Ejemplo");
		lblNewLabel_1_1.setBounds(92, 49, 49, 14);
		panel.add(lblNewLabel_1_1);

		Ejemplo = new JTextField();
		Ejemplo.setBounds(92, 63, 49, 20);
		Ejemplo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getSource() == Ejemplo) {

					r1 = p1.getText();
					r2 = p2.getText();
					r3 = p3.getText();
					r4 = p4.getText();

					p1.setText("Raul");
					p2.setText("Programacion");
					p3.setText("3");
					p4.setText("AM-P");

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (e.getSource() == Ejemplo) {

					p1.setText(r1);
					p2.setText(r2);
					p3.setText(r3);
					p4.setText(r4);
				}
			}
		});
		Ejemplo.setColumns(10);
		panel.add(Ejemplo);

		Cr = new JTextField();
		Cr.setBounds(173, 63, 49, 20);
		Cr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getSource() == Cr) {

					panel.setBackground(Color.black);

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

				if (e.getSource() == Cr) {

					panel.setBackground(Color.cyan);
				}

			}
		});
		Cr.setColumns(10);
		panel.add(Cr);

		JLabel lblNewLabel_1_1_1 = new JLabel("Color de fondo ");
		lblNewLabel_1_1_1.setBounds(173, 49, 108, 14);
		panel.add(lblNewLabel_1_1_1);

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {

					rc1 = p1.getText();
					rc2 = p2.getText();
					rc3 = p3.getText();
					rc4 = p4.getText();

					JOptionPane.showMessageDialog(btnNewButton, "Informacion guardada exitosamente");
				}
			}
		});
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getSource() == btnNewButton) {

					rc1 = p1.getText();
					rc2 = p2.getText();
					rc3 = p3.getText();
					rc4 = p4.getText();

					JOptionPane.showMessageDialog(btnNewButton, "Informacion guardada exitosamente");
				}
			}
		});
		btnNewButton.setBounds(394, 229, 89, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Especialidad");
		lblNewLabel_2.setBounds(10, 135, 186, 14);
		panel.add(lblNewLabel_2);

		p1 = new JTextField();
		p1.setBounds(206, 107, 96, 20);
		p1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {

					String con = p1.getText();

					if (con.isEmpty()) {

						vacio.setVisible(true);

					} else {
						vacio.setVisible(false);
					}

				}

			}
		});
		panel.add(p1);
		p1.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("¿Cual es tu nombre?");
		lblNewLabel_2_1.setBounds(10, 110, 186, 14);
		panel.add(lblNewLabel_2_1);

		p2 = new JTextField();
		p2.setBounds(206, 132, 96, 20);
		p2.setColumns(10);
		panel.add(p2);

		JLabel lblNewLabel_2_1_1 = new JLabel("Semestre");
		lblNewLabel_2_1_1.setBounds(10, 160, 186, 14);
		panel.add(lblNewLabel_2_1_1);

		p3 = new JTextField();
		p3.setBounds(206, 160, 96, 20);
		p3.setColumns(10);
		panel.add(p3);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("Grupo");
		lblNewLabel_2_1_1_1.setBounds(10, 185, 186, 14);
		panel.add(lblNewLabel_2_1_1_1);

		p4 = new JTextField();
		p4.setBounds(206, 182, 96, 20);
		p4.setColumns(10);
		panel.add(p4);

		JLabel lblNewLabel_3 = new JLabel("Pasar texto al siguiente ");
		lblNewLabel_3.setBounds(277, 49, 145, 14);
		panel.add(lblNewLabel_3);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getSource() == textField) {

					String pa1 = p1.getText();
					String pa2 = p2.getText();
					String pa3 = p3.getText();
					String pa4 = p4.getText();

					p1.setText(pa4);
					p2.setText(pa1);
					p3.setText(pa2);
					p4.setText(pa3);

				}

			}
		});
		textField.setBounds(304, 63, 49, 20);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Mostrar datos guardados");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_1) {

					p1.setText(rc1);
					p2.setText(rc2);
					p3.setText(rc3);
					p4.setText(rc4);
				}
			}
		});

		btnNewButton_1.setBounds(10, 229, 164, 23);
		panel.add(btnNewButton_1);
	}
}
