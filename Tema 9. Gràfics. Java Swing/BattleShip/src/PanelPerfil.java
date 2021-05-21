import javax.swing.*;
import java.awt.*;

public class PanelPerfil extends JPanel{

    private JTextField campoNombre;
    private JTextField campoPass;
    public JButton botonModificar;
    public JButton botonEliminar;
    public JButton botonVolver;
    private Player jugador;

    public PanelPerfil() {

        setLayout(new BorderLayout());
        add(new PanelCentro(), BorderLayout.CENTER);
        JPanel sur = new JPanel();
        botonVolver = new JButton("Volver");
        sur.add(botonVolver);
        add(sur, BorderLayout.SOUTH);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    private class PanelCentro extends JPanel {

        public PanelCentro() {
            campoNombre = new JTextField(15);
            campoPass = new JTextField(15);
            botonModificar = new JButton("Modificar");
            botonEliminar = new JButton("Eliminar");
            JPanel nombre = new JPanel();
            nombre.add(campoNombre);
            nombre.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createTitledBorder("Nombre usuario"),
                    BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            JPanel pass = new JPanel();
            pass.add(campoPass);
            pass.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createTitledBorder("Password"),
                    BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            JPanel botones = new JPanel();
            botones.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
            botones.add(botonModificar);
            botones.add(botonEliminar);

            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(nombre); add(pass); add(botones);
        }
    }

    /**
     * Recibe el Player logueado en la clase BatteShip,
     * lo setea como atributo de esta clase para poder trabajar
     * con él y actualiza los campos con los datos de este jugador.
     * @param jugador Objeto Player logueado como jugador1 en clase BattleShip
     */
    public void setPlayer(Player jugador) {
        this.jugador = jugador;
        campoNombre.setText(jugador.getNombre());
        campoPass.setText(jugador.getPassword());
    }

}
