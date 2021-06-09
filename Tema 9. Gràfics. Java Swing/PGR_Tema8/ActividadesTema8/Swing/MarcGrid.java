package Swing;

import java.awt.*;
import javax.swing.*;

public class MarcGrid extends JFrame {
	static int AMPLE = 175;
	static int ALT = 100;

	public MarcGrid() {
		super("El meu marc");
		setLayout(new GridLayout(3, 2, 10, 15));
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
		MarcGrid marc = new MarcGrid();
		marc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}