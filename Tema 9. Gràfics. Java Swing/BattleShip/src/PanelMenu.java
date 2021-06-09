import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class PanelMenu extends JPanel{

    public JButton botonJugar;
    public JButton botonConfig;
    public JButton botonReporte;
    public JButton botonPerfil;
    public JButton botonSalir;

    public PanelMenu() {
        botonJugar = new JButton("Jugar BattleShip");
        botonConfig = new JButton("Configuración");
        botonReporte = new JButton("Reportes");
        botonPerfil = new JButton("Mi Perfil");
        botonSalir = new JButton("Cerrar Sesión");

        setLayout(new BorderLayout());
        add(new PanelCentro(), BorderLayout.CENTER);
        JPanel sur = new JPanel();
        sur.add(botonSalir);
        add(sur, BorderLayout.SOUTH);
    }

    public void AccionPerfil(){

    }

    private class PanelCentro extends JPanel {
        public PanelCentro() {
            setLayout(new GridLayout(2, 2, 5, 5));
            add(botonJugar); add(botonConfig);
            add(botonReporte); add(botonPerfil);
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(20, 20, 20, 20),
                    BorderFactory.createCompoundBorder(
                            BorderFactory.createBevelBorder(BevelBorder.RAISED),
                            BorderFactory.createEmptyBorder(10, 10, 10, 10))));
        }
    }


}
