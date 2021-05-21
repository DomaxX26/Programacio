package Swing;

import javax.swing.*;
import java.awt.*;


public class MarcBorder extends JFrame {
	static int AMPLE = 350;
	static int ALT = 200;

	public MarcBorder() {
		super("Mi marco");
		add(new JLabel("Nord", SwingConstants.CENTER), BorderLayout.NORTH);
		add(new JLabel("Sud", SwingConstants.CENTER), BorderLayout.SOUTH);
		add(new JLabel("Centre", SwingConstants.CENTER), BorderLayout.CENTER);
		add(new JLabel("Oest", SwingConstants.CENTER), BorderLayout.WEST);
		add(new JLabel("Est", SwingConstants.CENTER), BorderLayout.EAST);
		setSize(AMPLE, ALT);
		setVisible(true);
	}

	public static void main(String args[]) {
		MarcBorder marc = new MarcBorder();
		marc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
