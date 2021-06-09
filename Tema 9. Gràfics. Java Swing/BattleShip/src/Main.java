import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private BattleShip batalla;
    private CardLayout paneles; //Albergará varios paneles como si fuera un "mazo" de cartas
    private JPanel panelPrincipal; //Este panel recibirá el CardLayout que gestiona el resto de paneles
    private PanelLogin panelLogin;
    private PanelMenu panelMenu;
    private PanelPerfil panelPerfil;

    public Main() {
        batalla = new BattleShip();
        //PanelLogin
        panelLogin = new PanelLogin();
        panelLogin.botonLogin.addActionListener(new AccionLogin());
        panelLogin.botonNuevo.addActionListener(new AccionNuevoUsuario());
        //PanelMenu
        panelMenu = new PanelMenu();
        panelMenu.botonSalir.addActionListener(new AccionLogout());

        //PanelPerfil
        panelPerfil = new PanelPerfil();
        panelPerfil.botonVolver.addActionListener(new AccionSalirPerfil());

        //Configuramos el "mazo" de paneles
        paneles = new CardLayout();
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(paneles);
        panelPrincipal.add(panelLogin, "login");
        panelPrincipal.add(panelMenu, "menu");
        panelPrincipal.add(panelPerfil, "perfil");
        add(panelPrincipal);

        setTitle("BattleShip");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

    //Clases ActionListener para PanelLogin
    private class AccionLogin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String[] datos = panelLogin.getDatosLogin();
            if (datos != null) {
                if (batalla.validarLogin(datos)) {
                    paneles.show(panelPrincipal, "menu");
                }
                else
                    JOptionPane.showMessageDialog(null, "Login Rechazado");
            }
        }
    }

    private class AccionNuevoUsuario implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] datos = panelLogin.getDatosLogin();
            if (datos != null) {
                //Con los datos obtenidos, creamos un nuevo Player
                if (batalla.addPlayer(new Player(datos[0], datos[1])))
                    JOptionPane.showMessageDialog(null, "Registro aceptado",
                            "Nuevo Usuario", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

    private class AccionLogout implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que desea Cerrar Sesión?",
                    "Logout", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                batalla.logoutPlayer1();
                paneles.show(panelPrincipal, "login");
                panelLogin.resetFormulario();
            }

        }
    }

    //Clases ActionListener para PanelPerfil
    private class AccionSalirPerfil implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            paneles.show(panelPrincipal, "menu");
        }
    }


}
