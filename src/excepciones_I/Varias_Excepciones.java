package excepciones_I;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {

		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("1 . No se permite la division por cero");
			System.out.println("2 . Mensaje de throwable:" + e.getMessage());
			System.out.println("3 . Se genero un error del tipo: "+ e.getClass().getName());
			System.out.print("4 . "); e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("1 . No se permiten letras");
			System.out.println("2 . Mensaje de throwable:" + e.getMessage());
			System.out.println("3 . Se genero un error del tipo: "+ e.getClass().getName());
			System.out.print("4 . "); e.printStackTrace();
		}

	}

	static void division() {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor."));
		
		System.out.println("El resultado es: " + num1 / num2);
	}

}
