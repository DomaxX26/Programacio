package Swing;

import javax.swing.*;
import java.awt.*;

public class MarcGestors extends JFrame {
	public MarcGestors() {
		JPanel pa1 = new JPanel(new FlowLayout());
		JPanel pa2 = new JPanel(new BorderLayout());
		JPanel pa3 = new JPanel();
		pa3.setLayout(new BoxLayout(pa3, BoxLayout.Y_AXIS));
		// componentes del panel 1
		String[] opc = { "Alta mar", "Baixa mar", " Muntanya" };
		pa1.add(new JLabel("Tria..", JLabel.CENTER));
		pa1.add(new JList(opc));
		pa1.add(new JButton("Prèmer"));
		// componentes del panel 2
		JTextField j = new JTextField("Raons ");
		j.setEditable(false);
		pa2.add(j, BorderLayout.WEST);
		pa2.add(new JButton("Botó"), BorderLayout.EAST);
		// componentes del panel 3
		pa3.add(new JCheckBox("Box ", false));
		pa3.add(new JLabel("Calendari", JLabel.CENTER));
		pa3.add(new JRadioButton("Bot Radio", true));
		// asigna layout al marco y se ponen los paneles
		setLayout(new BorderLayout(10, 15));
		add(pa1, BorderLayout.NORTH);
		add(pa2, BorderLayout.CENTER);
		add(pa3, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		MarcGestors m;
		m = new MarcGestors();
		m.setSize(200, 300);
		m.setLocation(20, 200);
		m.setResizable(false);
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}