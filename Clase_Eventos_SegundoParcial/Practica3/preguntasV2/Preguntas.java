package preguntasV2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Preguntas extends JFrame {

	private JPanel contentPane;
	private JTextField txt2;
	private JTextField txt1;
	private JTextField txt3;
	public int i;
	JLabel lblPunt;

	public Preguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 315);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblP1 = new JLabel("¿Cuanto es 5*2?");
		lblP1.setToolTipText("10\r\n");
		lblP1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				JLabel tx1= new JLabel("10");
				tx1.setVisible(true);
			}
		});
		lblP1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblP1.setBounds(10, 80, 123, 14);
		contentPane.add(lblP1);
		
		txt1 = new JTextField();
		txt1.setBounds(131, 78, 211, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblP2 = new JLabel("\u00BFCuanto es 1+1?");
		lblP2.setToolTipText("3");
		lblP2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				JLabel tx2= new JLabel("4");
				tx2.setVisible(true);
			}
		});
		lblP2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblP2.setBounds(10, 123, 123, 14);
		contentPane.add(lblP2);
		
		JLabel lblP3 = new JLabel("\u00BFCuanto es 2+2?");
		lblP3.setToolTipText("1");
		lblP3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				JLabel tx3= new JLabel("4");
				tx3.setVisible(true);
			}
		});
		lblP3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblP3.setBounds(10, 170, 123, 14);
		contentPane.add(lblP3);
		
		JButton btnP1 = new JButton("Verificar");
		btnP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String a="13";
				if(txt1.getText().equals(a)) {
					btnP1.setText("Correcto");
					btnP1.setEnabled(false);
					txt1.setEditable(false);
					i=i+1;
					lblPunt.setText(lblPunt.getText()+i);
				}
				else {
					btnP1.setText("Incorrecto");
					btnP1.setEnabled(false);
					txt1.setEditable(false);
				}
			}
		});
		btnP1.setBounds(352, 77, 120, 23);
		contentPane.add(btnP1);
		
		JButton btnP2 = new JButton("Verificar");
		btnP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String b="2";
				if(txt2.getText().equals(b)) {
					btnP2.setText("Correcto");
					btnP2.setEnabled(false);
					txt2.setEditable(false);
					i=i+1;
					lblPunt.setText(lblPunt.getText()+i);
				}
				else {
					btnP2.setText("Incorrecto");
					btnP2.setEnabled(false);
					txt2.setEditable(false);
				}
			}
		});
		
		btnP2.setBounds(352, 120, 120, 23);
		contentPane.add(btnP2);
		
		JButton btnP3 = new JButton("Verificar");
		btnP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String c="4";
				if(txt3.getText().equals(c)) {
					btnP3.setText("Correcto");
					btnP3.setEnabled(false);
					txt3.setEditable(false);
					i=i+1;
					lblPunt.setText(lblPunt.getText()+i);
				}
				else {
					btnP3.setText("Incorrecto");
					btnP3.setEnabled(false);
					txt3.setEditable(false);
				}
			}
		});
		btnP3.setBounds(352, 167, 120, 23);
		contentPane.add(btnP3);
		
		txt2 = new JTextField();
		txt2.setBounds(131, 121, 207, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(131, 168, 207, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		lblPunt = new JLabel("Puntuacion:");
		lblPunt.setBackground(new Color(255, 255, 255));
		lblPunt.setBounds(329, 219, 123, 20);
		contentPane.add(lblPunt);
		
		JButton btnR = new JButton("Reintentar");
		btnR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				lblPunt.setText(lblPunt.getText());
				btnP1.setEnabled(true);
				txt1.setEditable(true);
				btnP2.setEnabled(true);
				txt2.setEditable(true);
				btnP3.setEnabled(true);
				txt3.setEditable(true);
				i=0;
			}
		});
		btnR.setBounds(24, 219, 109, 20);
		contentPane.add(btnR);
	}
}

