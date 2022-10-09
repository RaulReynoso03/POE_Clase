package Pregunta_Esquiva;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Ventana extends JFrame {

	private JPanel contentPane;
    private int x,y;
    Random alea;

	public Ventana() {
		

	        alea = new Random();

	        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 460);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿QUIERES SALIR CONMIGO?");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel.setBounds(129, 11, 264, 23);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Claro que si");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnNewButton) {
					
					dispose();
					Ventana2 v2=new Ventana2();
					v2.setVisible(true);
					
					
				}
			}
		});
		btnNewButton.setBounds(10, 426, 142, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No quiero");
		btnNewButton_1.setBounds(364, 426, 107, 23);
		panel.add(btnNewButton_1);
		

		contentPane.addMouseMotionListener(new MouseMotionListener() {
	            @Override
	            public void mouseDragged(MouseEvent mouseEvent) {
	            	
	            }
	 
	            @Override
	            public void mouseMoved(MouseEvent mouseEvent) {
	                if(insideRectangle(mouseEvent, btnNewButton_1)) {
	                    move(btnNewButton_1);
	                }
	            }
	 
	            private void move(JButton jbutton) {
	                x = alea.nextInt(400);
	                y= alea.nextInt(400);
	                jbutton.setBounds(x,y,107,23);
	            }
	 
	 
	            private boolean insideRectangle(MouseEvent mouseEvent, JButton button) {
	                Rectangle rectangle = new Rectangle(button.getX() - 40, button.getY() - 40,
	                        button.getWidth() + 80,
	                        button.getHeight() + 80);
	                return rectangle.getBounds().contains(mouseEvent.getX(), mouseEvent.getY());
	            }
	        });
	    }
		
	
}
