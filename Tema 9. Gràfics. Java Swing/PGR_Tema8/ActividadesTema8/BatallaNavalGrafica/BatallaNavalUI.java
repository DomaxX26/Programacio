package BatallaNavalGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class BatallaNavalUI extends JFrame implements ActionListener {
	JPanel a = (JPanel) this.getContentPane();
	JTextField screen;
	JPanel panel = new JPanel();

	JRadioButton rdbtnH = new JRadioButton("Horizontal");
	JRadioButton rdbtnV = new JRadioButton("Vertical");
	ButtonGroup g1 = new ButtonGroup();
	int tamano;

	JButton bConfirmar = new JButton("Confirmar");
	JButton reiniciar = new JButton("Reiniciar");
	JButton disparar = new JButton("Disparar");
	JComboBox<String> cB = new JComboBox<String>();
	JTextField vidas;

	JLabel[] nums = new JLabel[8];
	JLabel[] lets = new JLabel[8];
	JButton[][] btns = new JButton[8][8];
	JButton[] btns_1 = new JButton[4];
	int f = 8;
	int c = 8;

	// Posiciones de los barcos
	ArrayList<String> pA = new ArrayList<String>(3);
	ArrayList<String> pD = new ArrayList<String>(2);
	ArrayList<String> pF = new ArrayList<String>(1);
	ArrayList<String> pP = new ArrayList<String>(4);
	ArrayList<String> pS = new ArrayList<String>(3);
	ArrayList<String> agua = new ArrayList<String>(51);

	int dispA = 3, dispD = 2, dispF = 1, dispP = 4, dispS = 3;
	int vidasS = 30;

	public BatallaNavalUI() {
		a.setLayout(null);
		setBounds(100, 100, 1280, 720);
		setTitle("Batalla Naval");
		setVisible(true);
		setResizable(false);

		// Vidas
		vidas = new JTextField();
		vidas.setHorizontalAlignment(SwingConstants.CENTER);
		vidas.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 25));
		vidas.setBackground(new Color(0, 255, 255));
		vidas.setBounds(701, 80, 62, 67);
		getContentPane().add(vidas);
		vidas.addActionListener(this);

		panel.setLayout(new GridLayout(8, 8, 5, 5));
		panel.setBounds(138, 126, 480, 480);
		panel.setOpaque(false);
		getContentPane().add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(847, 264, 276, 76);
		getContentPane().add(panel_1);
		panel_1.setOpaque(false);
		panel_1.setLayout(new GridLayout(1, 4, 5, 5));

		screen = new JTextField("BATALLA NAVAL");
		screen.setBackground(new Color(135, 206, 250));
		screen.setForeground(Color.RED);
		screen.setFont(new Font("URW Chancery L", Font.BOLD | Font.ITALIC, 35));
		screen.setBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(139, 69, 19), 2),
				new LineBorder(new Color(160, 82, 45), 2)), new LineBorder(new Color(205, 133, 63), 2)));
		screen.setHorizontalAlignment(SwingConstants.CENTER);
		screen.setBounds(143, 12, 442, 44);
		getContentPane().add(screen);

		// NUMEROS
		int cont1 = 0;
		for (int i = 0; i < 8; i++) {
			nums[i] = new JLabel();
			nums[i].setForeground(Color.BLACK);
			nums[i].setFont(new Font("TlwgTypewriter", Font.BOLD | Font.ITALIC, 35));
			nums[i].setText("" + (i + 1));
			nums[i].setBackground(Color.lightGray);
			nums[i].setBounds(156 + cont1, 94, 26, 30);
			getContentPane().add(nums[i]);
			cont1 += 60;
		}
		int cont2 = 0;

		// LETRAS
		for (int i = 0; i < 8; i++) {
			lets[i] = new JLabel();
			lets[i].setForeground(Color.BLACK);
			lets[i].setFont(new Font("TlwgTypewriter", Font.BOLD | Font.ITALIC, 35));
			lets[i].setText(Character.toString((char) 65 + i));
			lets[i].setBackground(Color.lightGray);
			lets[i].setBounds(107, 140 + cont2, 26, 30);
			getContentPane().add(lets[i]);
			cont2 += 60;
		}

		// BOTONES
		for (int fila = 0; fila < f; fila++) {
			for (int columna = 0; columna < c; columna++) {
				btns[fila][columna] = new JButton();
				btns[fila][columna].setText(Integer.toString((fila)) + Integer.toString((columna)));
				btns[fila][columna].setForeground(Color.blue);
				btns[fila][columna].setBackground(Color.blue);
				panel.add(btns[fila][columna]);
				btns[fila][columna].addActionListener(this);
			}
		}

		// BOTONES_1
		for (int i = 0; i < 4; i++) {
			btns_1[i] = new JButton();
			btns_1[i].setBackground(Color.blue);
			panel_1.add(btns_1[i]);
			btns_1[i].addActionListener(this);
		}

		// ELEGIR BARCO
		cB.setBackground(new Color(210, 105, 30));
		cB.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 28));
		cB.setForeground(Color.BLACK);
		cB.setBounds(870, 103, 227, 44);
		cB.setBorder(new CompoundBorder(new CompoundBorder(new LineBorder(new Color(139, 69, 19), 2),
				new LineBorder(new Color(160, 82, 45), 2)), new LineBorder(new Color(205, 133, 63), 2)));
		cB.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Acorazado", "Destructor", "Fragata", "Portaviones", "Submarino", "Vacio" }));
		getContentPane().add(cB);
		cB.addActionListener(this);

		// DIRECCION
		// Horizontal
		rdbtnH.setBackground(new Color(139, 69, 19));
		rdbtnH.setForeground(new Color(0, 0, 0));
		rdbtnH.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 19));
		rdbtnH.setBounds(847, 474, 136, 23);
		getContentPane().add(rdbtnH);
		rdbtnH.addActionListener(this);
		g1.add(rdbtnH);

		// Vertical
		rdbtnV.setBackground(new Color(139, 69, 19));
		rdbtnV.setForeground(new Color(0, 0, 0));
		rdbtnV.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 19));
		rdbtnV.setBounds(1001, 474, 111, 23);
		getContentPane().add(rdbtnV);
		rdbtnV.addActionListener(this);
		g1.add(rdbtnV);

		// CONFIRMAR
		bConfirmar.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 21));
		bConfirmar.setForeground(new Color(0, 0, 0));
		bConfirmar.setBackground(new Color(160, 82, 45));
		bConfirmar.setBounds(875, 562, 216, 69);
		bConfirmar.setBorder(new CompoundBorder(
				new CompoundBorder(new LineBorder(new Color(128, 0, 0), 5), new LineBorder(new Color(139, 69, 19), 5)),
				new LineBorder(new Color(210, 105, 30), 5)));
		getContentPane().add(bConfirmar);
		bConfirmar.addActionListener(this);
		reiniciar.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 21));
		reiniciar.setForeground(new Color(0, 0, 0));
		reiniciar.setBackground(new Color(255, 0, 0));

		// REINICIAR
		reiniciar.setBounds(702, 586, 146, 45);
		getContentPane().add(reiniciar);
		reiniciar.addActionListener(this);
		disparar.setFont(new Font("URW Bookman L", Font.BOLD | Font.ITALIC, 21));
		disparar.setBackground(new Color(0, 255, 0));
		disparar.setForeground(new Color(0, 0, 0));

		// DISPARAR
		disparar.setBounds(1118, 586, 136, 45);
		getContentPane().add(disparar);
		disparar.addActionListener(this);

		// FONDO
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(
				new ImageIcon("/home/pipo/eclipse-workspace/PGR_Tema8/ActividadesTema8/BatallaNavalGrafica/fondo.png"));
		fondo.setBounds(0, 0, 1280, 720);
		getContentPane().add(fondo);

	}

	public static void main(String[] args) {
		BatallaNavalUI cM = new BatallaNavalUI();
		cM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		reiniciar(e);
		cogerTamano();
		// Para borrar la preseleccion
		if (cB.isShowing() && e.getSource() != bConfirmar) {
			for (int a = 0; a < btns.length; a++) {
				for (int b = 0; b < btns.length; b++) {
					if (btns[a][b].getBackground() == Color.cyan && !cB.getSelectedItem().equals("Vacio")) {
						btns[a][b].setBackground(Color.blue);
					}
				}
			}
		}
		for (int x = 0; x < btns.length; x++) {
			for (int z = 0; z < btns.length; z++) {
				if (e.getSource() == btns[x][z]) {
					String[] p = e.getActionCommand().split("(?<=.)"); //
					int i = Integer.parseInt(p[0]); // Uso un split para separar los numeros de los botones para
													// detectar la posicion de estos
					int j = Integer.parseInt(p[1]); //

					rellenarSobrante();

					// Comprobar posicion
					if (rdbtnH.isSelected() && j + tamano < 9) {
						for (int y = j; y < j + tamano; y++) {
							if (btns[i][y].getBackground() != Color.blue) {
								screen.setText("Posicion ocupada");
								rellenarSobrante();
								break;
							} else {
								btns[i][y].setBackground(Color.cyan);
								screen.setText("Posicion valida");
							}
						}

					} else if (rdbtnV.isSelected() && i + tamano < 9) {
						for (int y = i; y < i + tamano; y++) {
							if (btns[y][j].getBackground() != Color.blue) {
								screen.setText("Posicion ocupada");
								rellenarSobrante();
								break;
							} else {
								btns[y][j].setBackground(Color.cyan);
								screen.setText("Posicion valida");
							}
						}
					} else {
						screen.setText("Posicion invalida");
					}
				} else if (e.getSource() == bConfirmar) { // Colocar en la posicion confirmada
					for (int a = 0; a < btns.length; a++) {
						for (int b = 0; b < btns.length; b++) {
							if (btns[a][b].getBackground() == Color.cyan) {
								btns[a][b].setBackground(btns_1[0].getBackground());
							}
						}
					}
				}
			}
		}

		// Cambiar color numeros
		for (int a = 0; a < btns.length; a++) {
			for (int b = 0; b < btns.length; b++) {
				btns[a][b].setForeground(btns[a][b].getBackground());
			}
		}
		cogerPosBarcos(e);
		disparar(e);
		confirmar(e);
	}

	public void confirmar(ActionEvent e) {
		if (e.getSource() == bConfirmar && !cB.getSelectedItem().equals("Vacio")
				&& screen.getText().equals("Posicion valida")) {
			cB.removeItem(cB.getSelectedItem());
			screen.setText("Barco colocado");
		} else if (e.getSource() == bConfirmar && cB.getSelectedItem().equals("Vacio")) {
			screen.setText("No quedan mas barcos");
		} else if (e.getSource() == bConfirmar && !screen.getText().equals("Posicion valida")) {
			screen.setText("Barco no colocado");
		}
	}

	public void rellenarSobrante() {
		if (!cB.getSelectedItem().equals("Vacio")) {
			for (int a = 0; a < btns.length; a++) {
				for (int b = 0; b < btns.length; b++) {
					if (btns[a][b].getBackground() == Color.cyan) {
						btns[a][b].setBackground(Color.blue);
					}
				}
			}
		}
	}

	public void cogerTamano() {
		for (int j = 0; j < 4; j++) {
			btns_1[j].setBackground(Color.blue);
		}
		if (cB.getSelectedItem().equals("Acorazado")) {
			tamano = 3;
			for (int i = 0; i < tamano; i++) {
				btns_1[i].setBackground(Color.white);
			}
		} else if (cB.getSelectedItem().equals("Destructor")) {
			tamano = 2;
			for (int i = 0; i < tamano; i++) {
				btns_1[i].setBackground(Color.green);
			}
		} else if (cB.getSelectedItem().equals("Fragata")) {
			tamano = 1;
			for (int i = 0; i < tamano; i++) {
				btns_1[i].setBackground(Color.yellow);
			}
		} else if (cB.getSelectedItem().equals("Portaviones")) {
			tamano = 4;
			for (int i = 0; i < tamano; i++) {
				btns_1[i].setBackground(Color.red);
			}
		} else if (cB.getSelectedItem().equals("Submarino")) {
			tamano = 3;
			for (int i = 0; i < tamano; i++) {
				btns_1[i].setBackground(Color.magenta);
			}
		} else if (cB.getSelectedItem().equals("Vacio")) {
			tamano = 0;
		}
	}

	public void reiniciar(ActionEvent e) {
		if (e.getSource() == reiniciar || screen.getText().equals("DERROTA") || screen.getText().equals("VICTORIA")) {
			dispA = 3;
			dispD = 2;
			dispF = 1;
			dispP = 4;
			dispS = 3; // Reiniciamos los contadores
			pA.clear();
			pD.clear();
			pF.clear();
			pP.clear();
			pS.clear(); // Reiniciamos los puntos guardados
			vidasS = 30; // Reiniciar vidas
			for (int i = 0; i < btns.length; i++) {
				for (int j = 0; j < btns.length; j++) {
					btns[i][j].setBackground(Color.blue);
					btns[i][j].setForeground(Color.blue);
				}
			}
			cB.setModel(new javax.swing.DefaultComboBoxModel<>(
					new String[] { "Acorazado", "Destructor", "Fragata", "Portaviones", "Submarino", "Vacio" }));
		}
	}

	public void cogerPosBarcos(ActionEvent e) {
		int contA = 0, contD = 0, contF = 0, contP = 0, contS = 0, contAgua = 0;
		if (cB.getSelectedItem().equals("Vacio")) {
			for (int i = 0; i < btns.length; i++) {
				for (int j = 0; j < btns.length; j++) {
					if (btns[i][j].getBackground() == Color.white) {
						pA.add(contA, btns[i][j].getText());
						contA++;
					} else if (btns[i][j].getBackground() == Color.green) {
						pD.add(contD, btns[i][j].getText());
						contD++;
					} else if (btns[i][j].getBackground() == Color.yellow) {
						pF.add(contF, btns[i][j].getText());
						contF++;
					} else if (btns[i][j].getBackground() == Color.red) {
						pP.add(contP, btns[i][j].getText());
						contP++;
					} else if (btns[i][j].getBackground() == Color.magenta) {
						pS.add(contS, btns[i][j].getText());
						contS++;
					} else if (btns[i][j].getBackground() == Color.blue) {
						agua.add(contAgua, btns[i][j].getText());
						contAgua++;
					}
				}
			}
		}
	}

	public void disparar(ActionEvent e) {
		if (cB.getSelectedItem().equals("Vacio") && cB.getItemCount() == 1 && e.getSource() != bConfirmar) {
			if (screen.getText().equals("Barco colocado")) {
				for (int a = 0; a < btns.length; a++) {
					for (int b = 0; b < btns.length; b++) {
						btns[a][b].setBackground(Color.blue);
						btns[a][b].setForeground(Color.blue);
					}
				}
			}
			for (int a = 0; a < btns.length; a++) {
				for (int b = 0; b < btns.length; b++) {
					if (e.getSource() == btns[a][b]) {
						vidas.setText(Integer.toString(vidasS));
						vidasS--;
					}
					if (e.getSource() == btns[a][b]) {
						String[] p = e.getActionCommand().split("(?<=.)");
						int x = Integer.parseInt(p[0]);
						int z = Integer.parseInt(p[1]);

						for (int j = 0; j < pA.size(); j++) {
							if (e.getActionCommand().equals(pA.get(j)) && btns[a][b].getBackground() == Color.blue) {
								screen.setText("Tocado");
								btns[x][z].setBackground(Color.white);
								btns[x][z].setForeground(Color.white);
								dispA--;
								if (dispA == 0) {
									screen.setText("Acorazado hundido");
								}
							}
						}
						for (int j = 0; j < pD.size(); j++) {
							if (e.getActionCommand().equals(pD.get(j)) && btns[a][b].getBackground() == Color.blue) {
								screen.setText("Tocado");
								btns[x][z].setBackground(Color.green);
								btns[x][z].setForeground(Color.green);
								dispD--;
								if (dispD == 0) {
									screen.setText("Destructor hundido");
								}
							}
						}
						for (int j = 0; j < pF.size(); j++) {
							if (e.getActionCommand().equals(pF.get(j)) && btns[a][b].getBackground() == Color.blue) {
								screen.setText("Tocado");
								btns[x][z].setBackground(Color.yellow);
								btns[x][z].setForeground(Color.yellow);
								dispF--;
								if (dispF == 0) {
									screen.setText("Fragata hundida");
								}
							}
						}
						for (int j = 0; j < pP.size(); j++) {
							if (e.getActionCommand().equals(pP.get(j)) && btns[a][b].getBackground() == Color.blue) {
								screen.setText("Tocado");
								btns[x][z].setBackground(Color.red);
								btns[x][z].setForeground(Color.red);
								dispP--;
								if (dispP == 0) {
									screen.setText("Portaviones hundido");
								}
							}
						}
						for (int j = 0; j < pS.size(); j++) {
							if (e.getActionCommand().equals(pS.get(j)) && btns[a][b].getBackground() == Color.blue) {
								screen.setText("Tocado");
								btns[x][z].setBackground(Color.magenta);
								btns[x][z].setForeground(Color.magenta);
								dispS--;
								if (dispS == 0) {
									screen.setText("Submarino hundido");
								}
							}
						}
						for (int j = 0; j < agua.size(); j++) {
							if (e.getActionCommand().equals(agua.get(j)) && btns[a][b].getBackground() == Color.blue) {
								screen.setText("Agua");
								btns[a][b].setBackground(Color.cyan);
								btns[a][b].setForeground(Color.cyan);
							}
						}
					}
				}
			}
			if (dispA == 0 && dispD == 0 && dispF == 0 && dispP == 0 && dispS == 0) {
				screen.setText("VICTORIA");
			} else if (vidasS == -1) {
				screen.setText("DERROTA");
				reiniciar(e);
			}
		}
	}
}
