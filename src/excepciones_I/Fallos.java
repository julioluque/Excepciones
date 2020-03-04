package excepciones_I;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		
		int[] mi_matriz = new int[5];

		mi_matriz[0] = 2;
		mi_matriz[1] = 23;
		mi_matriz[2] = 42;
		mi_matriz[3] = 54;
		mi_matriz[4] = 6;
		mi_matriz[5] = 17;

		for (int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + " = " + mi_matriz);
		}

//		Peticion de datos personales:
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre!");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola. mi nombre es " + nombre + " y tengo " + edad + " años"); 
	}
}
