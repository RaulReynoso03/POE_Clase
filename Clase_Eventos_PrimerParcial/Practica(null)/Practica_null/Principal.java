package Practica_null;

public class Principal {

	public static void main(String[] args) {
		
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		ventana.setSize(300, 300);
		ventana.setLocation(100, 100);
		ventana.setLocationRelativeTo(null);
	}

}
