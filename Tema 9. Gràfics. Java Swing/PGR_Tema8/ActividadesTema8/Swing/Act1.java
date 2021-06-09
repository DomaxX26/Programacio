package Swing;

import java.awt.Font;

import javax.swing.*;

public class Act1 extends JFrame {

	JPanel form = (JPanel) this.getContentPane();
	JLabel tit = new JLabel();
	JLabel name = new JLabel();
	JLabel surname1 = new JLabel();
	JLabel surname2 = new JLabel();
	JLabel sexo = new JLabel();
	JLabel edad = new JLabel();
	JLabel ciudad = new JLabel();

	JTextField nameT = new JTextField();
	JTextField surname1T = new JTextField();
	JTextField surname2T = new JTextField();

	JButton btn = new JButton("Enviar");
	JRadioButton rbtn = new JRadioButton("Marcar si eres mayor de edad");

	JCheckBox chckbxHombre = new JCheckBox("Hombre");
	JCheckBox chckbxMujer = new JCheckBox("Mujer");
	JComboBox<String> combo1 = new JComboBox<String>();;

	public Act1() {
		form.setLayout(null);
		setSize(500, 500);
		setTitle("Formulario");
		setResizable(false);
		setVisible(true);

		tit.setBounds(110, 15, 300, 20);
		tit.setFont(new Font("Tahoma", Font.BOLD, 20));
		tit.setText("******FORMULARIO****** ");
		getContentPane().add(tit);

		name.setBounds(12, 115, 150, 15);
		name.setFont(new Font("Tahoma", Font.BOLD, 13));
		name.setText("Nombre: ");
		getContentPane().add(name);

		nameT.setBounds(82, 115, 150, 15);
		nameT.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(nameT);

		surname1.setBounds(12, 145, 150, 15);
		surname1.setFont(new Font("Tahoma", Font.BOLD, 13));
		surname1.setText("Primer apellido: ");
		getContentPane().add(surname1);

		surname1T.setBounds(137, 145, 150, 15);
		surname1T.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(surname1T);

		surname2.setBounds(12, 175, 150, 15);
		surname2.setFont(new Font("Tahoma", Font.BOLD, 13));
		surname2.setText("Segundo apellido: ");
		getContentPane().add(surname2);

		surname2T.setBounds(182, 175, 150, 15);
		surname2T.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(surname2T);

		sexo.setBounds(12, 205, 45, 15);
		sexo.setFont(new Font("Tahoma", Font.BOLD, 13));
		sexo.setText("Sexo: ");
		getContentPane().add(sexo);

		btn.setBounds(200, 380, 100, 50);
		btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(btn);

		chckbxHombre.setBounds(55, 201, 80, 23);
		getContentPane().add(chckbxHombre);

		chckbxMujer.setBounds(139, 201, 65, 23);
		getContentPane().add(chckbxMujer);

		edad.setBounds(12, 235, 123, 15);
		edad.setFont(new Font("Tahoma", Font.BOLD, 13));
		edad.setText("Mayor de edad: ");
		getContentPane().add(edad);

		rbtn.setBounds(137, 231, 236, 23);
		getContentPane().add(rbtn);

		ciudad.setBounds(12, 262, 123, 15);
		ciudad.setFont(new Font("Tahoma", Font.BOLD, 13));
		ciudad.setText("Ciudad: ");
		getContentPane().add(ciudad);
 
		combo1.setBounds(82, 259, 100, 25);
		getContentPane().add(combo1);
		combo1.addItem("Pego");
		combo1.addItem("Oliva");
		combo1.addItem("Denia");
		combo1.addItem("Benissa");
		combo1.addItem("Ondara");
	}

	public static void main(String[] args) {
		Act1 form = new Act1();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
