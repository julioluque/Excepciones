package excepciones_I;

import java.io.IOException;
import java.util.*;
public class EntradaDatos {

	public static void main (String [] args) {
		
		System.out.println("Que deseas hacer?");
		System.out.println("1. Entrada de datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada = new Scanner(System.in);
		
		int decision = entrada.nextInt();
		
		if (decision == 1) {
		
//			try {
				pedirDatos();
//			} catch (IOException e) {
//				System.out.println("Que demonios ingresaste en la edad?");
//			}
		
		} else {
			
			System.out.println("Adios!");
			System.exit(0);
			
		}
		
		entrada.close();

	}
	
	static void pedirDatos() throws InputMismatchException {
		
		try {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Ingresar nombre: ");
			
			String nombre = entrada.nextLine();
			
			System.out.println("Ingresar edad: ");
			
			int edad = entrada.nextInt();
			
			System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");
			
			entrada.close();

		} catch (Exception e) {
			System.out.println("Que ingresaste en la edad??!!");			
		}
		System.out.println("Programa terminado!");
		
	}
}
