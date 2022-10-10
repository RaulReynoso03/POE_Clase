package Colores3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Ventana extends JFrame {

	private JPanel contentPane;
	int nr;
	int na;
	int nv;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\rgb.png"));
		setTitle("Colores");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 171);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 436, 134);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel r1 = new JLabel("RGB(0,0,0)");
		r1.setForeground(Color.WHITE);
		r1.setBounds(187, 70, 89, 14);
		
		panel.add(r1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, -103, -173, 103);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton Rojo = new JButton("Rojo");
		Rojo.setBackground(Color.BLACK);
		Rojo.setForeground(Color.WHITE);
		Rojo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(e.getSource()==Rojo) {

					nr++;
					Rojo.setBackground(new Color(0+nr,0,0));
					panel.setBackground(new Color(0+nr,0+nv,0+na));

					r1.setText("RGB("+nr+","+nv+","+na+")");
					
				}
				
			}
		});
		Rojo.setBounds(10, 25, 115, 23);
		panel.add(Rojo);
		
		JButton Azul = new JButton("Azul");
		Azul.setBackground(Color.BLACK);
		Azul.setForeground(Color.WHITE);
		Azul.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(e.getSource()==Azul) {

					
					
					na++;
					
					Azul.setBackground(new Color(0,0,0+na));
					
					panel.setBackground(new Color(0+nr,0+nv,0+na));
					
					r1.setText("RGB("+nr+","+nv+","+na+")");
				}
				
				
				
			}
		});
		Azul.setBounds(311, 25, 115, 23);
		panel.add(Azul);
		
		JButton Verde = new JButton("Verde");
		Verde.setBackground(Color.BLACK);
		Verde.setForeground(Color.WHITE);
		Verde.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				do {
				
					
					nv++;
					
					Verde.setBackground(new Color(0,0+nv,0));
					
					panel.setBackground(new Color(0+nr,0+nv,0+na));
					
					r1.setText("RGB("+nr+","+nv+","+na+")");
					
				}while(e.getSource()==Verde); 
				
				
				
			}
		});
		Verde.setBounds(167, 25, 115, 23);
		panel.add(Verde);
	}
}
