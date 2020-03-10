package excepciones_I;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Leer_Imagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame {
	public MarcoImagen() {

		setTitle("Marco con imagen");
		setBounds(750, 300, 400, 300);

		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);

	}

}

class LaminaConImagen extends JPanel {

	public LaminaConImagen() {

		// EXCEPCION TIPO COMPROBADO, SOLUCION TRY CATCH
		try {
			imagen = ImageIO.read(new File("src/excepciones_i/icondo.gif"));
		} catch (IOException e) {
			System.out.println("No se encontro la imagen!");
		}

	}

	public void paintComponent(Graphics g) throws NullPointerException{
		super.paintComponent(g);

//		EXCEPCION TIPO NO COMPROBADO, SOLUCION IF ELSE
//		if (imagen == null) {
//			g.drawString("No podemos cargar la imagen", 10, 10);
//		} else {
		
		try {
			
			int anchuraImagen = imagen.getWidth(this);
			int alturaImagen = imagen.getHeight(this);

			g.drawImage(imagen, 0, 0, null);

			for (int i = 0; i < 300; i++) {
				for (int j = 0; j < 300; j++) {
					if (i + j > 0) {
						g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i, alturaImagen * j);
					}
				}
			}
		} catch(NullPointerException e) {
			g.drawString("No se pudo cargar la imagen en las coordenadas 10, 10", 10, 10);
		}

	}

//	}

	private Image imagen;

}