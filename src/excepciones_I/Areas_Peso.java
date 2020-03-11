package excepciones_I;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elegir una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

		try {
			figura = entrada.nextInt();

		} catch (Exception e) {

			System.out.println("Ocurrio un error!");
		} finally {

			entrada.close();
		}
		switch (figura) {

		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
			System.out.println(Math.pow(lado, 2));
			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El area del rectangulo es: " + base * altura);
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El area del triangulo es: " + (base * altura) / 2);
			break;

		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
			System.out.println("El area del circulo es: ");
			System.out.println(Math.PI * (Math.pow(radio, 2)));
			break;

		default:
			System.out.println("La opcion no es correcta!");

		}

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros."));
		System.out.println("Si sos hombre tu peso ideal es de " + (altura - 110) + " kilos.");
		System.out.println("Si sos mujer tu peso ideal es de " + (altura - 120) + " kilos.");

	}

	static int figura;
}
