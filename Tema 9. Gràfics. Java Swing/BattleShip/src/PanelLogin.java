import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelLogin extends JPanel{

    private JTextField campoNombre;
    private JTextField campoPass;
    public JButton botonLogin;
    public JButton botonNuevo;
    private JButton botonSalir;

    public PanelLogin() {
        campoNombre = new JTextField(10);
        campoPass = new JTextField(10);
        botonLogin = new JButton("Login");
        botonNuevo = new JButton("Nuevo Usuario");
        botonSalir = new JButton("Cerrar Programa");
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); //Esto cierra el programa
            }
        });

        setLayout(new BorderLayout());
        add(new PanelCentro(), BorderLayout.CENTER);
        add(new PanelSur(), BorderLayout.SOUTH);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    //Paneles que componen el panel principal
    private class PanelCentro extends JPanel {

        public PanelCentro() {
            JPanel datos = new JPanel();
            datos.setLayout(new GridLayout(2,2,5,5));

            JPanel nombreLabel = new JPanel();
            nombreLabel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            nombreLabel.add(new JLabel("Nombre: "));
            JPanel nombreCampo = new JPanel();
            nombreCampo.setLayout(new FlowLayout(FlowLayout.LEFT));
            nombreCampo.add(campoNombre);

            JPanel passLabel = new JPanel();
            passLabel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            passLabel.add(new JLabel("Password: "));
            JPanel passCampo = new JPanel();
            passCampo.setLayout(new FlowLayout(FlowLayout.LEFT));
            passCampo.add(campoPass);

            datos.add(nombreLabel);
            datos.add(nombreCampo);
            datos.add(passLabel);
            datos.add(passCampo);
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(datos);
            JPanel boton = new JPanel();
            boton.add(botonLogin);
            add(boton);

            setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10),
                    BorderFactory.createTitledBorder("Datos Login")));
        }
    }

    private class PanelSur extends JPanel {
        public PanelSur() {
            JPanel nuevo = new JPanel();
            nuevo.add(botonNuevo);
            JPanel salir = new JPanel();
            salir.add(botonSalir);

            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            add(nuevo); add(salir);
        }
    }

    //Métodos de la clase
    public void resetFormulario() {
        campoNombre.setText(null);
        campoPass.setText(null);
    }

    /**
     * Recupera los datos del formulario y los retorna juntos en un array
     * de dos elementos: nombre y password.
     * @return Array String[] con los dos datos del formulario.
     */
    public String[] getDatosLogin() {
        String nombre = campoNombre.getText();
        String password = campoPass.getText();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío",
                    "Login Player", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Password no puede estar vacío",
                    "Login Player", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        //Tenemos datos, los devolvemos en un array
        return new String[] {nombre, password};
    }
}
