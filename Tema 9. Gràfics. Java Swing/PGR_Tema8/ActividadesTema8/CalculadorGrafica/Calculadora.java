package CalculadorGrafica;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;

public abstract class Calculadora extends JFrame implements ActionListener{
	
	JPanel a = (JPanel) this.getContentPane();
	JTextField screen = new JTextField();
	JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnsum = new JButton("+");
	JButton btnrest = new JButton("-");
	JButton btndiv = new JButton("/");
	JButton btnmult = new JButton("x");
	JButton btnpnt = new JButton(".");
	JButton btnigu = new JButton("=");
	JButton btnborr = new JButton("Borrar");
	private final JLabel label = new JLabel("");

	public Calculadora() {
		a.setLayout(null);
		setSize(400, 600);
		setTitle("Calculadora");
		setVisible(true);
		setResizable(false); // Prohibe cambiar el tamaño de la ventana (false)
		
		// Pantalla
		screen.setForeground(Color.BLACK); // Color de fuente
		screen.setBackground(Color.DARK_GRAY); // Color de fondo
		screen.setHorizontalAlignment(SwingConstants.RIGHT); // Alineacion
		screen.setBounds(20, 8, 360, 90);	// Medidas
		screen.setFont(new Font("Yrsa Medium", Font.BOLD, 45)); // Fuente
		screen.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5))); // Borde
		getContentPane().add(screen);
		
		// Borrar
		btnborr.setBounds(20, 470, 360, 90);
		btnborr.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btnborr.setForeground(new java.awt.Color(0, 0, 0));
		btnborr.setBackground(new java.awt.Color(179, 179, 179));
		btnborr.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btnborr);
		
		// 0
		btn0.setBounds(20, 370, 90, 90);
		btn0.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn0.setForeground(new java.awt.Color(51, 51, 51));
		btn0.setBackground(new java.awt.Color(128, 128, 128));
		btn0.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn0);
		btn0.addActionListener(this);
		
		// Punto
		btnpnt.setBounds(110, 370, 90, 90);
		btnpnt.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btnpnt.setForeground(new java.awt.Color(38, 38, 38));
		btnpnt.setBackground(new java.awt.Color(140, 140, 140));
		btnpnt.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btnpnt);
		btnpnt.addActionListener(this);

		// Igual
		btnigu.setBounds(200, 370, 90, 90);
		btnigu.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btnigu.setForeground(new java.awt.Color(26, 26, 26));
		btnigu.setBackground(new java.awt.Color(153, 153, 153));
		btnigu.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btnigu);
		btnigu.addActionListener(this);

		// Sumar
		btnsum.setBounds(290, 370, 90, 90);
		btnsum.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btnsum.setForeground(new java.awt.Color(13, 13, 13));
		btnsum.setBackground(new java.awt.Color(166, 166, 166));
		btnsum.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btnsum);
		btnsum.addActionListener(this);

		// 1
		btn1.setBounds(20, 280, 90, 90);
		btn1.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn1.setForeground(new java.awt.Color(102, 102, 102));
		btn1.setBackground(new java.awt.Color(89, 89, 89));
		btn1.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn1);
		btn1.addActionListener(this);

		// 2
		btn2.setBounds(110, 280, 90, 90);
		btn2.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn2.setForeground(new java.awt.Color(89, 89, 89));
		btn2.setBackground(new java.awt.Color(102, 102, 102));
		btn2.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn2);
		btn2.addActionListener(this);

		// 3
		btn3.setBounds(200, 280, 90, 90);
		btn3.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn3.setForeground(new java.awt.Color(77, 77, 77));
		btn3.setBackground(new java.awt.Color(102, 102, 102));
		btn3.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn3);
		btn3.addActionListener(this);

		// Restar
		btnrest.setBounds(290, 280, 90, 90);
		btnrest.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btnrest.setForeground(new java.awt.Color(64, 64, 64));
		btnrest.setBackground(new java.awt.Color(115, 115, 115));
		btnrest.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btnrest);
		btnrest.addActionListener(this);
		
		// 4
		btn4.setBounds(20, 190, 90, 90);
		btn4.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn4.setForeground(new java.awt.Color(153, 153, 153));
		btn4.setBackground(new java.awt.Color(51, 51, 51));
		btn4.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn4);
		btn4.addActionListener(this);

		// 5
		btn5.setBounds(110, 190, 90, 90);
		btn5.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn5.setForeground(new java.awt.Color(140, 140, 140));
		btn5.setBackground(new java.awt.Color(64, 64, 64));
		btn5.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn5);
		btn5.addActionListener(this);

		// 6
		btn6.setBounds(200, 190, 90, 90);
		btn6.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn6.setForeground(new java.awt.Color(128, 128, 128));
		btn6.setBackground(new java.awt.Color(64, 64, 64));
		btn6.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn6);
		btn6.addActionListener(this);
		
		// Multiplicar
		btnmult.setBounds(290, 190, 90, 90);
		btnmult.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btnmult.setForeground(new java.awt.Color(89, 89, 89));
		btnmult.setBackground(new java.awt.Color(115, 115, 115));
		btnmult.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btnmult);
		btnmult.addActionListener(this);

		// 7
		btn7.setBounds(20, 100, 90, 90);
		btn7.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn7.setForeground(new java.awt.Color(204, 204, 204));
		btn7.setBackground(new java.awt.Color(0, 0, 0));
		btn7.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn7);
		btn7.addActionListener(this);
		
		// 8
		btn8.setBounds(110, 100, 90, 90);
		btn8.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn8.setForeground(new java.awt.Color(191, 191, 191));
		btn8.setBackground(new java.awt.Color(13, 13, 13));
		btn8.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn8);
		btn8.addActionListener(this);
		
		// 9
		btn9.setBounds(200, 100, 90, 90);
		btn9.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btn9.setForeground(new java.awt.Color(179, 179, 179));
		btn9.setBackground(new java.awt.Color(26, 26, 26));
		btn9.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btn9);
		btn9.addActionListener(this);
		
		// Dividir
		btndiv.setBounds(290, 100, 90, 90);
		btndiv.setFont(new Font("Yrsa Medium", Font.BOLD, 45));
		btndiv.setForeground(new java.awt.Color(166, 166, 166));
		btndiv.setBackground(new java.awt.Color(38, 38, 38));
		btndiv.setBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 5), new LineBorder(new Color(13, 13, 13), 5)), new LineBorder(new Color(26, 26, 26), 5)), new LineBorder(new Color(38, 38, 38), 5)), new LineBorder(new Color(51, 51, 51), 5)));
		getContentPane().add(btndiv);
		btndiv.addActionListener(this);
		
		// Borrar
		btnborr.addActionListener(this);	

		// Fondo
		label.setIcon(new ImageIcon("/home/pipo/eclipse-workspace/PGR_Tema9/ActividadesTema9/CalculadorGrafica/arc.gif"));
		label.setBounds(-111, -24, 734, 596);
		getContentPane().add(label);
	}
	
	public static void main(String[] args) {		
		OpCalculadora opCalc = new OpCalculadora();
		opCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent arg0) {
	}
}
