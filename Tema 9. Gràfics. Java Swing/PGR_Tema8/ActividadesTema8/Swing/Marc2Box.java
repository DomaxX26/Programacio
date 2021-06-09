package Swing;

import javax.swing.*;
import java.awt.*;

public class Marc2Box extends JFrame {
	static int AMPLE = 275;
	static int ALT = 175;

	public Marc2Box() {
		super("Mi marco");
		JButton b1 = new JButton("Boto1");
		JButton b2 = new JButton("Boto2");
		JButton b3 = new JButton("Boto3");
		JButton b4 = new JButton("Boto4");
		JButton b5 = new JButton("Boto5");
		JButton b6 = new JButton("Boto6");
		Box caixaH = Box.createHorizontalBox(); // método factoría
		caixaH.add(b1);
		// separación horizontal de 10 pixeles
		caixaH.add(Box.createHorizontalStrut(10));
		caixaH.add(b2);
		// zona rígida, separación horizontal
		caixaH.add(Box.createRigidArea(new Dimension(5, 5)));
		caixaH.add(b3);
		add(caixaH, BorderLayout.NORTH);
		Box caixaV = Box.createVerticalBox();
		caixaV.add(Box.createHorizontalStrut(70));
		caixaV.add(b4);
		// separación horizontal 10 pixeles
		caixaV.add(Box.createVerticalStrut(10));
		caixaV.add(b5);
		caixaV.add(Box.createRigidArea(new Dimension(5, 5)));
		caixaV.add(b6);
		add(caixaV, BorderLayout.CENTER);
		setSize(AMPLE, ALT);
		setVisible(true);
	}

	public static void main(String args[]) {
		Marc2Box marcBox2 = new Marc2Box();
		marcBox2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}