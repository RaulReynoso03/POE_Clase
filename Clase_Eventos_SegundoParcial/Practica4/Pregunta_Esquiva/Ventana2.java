package Pregunta_Esquiva;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Ventana2 extends JFrame {

	private JPanel contentPane;

	public Ventana2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\amor.png"));
		setTitle("DIJO QUE SIII");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(423, 138);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 111);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sabia que dirias que si ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(112, 11, 250, 22);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nos vemos el viernes a las 9 pm en galerias ");
		lblNewLabel_1.setBounds(82, 58, 262, 22);
		panel.add(lblNewLabel_1);
		
		

		Image imagen2=new ImageIcon("Practica4/Pregunta_Esquiva/amor.png").getImage();
		ImageIcon ico2=new ImageIcon(imagen2.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(ico2);
		lblNewLabel_2.setBounds(80, 11, 49, 36);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel();
		lblNewLabel_2_1.setIcon(ico2);
		lblNewLabel_2_1.setBounds(300, 11, 49, 36);
		panel.add(lblNewLabel_2_1);
		
	}
}
