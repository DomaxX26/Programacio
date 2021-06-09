package Swing;

import javax.swing.*;
import java.awt.*;

public class MarcBox extends JFrame {
	static int AMPLE = 175;
	static int ALT = 150;

	public MarcBox() {
		super("El meu marcBox");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Primera"));
		panel.add(new JLabel("Segona"));
		panel.add(new JLabel("Tercera"));
		panel.add(new JLabel("Quarta"));
		panel.add(new JLabel("Cinquena"));
		panel.add(new JLabel("Sisena"));
		add(panel);
		setSize(AMPLE, ALT);
		setVisible(true);
	}

	public static void main(String args[]) {
		MarcBox miMarcBox = new MarcBox();
		miMarcBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}