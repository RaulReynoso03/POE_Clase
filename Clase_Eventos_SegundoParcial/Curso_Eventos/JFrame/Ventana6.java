package JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana6 frame = new Ventana6();
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
	public Ventana6() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\assassin-s-creed-symbols-video-games-simple-background-wallpaper-preview.jpg"));
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 286, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(105, 133, 121, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Valor 1:");
		lblNewLabel.setBounds(20, 43, 49, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 2:");
		lblNewLabel_1.setBounds(20, 68, 49, 14);
		panel.add(lblNewLabel_1);
		
		final JButton btnNewButton = new JButton("Sumar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					int valor1,valor2,resultado = 0;
					valor1=Integer.parseInt(textField.getText());
					valor2=Integer.parseInt(textField_1.getText());
					
					resultado=valor1+valor2;
					
					lblNewLabel_2.setText("Resultado: "+resultado);
				}
				
			}
		});
		btnNewButton.setBounds(10, 129, 89, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(74, 46, 96, 14);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 68, 96, 14);
		panel.add(textField_1);
		textField_1.setColumns(10);
	}
}
