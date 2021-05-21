package Swing;

import javax.swing.*;

public class SwingDemo {
	SwingDemo() {
		JFrame jfrm = new JFrame("Aplicació Simple Swing"); // Crea un nou contenidor JFrame.
		jfrm.setSize(475, 200); // Establim el tamany inicial

		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Acabe el programa quan l'usuari tanque l'aplicació.
		JLabel jLabel = new JLabel("Programación GUI con Swing."); // Creem una etiqueta
		jfrm.add(jLabel); // Afegim l'etiqueta al frame
		jfrm.setVisible(true); // Visualitzem el marc.
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
