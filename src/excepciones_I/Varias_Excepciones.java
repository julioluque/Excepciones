package excepciones_I;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {

		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("1 . No se permite la division por cero");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("4 . Se genero un error del tipo: "+ e.getClass().getName());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("1 . No se permiten letras");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("4 . Se genero un error del tipo: "+ e.getClass().getName());
		}

	}

	static void division() {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor."));
		
		System.out.println("El resultado es: " + num1 / num2);
	}

}
