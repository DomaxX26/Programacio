package CalculadorGrafica;

import java.awt.event.ActionEvent;

public class OpCalculadora extends Calculadora {

	public void actionPerformed(ActionEvent e) {
		// Imprimir numeros y simbolos en la pantalla
		if (e.getSource() == btn0) {
			if (screen.getText() == "") {
				screen.setText("0");
			} else {
				screen.setText(screen.getText() + "0");
			}
		} else if (e.getSource() == btn1) {
			if (screen.getText() == "") {
				screen.setText("1");
			} else {
				screen.setText(screen.getText() + "1");
			}
		} else if (e.getSource() == btn2) {
			if (screen.getText() == "") {
				screen.setText("2");
			} else {
				screen.setText(screen.getText() + "2");
			}
		} else if (e.getSource() == btn3) {
			if (screen.getText() == "") {
				screen.setText("3");
			} else {
				screen.setText(screen.getText() + "3");
			}
		} else if (e.getSource() == btn4) {
			if (screen.getText() == "") {
				screen.setText("4");
			} else {
				screen.setText(screen.getText() + "4");
			}
		} else if (e.getSource() == btn5) {
			if (screen.getText() == "") {
				screen.setText("5");
			} else {
				screen.setText(screen.getText() + "5");
			}
		} else if (e.getSource() == btn6) {
			if (screen.getText() == "") {
				screen.setText("6");
			} else {
				screen.setText(screen.getText() + "6");
			}
		} else if (e.getSource() == btn7) {
			if (screen.getText() == "") {
				screen.setText("7");
			} else {
				screen.setText(screen.getText() + "7");
			}
		} else if (e.getSource() == btn8) {
			if (screen.getText() == "") {
				screen.setText("8");
			} else {
				screen.setText(screen.getText() + "8");
			}
		} else if (e.getSource() == btn9) {
			if (screen.getText() == "") {
				screen.setText("9");
			} else {
				screen.setText(screen.getText() + "9");
			}
		} else if (e.getSource() == btnpnt) {
			if (screen.getText() == "") {
				screen.setText(".");
			} else {
				screen.setText(screen.getText() + ".");
			}
		} else if (e.getSource() == btnsum) {
			if (screen.getText() == "") {
				screen.setText("+");
			} else {
				screen.setText(screen.getText() + "+");
			}
		} else if (e.getSource() == btnrest) {
			if (screen.getText() == "") {
				screen.setText("-");
			} else {
				screen.setText(screen.getText() + "-");
			}
		} else if (e.getSource() == btndiv) {
			if (screen.getText() == "") {
				screen.setText("/");
			} else {
				screen.setText(screen.getText() + "/");
			}
		} else if (e.getSource() == btnmult) {
			if (screen.getText() == "") {
				screen.setText("x");
			} else {
				screen.setText(screen.getText() + "*");
			}
		} else if (e.getSource() == btnborr) {
			screen.setText("");
		}

		if (e.getSource() == btnigu) {
			String cadena = screen.getText();
			int cont = 0;
			double res = 0, n;
			char[] simb = new char[100];
			String[] numeros = cadena.split("\\+|\\-|\\*|\\/");

			// ALMACENAR SIMBOLOS
			for (int i = 0; i < cadena.length(); i++) {
				char caract = cadena.charAt(i);
				if (caract == '+') {
					simb[cont] = '+';
					cont++;
				} else if (caract == '-') {
					simb[cont] = '-';
					cont++;
				} else if (caract == '*') {
					simb[cont] = '*';
					cont++;
				} else if (caract == '/') {
					simb[cont] = '/';
					cont++;
				}
			}

			// OPERACIONES
			for (int j = 0; j < numeros.length; j++) {
				if (simb[j] == '+') {
					if (j == 0) {
						for (int x = 0; x < 2; x++) {
							res = res + Double.parseDouble(numeros[x]);
							screen.setText(Double.toString(res));
						}
					} else {
						res = res + Double.parseDouble(numeros[j + 1]);
						screen.setText(Double.toString(res));
					}

				} else if (simb[j] == '-') {
					if (j == 0) {
						for (int x = 0; x < 2; x++) {
							if (j == 0) {
								res = -res - Double.parseDouble(numeros[x]);
								screen.setText(Double.toString(res));
							}
						}
					} else {
						res = res - Double.parseDouble(numeros[j + 1]);
						screen.setText(Double.toString(res));
					}
				} else if (simb[j] == '*') {
					if (j == 0) {
						for (int x = 0; x < 2; x++) {
							res = Double.parseDouble(numeros[0]) * Double.parseDouble(numeros[1]);
							screen.setText(Double.toString(res));
						}
					} else {
						res = res * Double.parseDouble(numeros[j + 1]);
						screen.setText(Double.toString(res));
					}
				} else if (simb[j] == '/') {
					if (j == 0) {
						for (int x = 0; x < 2; x++) {
							res = Double.parseDouble(numeros[0]) / Double.parseDouble(numeros[1]);
							screen.setText(Double.toString(res));
						}
					} else {
						res = res / Double.parseDouble(numeros[j + 1]);
						screen.setText(Double.toString(res));
					}
				}
			}
		}
	}
}
