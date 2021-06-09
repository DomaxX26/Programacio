import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class PanelTablero extends JPanel{
	
	public Celda[][] celdas; //Celdas jugables donde habra agua, barcos, etc..
	private Tablero tablero;
	
	public PanelTablero(Tablero tablero) {
		this.tablero = tablero;
		//Construimos celdas para las "aguas"
		celdas = new Celda[8][8];
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				celdas[i][j] = new Celda(new PuntoXY(i,j));
		
		//Celdas con número
		Celda[] celdasX = new Celda[8];
		Celda[] celdasY = new Celda[8];
		for (int i = 0; i < 8; i++) {
			celdasX[i] = new Celda(new JLabel(Integer.toString(i)));
			celdasY[i] = new Celda(new JLabel(Integer.toString(i)));
		}
		//Maquetamos tablero
		 setLayout(new GridLayout(9,9,4,4)); //Esta grilla tendrá ambos tipos de celdas
		 //La grilla se rellena fila a fila.
		 //1ª fila
		 add(new JPanel());//Primera celda de la grilla no será nada, solo un panel vacío.
		 //A continuación, las Celdas con número para las Columnas, o sea, el eje Y de coordenadas
		 for (Celda valorEjeY: celdasY)
			 add(valorEjeY);
		
		 //Las siguientes filas las automatizamos con bucles anidado
		 for (int i = 0; i < 8 ; i++) {
			 add(celdasX[i]); //Comienza con número de Fila, o sea, eje X
			 //A continuación, una tanda de Celdas "agua" de las que tenemos en la matriz
			 for (Celda agua: celdas[i])
				 add(agua);
		 }
		
	}
	
	/**
	 * Cambia el color de las Celdas según la información del Tablero modelo
	 */
	public void setTableroModelo() {
		//Recorremos celdas y modificamos colores según valores del modelo
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++) {
				switch(tablero.tablero[i][j]) { //Consultamos matriz del Tablero
				case 0: //Casilla sin desvelar
					celdas[i][j].setBackground(Color.WHITE);
					break;
				case 1: //Barco
					celdas[i][j].setBackground(Color.DARK_GRAY);
					break;
				case 2: //Barco Tocado
					celdas[i][j].setBackground(Color.RED);
					break;
				case 3: //Agua/Disparo fallido
					celdas[i][j].setBackground(Color.CYAN);
					break;
				}
			}
				
	}
	
	/**
	 * Habrán dos tipos de Celdas.
	 * Una tendrá una etiqueta para mostrar el número de fila
	 * o columna que representa, con valores de 0 a 7. Serán las
	 * Celdas que identifican las coordenadas.
	 *
	 * Las otras no tendrán etiqueta y representarán las "aguas" donde
	 * se lleva a cabo la batalla.
	 *
	 * Tendremos dos constructores, cada uno para configurar la Celda
	 * de un modo u otro.
	 */
	public class Celda extends JPanel {
		
		public PuntoXY coord; //Solo algunas casillas tendrán coordenadas
		private JLabel numCelda;//Solo algunas casillas mostrarán número
		
		public Celda(PuntoXY coord) {
			this.coord = coord;
			setPreferredSize(new Dimension(50, 50));
			setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));
			setBackground(Color.WHITE);
		}
		
		public Celda(JLabel numCelda) {
			this.numCelda= numCelda;
			setPreferredSize(new Dimension(25, 25));
			setBorder(BorderFactory.createLineBorder(Color.BLACK, 4, true));
			numCelda.setFont(new Font("Verdana", Font.BOLD, 22));
			numCelda.setForeground(Color.WHITE);
			add(numCelda);
			setBackground(new Color(120, 118, 118));
		}
		
	}
	
	public class DialogoCrearBarcos extends JDialog{
		
		//Modelo
		private Tablero tablero;
		private int dificultad; //Determina cuantos barcos se colocan
		private int maxBarcos;
		//Vista
		public PanelTablero panelTablero;
		private JComboBox<String> listaBarcos;
		private JButton botonTerminar;
		private JButton botonCancelar;
		
		public DialogoCrearBarcos(Frame parent, boolean modal, int dificultad, Tablero tablero) {
			super(parent, modal);
			this.tablero = tablero;
			this.dificultad = dificultad;
			switch (dificultad) {
			case 1: //5 barcos, se repite un destructor
				maxBarcos = 5;
				break;
			case 2: //4 barcos
				maxBarcos = 4;
				break;
			case 3: //2 barcos
				maxBarcos = 2;
				break;
			case 4: //1 barco
				maxBarcos = 1;
				break;
			}
			
			setLayout(new BorderLayout());
			add(new PanelNorte(), BorderLayout.NORTH);
			add(new PanelCentro(), BorderLayout.CENTER);
			add(new PanelSur(), BorderLayout.SOUTH);
			
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			pack();
			setLocationRelativeTo(null);
			setResizable(false);
		}
		
		/**
		 * Intentará colocar el Barco correspondiente al código recibido,
		 * en la orientación indicada, a partir de la Celda especificada.<br>
		 * Se apoya en los métodos colocarVertical() y colocarHorizontal().
		 * @param codigo String que identifica el tipo de Barco
		 * @param orientacion Si el valor es 0 será vertical y 1 será horizontal.
		 * @param celda Celda a partir de la cuál se intentará colocar el Barco
		 */
		private void colocarBarco(String codigo, int orientacion, Celda celda) {

			boolean colocado;
			
			if (orientacion == 0) //Vertical
				colocado = colocarVertical(codigo, celda);
			else
				colocado = colocarHorizontal(codigo, celda);
				
			//Si se ha colocado el Barco, comprobamos si se permite poner más

			if (colocado) {
				limiteBarcos--;
				
				if (limiteBarcos == 0) {
					listaBarcos.setEnabled(false);
					panelTablero.desactivarListener();
					botonTerminar.setEnabled(true);
				}
				else {
					/*
					 * Se permiten más barcos, pero no el mismo que acabamos de poner.
					 * Solo se puede repetir el Destructor, si estamos en nivel EASY
					 */
					if (codigo.equals("DT")) {
						if (dificultad != 1) //No es EASY
							listaBarcos.removeItem("DT-Destructor");
						else if (tablero.hayDosDestructores()) //EASY, solo si ya hay dos eliminamos DT de la lista
							listaBarcos.removeItem("DT-Destructor");
					}
					else //No es destructor, eliminamos el Barco correspondiente al código
						listaBarcos.removeItem(listaBarcos.getSelectedItem());					
				}
			}
		}
		
		/**
		 * Comprueba si ya hay dos Destructores en el Tablero.<br>
		 * El Destructor es el único Barco que se puede repetir y solo
		 * cuando el nivel de dificultad es EASY. Con este método comprobamos
		 * si ya se ha se ha alcanzado este límite permitido.
		 * @return <i>True</i> si ya hay dos destructores, <i>False</i> en caso contrario.
		 */
		public boolean hayDosDestructores() {
			int dt = 0;
			for (Barco b: barcos)
				if (b.getCodigo().equals("DT"))
					dt++;
			return dt == 2;
		}
		
		/**
		 * Elimina los MouseListener de cada Celda.<br>
		 * Esto sirve para cuando queremos que el usuario
		 * no pueda clickar en las Celdas, por ejemplo
		 * cuando ya ha colocado todos los barcos
		 */
		public void desactivarListener() {
			for (int i = 0; i < 8; i++)
				for (int j = 0; j < 8; j++)
					celdas[i][j].removeMouseListener(celdas[i][j].getMouseListeners()[0]);		
		}
		
		/**
		 * Intentará colocar el barco indicado en la columna vertical de la Celda
		 * donde el usuario ha clickado.<br>Dicha Celda será el origen y se intentará
		 * colocar primero desde ese origen hacia abajo. Si no fuera posible se
		 * intentará hacia arriba.<br>Si consigue colocar el Barco, quedará registrado
		 * en la Lista de Barcos del Tablero(modelo).
		 * Este método se apoya en los métodos <i>comprobarVerticalAbajo()</i> y
		 * <i>comprobarVerticalArriba()</i>
		 * @param codigo String para indicar tipo de Barco
		 * @param origen Celda a partir de la cuál se intentará colocar el Barco.
		 * @return <i>True</i> si se colocó con éxito, <i>False</i> en caso contrario
		 */
		private boolean colocarVertical(String codigo, Celda origen) {
			//Calculamos casillas restantes necesarias según tipo de barco
			int casillas = 0;
			switch(codigo) {
			case "PA": //PortaAviones 5 casillas, necesitamos 4 más la Celda origen
				casillas = 4;
				break;
			case "AZ": //Acorazado 4 casillas, 3 más queremos
				casillas = 3;
				break;
			case "SM": //Submarino 3 casillas, 2 más
				casillas = 2;
				break;
			case "DT": //Destructor 2 casillas, 1 más
				casillas = 1;
				break;
			}
			//Intentamos colocar hacia abajo primero, y si no, hacia arriba
			if (comprobarVerticalAbajo(origen, casillas)) {
				//Colocamos Barco desde la casilla indicada, hacia abajo
				Barco barco = new Barco(codigo);
				int y = origen.coord.y;
				int x = origen.coord.x;
				for (int i = x; i <= (x + casillas); i++)
					barco.addCoordenada(new PuntoXY(i, y)); //Añadimos coordenada al Barco
				/*
				 * Barco construido, lo añadimos a la lista de Barcos del Tablero.
				 * Este método para añadir, se encarga también de actualizar
				 * la matriz del Tablero poniendo valor 1 ahí donde ocupa el Barco.
				 */
				tablero.addBarco(barco);
				panelTablero.setTableroModelo(); //Actualizamos la Vista para mostrar nuevo Barco
				return true;
			}
			else if (comprobarVerticalArriba(origen, casillas)) {
				Barco barco = new Barco(codigo);
				int y = origen.coord.y;
				int x = origen.coord.x;
				for (int i = x; i >= (x - casillas); i--)
					barco.addCoordenada(new PuntoXY(i, y));

				tablero.addBarco(barco);
				panelTablero.setTableroModelo(); //Actualizamos la Vista para mostrar nuevo Barco
				return true;
			}
			else {
				JOptionPane.showMessageDialog(null, "No hay espacio disponible en esta vertical"
						+ "\nPruebe otra Celda como origen","Colocar Barco", JOptionPane.WARNING_MESSAGE);
				return false;
			}
		}
		
		/**
		 * Comprueba si hay espacio en la vertical inferior a partir
		 * de la Celda considerada como origen.<br>
		 * @param origen Celda en la que se ha clickado
		 * @param casillas Cantidad de casillas necesarias además de la
		 * ocupada por la Celda origen.
		 * @return <i>True</i> si hay espacio libre, <i>False</i> si no hay espacio.
		 */
		private boolean comprobarVerticalAbajo(Celda origen, int casillas) {
			int y = origen.coord.y;
			int x = origen.coord.x;
			if (7 - x >= casillas) {
				//Hay espacio hacia abajo, pero hay que comprobar si está libre.
				for (int i = x; i <= (x + casillas); i++)
					if (tablero.tablero[i][y] != 0)
						return false; //Hay otro barco, no se puede colocar
				//Si bucle for no retorna false, es que hay hueco libre
				return true;
			}
			else
				return false; //No hay tablero suficiente
		}
		
		/**
		 * Comprueba si hay espacio en la vertical superior a partir
		 * de la Celda considerada como origen.<br>
		 * @param origen Celda en la que se ha clickado
		 * @param casillas Cantidad de casillas necesarias además de la
		 * ocupada por la Celda origen.
		 * @return <i>True</i> si hay espacio libre, <i>False</i> si no hay espacio.
		 */
		private boolean comprobarVerticalArriba(Celda origen, int casillas) {
			int y = origen.coord.y;
			int x = origen.coord.x;
			if (x - 0 >= casillas) {
				for (int i = x; i >= (x - casillas); i--)
					if (tablero.tablero[i][y] != 0)
						return false;

				return true;
			}
			else
				return false;
		}
		
		/**
		 * Intentará colocar el barco indicado en la columna horizontal de la Celda
		 * donde el usuario ha clickado.<br>Dicha Celda será el origen y se intentará
		 * colocar primero desde ese origen hacia derecha. Si no fuera posible se
		 * intentará hacia izquierda.<br>Si consigue colocar el Barco, quedará registrado
		 * en la Lista de Barcos del Tablero(modelo).
		 * Este método se apoya en los métodos <i>comprobarHorizontalDerecha()</i> y
		 * <i>comprobarHorizontalIzquierda()</i>
		 * @param codigo String para indicar tipo de Barco
		 * @param origen Celda a partir de la cuál se intentará colocar el Barco.
		 * @return <i>True</i> si se colocó con éxito, <i>False</i> en caso contrario
		 */
		private boolean colocarHorizontal(String codigo, Celda origen) {
			//Calculamos casillas restantes necesarias según tipo de barco
			int casillas = 0;
			switch(codigo) {
			case "PA": //PortaAviones 5 casillas, necesitamos 4 más la Celda origen
				casillas = 4;
				break;
			case "AZ": //Acorazado 4 casillas, 3 más queremos
				casillas = 3;
				break;
			case "SM": //Submarino 3 casillas, 2 más
				casillas = 2;
				break;
			case "DT": //Destructor 2 casillas, 1 más
				casillas = 1;
				break;
			}

			if (comprobarHorizontalDerecha(origen, casillas)) {
				//Colocamos Barco desde la casilla indicada, hacia derecha
				Barco barco = new Barco(codigo);
				int y = origen.coord.y;
				int x = origen.coord.x;
				for (int i = y; i <= (y + casillas); i++)
					barco.addCoordenada(new PuntoXY(x, i)); //Añadimos coordenada al Barco
				/*
				 * Barco construido, lo añadimos a la lista de Barcos del Tablero.
				 * Este método para añadir, se encarga también de actualizar
				 * la matriz del Tablero poniendo valor 1 ahí donde ocupa el Barco.
				 */
				tablero.addBarco(barco);
				panelTablero.setTableroModelo(); //Actualizamos la Vista para mostrar nuevo Barco
				return true;
			}
			else if (comprobarHorizontalIzquierda(origen, casillas)) {
				Barco barco = new Barco(codigo);
				int y = origen.coord.y;
				int x = origen.coord.x;
				for (int i = y; i >= (y - casillas); i--)
					barco.addCoordenada(new PuntoXY(x, i));

				tablero.addBarco(barco);
				panelTablero.setTableroModelo(); //Actualizamos la Vista para mostrar nuevo Barco
				return true;
			}
			else {
				JOptionPane.showMessageDialog(null, "No hay espacio disponible en esta horizontal"
						+ "\nPruebe otra Celda como origen","Colocar Barco", JOptionPane.WARNING_MESSAGE);
				return false;
			}
		}
		
		/**
		 * Comprueba si hay espacio en la horizontal derecha a partir
		 * de la Celda considerada como origen.<br>
		 * @param origen Celda en la que se ha clickado
		 * @param casillas Cantidad de casillas necesarias además de la
		 * ocupada por la Celda origen.
		 * @return <i>True</i> si hay espacio libre, <i>False</i> si no hay espacio.
		 */
		private boolean comprobarHorizontalDerecha(Celda origen, int casillas) {
			int y = origen.coord.y;
			int x = origen.coord.x;
			if ((7 - y) >= casillas) {
				for (int i = y; i <= (y + casillas); i++)
					if (tablero.tablero[x][i] != 0)
						return false;

				return true;
			}
			else
				return false;
		}
		
		/**
		 * Comprueba si hay espacio en la horizontal izquierda a partir
		 * de la Celda considerada como origen.<br>
		 * @param origen Celda en la que se ha clickado
		 * @param casillas Cantidad de casillas necesarias además de la
		 * ocupada por la Celda origen.
		 * @return <i>True</i> si hay espacio libre, <i>False</i> si no hay espacio.
		 */
		private boolean comprobarHorizontalIzquierda(Celda origen, int casillas) {
			int y = origen.coord.y;
			int x = origen.coord.x;
			if ((y - 0) >= casillas) {
				for (int i = y; i >= (y - casillas); i--)
					if (tablero.tablero[x][i] != 0)
						return false;

				return true;
			}
			else
				return false;
		}
		
		private class PanelNorte extends JPanel {
			
			public PanelNorte() {
				
				String[] lista = new String[] {"PA-PortaAviones", "AZ-Acorazado",
						"SM-Submarino", "DT-Destructor"};
				listaBarcos = new JComboBox<String>(lista);
				add(listaBarcos);
				setBorder(BorderFactory.createTitledBorder("Seleccione tipo de Barco y pulse una casilla para colocarlo"));
				
			}
		}
		
		private class PanelCentro extends JPanel {
			
			public PanelCentro() {
				panelTablero = new PanelTablero(tablero);
				panelTablero.setTableroModelo();
				//Añadimos listener a las Celdas
				for (int i = 0; i < 8; i++)
					for (int j = 0; j < 8; j++)
						panelTablero.celdas[i][j].addMouseListener((MouseListener) new ClickCelda());
				add(panelTablero);
				
				setBorder(BorderFactory.createCompoundBorder(
						BorderFactory.createEmptyBorder(20, 20, 20, 20),
						BorderFactory.createBevelBorder(BevelBorder.RAISED)));
			}
			
		}
		
		private class PanelSur extends JPanel {
			
			public PanelSur() {
				botonTerminar = new JButton("Terminar");
				botonTerminar.setEnabled(false);
				botonCancelar = new JButton("Cancelar");
				botonCancelar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
							cerrarDialogo();
					}	
				});
				
				JPanel izq = new JPanel();
				izq.add(botonTerminar);
				JPanel der = new JPanel();
				der.add(botonCancelar);
				
				setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
				add(izq); add(der);
				setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
			}
		}
		
		/**
		 * Cierra este JDialog, previa confirmación del usuario.
		 */
		private void cerrarDialogo() {
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea Cancelar?",
					"Colocar Barcos", JOptionPane.YES_NO_OPTION);
			if (respuesta == JOptionPane.YES_OPTION)
				dispose();
		}
		
		//Clase MouseListener para las Celdas
		class ClickCelda implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				//Consultamos código barco seleccionado
				String codigo = ((String) listaBarcos.getSelectedItem()).substring(0, 2);
				//Celda en la que se ha hecho click
				Celda cel = (Celda) e.getSource();
				///Sus coordenadas
				int x = cel.coord.x;
				int y = cel.coord.y;
				//Consultamos a la matriz del tablero modelo si está libre o no esta Celda
				if (tablero.tablero[x][y] == 1)
					JOptionPane.showMessageDialog(null, "Ya hay un Barco en esta casilla",
							"Colocar Barcos", JOptionPane.WARNING_MESSAGE);
				else {
					//Pedimos orientacion
					String[] opciones = new String[] {"Vertical", "Horizontal"};
					int orientacion = JOptionPane.showOptionDialog(null, "Elija orientación",
							"Colocar Barcos", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);
					
					colocarBarco(codigo, orientacion, cel);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		}

	}

}
