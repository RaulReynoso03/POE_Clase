package Preguntas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Toolkit;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField P1;
	private JTextField P2;
	private JTextField P3;
	
	int c1=0,c2=0,c3=0;
	int ic1=0,ic2=0,ic3=0;

	String r1="4";
	String r2="2";

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\raulr\\Downloads\\matematicas.png"));
		setTitle("Preguntas matematicas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 562, 304);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Contador1 = new JLabel("0");
		Contador1.setBounds(106, 224, 49, 14);
		panel.add(Contador1);
		
		JLabel lblNewLabel = new JLabel("CUESTIONARIO");
		lblNewLabel.setBounds(233, 11, 118, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("¿Cuanto es 1+ 1?");	
		lblNewLabel_1.setToolTipText("Si le doy dos manzanas a alguien cuantas tendra");
		lblNewLabel_1.setBounds(36, 105, 108, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("¿Cuanto es 2*2?");
		lblNewLabel_2.setToolTipText("suma 2 mas 2");
		lblNewLabel_2.setBounds(36, 58, 142, 43);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("¿Cuanto es 10/2?");
		lblNewLabel_3.setToolTipText("Si le quito 5 manzanaz a pedro cuantas tendra ahora");
		lblNewLabel_3.setBounds(36, 144, 142, 37);
		panel.add(lblNewLabel_3);
		
		P1 = new JTextField();
		P1.setToolTipText("Responde la pregunta");
		P1.setBounds(233, 69, 96, 20);
		panel.add(P1);
		P1.setColumns(10);
		
		P2 = new JTextField();
		P2.setBounds(233, 107, 96, 20);
		P2.setToolTipText("Responde la pregunta");
		panel.add(P2);
		P2.setColumns(10);
		
		P3 = new JTextField();
		P3.setBounds(233, 152, 96, 20);
		P3.setToolTipText("Responde la pregunta");
		panel.add(P3);
		P3.setColumns(10);
		
		JButton V1 = new JButton("Verificar");
		V1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (e.getSource()==V1) {
					
					V1.setToolTipText("Una vez enviada no podras corregir la respuesta");
				}
				
			}
		});
		V1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==V1) {
					
					
					String texto=P1.getText();
					if (texto.equals(r1)) {
						
						V1.setText("Correcto");
						V1.setEnabled(false);	
						P1.setEnabled(false);
					
						Contador1.setText("1");
						
					}else {
						V1.setText("Incorrecto");
						V1.setEnabled(false);
						P1.setEnabled(false);
						
					}

				}
				
				
			}
		});
		V1.setToolTipText("Una ves le des al boton no podras volver a responder");
		V1.setBounds(425, 68, 108, 23);
		panel.add(V1);
		
		JButton V2 = new JButton("Verificar");
		V2.setToolTipText("Una vez enviada no podras corregir la respuesta");
		V2.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==V2) {
				
				
				
				String texto2=P2.getText();
				if(texto2.equals(r2)) {
					
					V2.setEnabled(false);
					V2.setText("Correcto");
					P2.setEnabled(false);
					Contador1.setText("2");
			
				
				}else {
					V2.setEnabled(false);
					V2.setText("Incorrecto");
					ic2=ic2+1;
					P2.setEnabled(false);
				}
			}
			
			
			}
		});
		V2.setBounds(425, 106, 108, 23);
		panel.add(V2);
		
		JButton V3 = new JButton("Verificar");
		V3.setToolTipText("Una vez enviada no podras corregir la respuesta");
		V3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==V3) {
					
					String r3="5";
					
					String texto3=P3.getText();
					if(texto3.equals(r3)) {
						
						V3.setEnabled(false);
						V3.setText("Correcta");
						Contador1.setText("3");
						P3.setEnabled(false);
						
						
					}else {
						V3.setEnabled(false);
						V3.setText("Incorrecto");
						P3.setEnabled(false);
					}
					
				}
				
			}
		});
		V3.setBounds(425, 151, 108, 23);
		panel.add(V3);
		
		JButton Reintentar = new JButton("Reintentar");
		Reintentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==Reintentar) {
					
					Contador1.setText("0");
					V1.setEnabled(true);
					V1.setText("Verificar");
					
					V2.setEnabled(true);
					V2.setText("Verificar");
					
					V3.setEnabled(true);
					V3.setText("Verificar");
					
					P1.setText("");
					P1.setEnabled(true);
					P2.setText("");
					P2.setEnabled(true);
					P3.setText("");
					P3.setEnabled(true);
					
				}
				
			}
		});
		Reintentar.setBounds(10, 270, 145, 23);
		panel.add(Reintentar);
		
		JButton Cerrar = new JButton("Cerrar");
		Cerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==Cerrar) {
					System.exit(0);
				}
			}
		});
		Cerrar.setBounds(425, 270, 127, 23);
		panel.add(Cerrar);
		
		JLabel Contador = new JLabel("Correctas: ");
		Contador.setBounds(37, 224, 78, 14);
		panel.add(Contador);
	}
}
