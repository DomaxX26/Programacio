import java.awt.Frame;
import java.util.Hashtable;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class PanelConfig extends JPanel{

	private JRadioButton radioTutorial;
	private JRadioButton radioArcade;
	private JSlider dificultad;
	public JButton botonVolver;

	public PanelConfig() {

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new PanelModo());
		add(new PanelDifi());
		JPanel pnBoton = new JPanel();
		botonVolver = new JButton("Volver");
		pnBoton.add(botonVolver);
		add(pnBoton);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	}

	private class PanelModo extends JPanel {

		public PanelModo() {
			radioTutorial = new JRadioButton("Tutorial");
			radioArcade = new JRadioButton("Arcade");
			ButtonGroup grupo = new ButtonGroup();
			grupo.add(radioTutorial);
			grupo.add(radioArcade);

			JPanel tuto = new JPanel();
			tuto.add(radioTutorial);
			JPanel arc = new JPanel();
			arc.add(radioArcade);

			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			add(tuto); add(arc);
			setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createTitledBorder("Modo de Juego"),
					BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		}
	}

	private class PanelDifi extends JPanel {

		public PanelDifi() {
			dificultad = new JSlider(1,4);
			Hashtable<Integer, JLabel> valores = new Hashtable<Integer, JLabel>();
			valores.put(1, new JLabel("EASY"));
			valores.put(2, new JLabel("NORMAL"));
			valores.put(3, new JLabel("EXPERT"));
			valores.put(4, new JLabel("GENIUS"));
			dificultad.setLabelTable(valores);
			dificultad.setPaintLabels(true);
			dificultad.setSnapToTicks(true);
			
			add(dificultad);
			setBorder(BorderFactory.createCompoundBorder(
					BorderFactory.createTitledBorder("Nivel Dificultad"),
					BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		}
	}
	
	/**
	 * Recupera los valores seleccionados y los retorna
	 * en un array.
	 * @return Array de int[] con los valores de configuración.
	 */
	public int[] getConfig() {
		int modoJuego = radioTutorial.isSelected()?1:2;
		int nivel = dificultad.getValue();
		
		return new int[] {modoJuego, nivel};
	}
	
	/**
	 * Recibe los valores de configuración que constan en la
	 * clase BattleShip y los setea en este panel.
	 * @param config Array de int[] con los valores de configuración
	 */
	public void setConfig(int[] config) {
		if (config[0] == 1)
			radioTutorial.doClick(); //Selecciona modo tutorial
		else
			radioArcade.doClick();
		
		dificultad.setValue(config[1]); //Seteamos dificultad
		
	}
	
	
	
	
	
}


