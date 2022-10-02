package ExamenPractica;

import java.util.Scanner;

public class ExamenPractica {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		
		int num_grupo;
		int edades;
		int suma=0;
		int promedioEdades;
		System.out.println("Ingresa la cantidad de alumnos en el grupo: ");
		num_grupo = teclado.nextInt();
		
		for (int i = 0; i <num_grupo; i++) {
			
			System.out.println("Ingresa la edad del alumno"+(i+1));
			edades = teclado.nextInt();
			
			suma=suma+edades;
			
			
		}
		promedioEdades=suma/num_grupo;
		System.out.println("La edad promedio de los alumnos es de:"+promedioEdades);
		
	}
}
