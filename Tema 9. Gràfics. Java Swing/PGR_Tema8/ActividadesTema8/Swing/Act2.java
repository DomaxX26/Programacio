package Swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Act2 extends JFrame {

	JPanel form = (JPanel) this.getContentPane();
	JLabel tit = new JLabel();
	JLabel nombre = new JLabel();
	JLabel ap1 = new JLabel();
	JLabel correo = new JLabel();
	JLabel sexo = new JLabel();
	JLabel edad = new JLabel();
	JLabel ciudad = new JLabel();
	JLabel contr = new JLabel();

	JTextField nombreT = new JTextField();
	JTextField ap1T = new JTextField();
	JTextField correoT = new JTextField();

	JButton btn = new JButton("Registrarse");
	JRadioButton rbtn = new JRadioButton("Marcar si eres mayor de edad");

	JCheckBox chckbxHombre = new JCheckBox("Hombre");
	JCheckBox chckbxMujer = new JCheckBox("Mujer");
	JComboBox<String> combo1 = new JComboBox<String>();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;;

	public Act2() {
		form.setLayout(null);
		setSize(500, 500);
		setTitle("Registro");
		setResizable(false);
		setVisible(true);
		getContentPane().setBackground(Color.GRAY);

		// Titulo
		tit.setBounds(128, 15, 282, 20);
		tit.setFont(new Font("Tahoma", Font.BOLD, 20));
		tit.setText("******REGISTRO****** ");
		add(tit);

		// Nombre
		nombre.setBounds(12, 115, 69, 15);
		nombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		nombre.setText("Nombre: ");
		add(nombre);

		nombreT.setBounds(82, 115, 150, 15);
		nombreT.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(nombreT);

		// Primer apellido
		ap1.setBounds(12, 145, 123, 15);
		ap1.setFont(new Font("Tahoma", Font.BOLD, 13));
		ap1.setText("Primer apellido: ");
		add(ap1);

		ap1T.setBounds(137, 145, 150, 15);
		ap1T.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(ap1T);
		
		// Segundo apellido
		correo.setBounds(12, 175, 65, 15);
		correo.setFont(new Font("Tahoma", Font.BOLD, 13));
		correo.setText("Correo: ");
		add(correo);

		correoT.setBounds(71, 175, 216, 15);
		correoT.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(correoT);

		// Sexo
		sexo.setBounds(12, 205, 45, 15);
		sexo.setFont(new Font("Tahoma", Font.BOLD, 13));
		sexo.setText("Sexo: ");
		add(sexo);

		chckbxHombre.setBounds(55, 201, 80, 23);
		add(chckbxHombre);
		chckbxMujer.setBounds(139, 201, 65, 23);
		add(chckbxMujer);

		// Edad
		edad.setBounds(12, 235, 123, 15);
		edad.setFont(new Font("Tahoma", Font.BOLD, 13));
		edad.setText("Mayor de edad: ");
		add(edad);

		rbtn.setBounds(137, 231, 236, 23);
		add(rbtn);

		// Ciudad
		ciudad.setBounds(12, 262, 69, 15);
		ciudad.setFont(new Font("Tahoma", Font.BOLD, 13));
		ciudad.setText("Ciudad: ");
		add(ciudad);
 
		combo1.setBounds(82, 259, 100, 25);
		add(combo1);
		combo1.addItem("Pego");
		combo1.addItem("Oliva");
		combo1.addItem("Denia");
		combo1.addItem("Benissa");
		combo1.addItem("Ondara");
		
		contr.setBounds(12, 297, 94, 15);
		contr.setFont(new Font("Tahoma", Font.BOLD, 13));
		contr.setText("Contraseña: ");
		add(contr);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 295, 123, 19);
		add(passwordField);
		
		JLabel contr_1 = new JLabel();
		contr_1.setText("Repita la contraseña: ");
		contr_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		contr_1.setBounds(12, 326, 170, 15);
		add(contr_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(177, 324, 123, 19);
		add(passwordField_1);

		btn.setBounds(176, 385, 129, 50);
		btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		add(btn);
	}
	
	public static void main(String[] args) {
		Act2 form = new Act2();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}