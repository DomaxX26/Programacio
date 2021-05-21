package Swing;

import java.awt.*;
import javax.swing.*;

public class MarcFlow extends JFrame {
	static int AMPLE = 175;
	static int ALT = 100;

	public MarcFlow() {
		super("El meu marc");
		setLayout(new FlowLayout());
		add(new JLabel("Primera"));
		add(new JLabel("Segona"));
		add(new JLabel("Tercera"));
		add(new JLabel("Quarta"));
		add(new JLabel("Cinquena"));
		add(new JLabel("Sisena"));
		setSize(AMPLE, ALT);
		setVisible(true);
	}

	public static void main(String args[]) {
		MarcFlow marc = new MarcFlow();
		marc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
