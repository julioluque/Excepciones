package excepciones_I;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mi_mail = JOptionPane.showInputDialog("Introduce tu mail");
		
		try {
			examina_mail(mi_mail);
		} catch (Exception e) {
			System.out.println("la direccion de email no es correcta!");
			e.printStackTrace();
		}

	}

	static void examina_mail(String mail) throws LongitudMailErroneo{

		int arroba = 0;
		boolean punto = false;

		if (mail.length() <= 3) {

//			ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
//			throw miExcepcion;
			
//			throw new EOFException();
			
			throw new LongitudMailErroneo("El mailno puede tener menos de 3 caracteres...");

		} else {

			for (int i = 0; i < mail.length(); i++) {
				if (mail.charAt(i) == '@') {
					arroba++;
				}
				if (mail.charAt(i) == '.') {
					punto = true;
				}
			}

			if ((arroba == 1) && (punto == true)) {
				System.out.println("El mail es correcto!");
			} else {
				System.out.println("Revise el mail. Es incorrecto");
			}

		}
	}

}

class LongitudMailErroneo extends Exception {
	
	public LongitudMailErroneo() {}
	
	public LongitudMailErroneo(String mensajeError) {
		super(mensajeError);
	}
	
}