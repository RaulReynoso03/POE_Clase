package JFrame;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JLabel Texto = new JLabel("En espera");
		Texto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Texto.setBounds(24, 104, 259, 23);
		panel.add(Texto);
		
		final JButton Boton1 = new JButton("Boton1");
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Boton1) {
					Texto.setText("Precionaste el boton 1");
					Texto.setForeground(Color.RED);
				}
			}
		});
		Boton1.setBounds(24, 151, 89, 23);
		panel.add(Boton1);
		
		final JButton Boton2 = new JButton("Boton2");
		Boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Boton2) {
				Texto.setText("Precionaste el boton 2");
				Texto.setForeground(Color.GREEN);
			}
			
			}
		});
		Boton2.setBounds(138, 151, 89, 23);
		panel.add(Boton2);
		
		final JButton Boton3 = new JButton("Boton3");
		Boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Boton3) {
					Texto.setText("Precionaste el boton 3");
					Texto.setBackground(Color.blue);
					Texto.setForeground(Color.BLUE);
				}
				
			}
		});
		Boton3.setBounds(259, 151, 89, 23);
		panel.add(Boton3);
	}
}
