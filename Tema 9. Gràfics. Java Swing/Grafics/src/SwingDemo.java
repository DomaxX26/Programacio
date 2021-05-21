import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jFrame = new JFrame("Formulari Bàsic");
        jFrame.setSize(475,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new GridLayout(4,4));

        JLabel label1 = new JLabel("Introduce tu nombre:");
        JTextField textfield1 = new JTextField("Nombre",20);


        JLabel label2 = new JLabel("Introduce tu apellido:");
        JTextField textfield2 = new JTextField("Apellido",20);

        JLabel label3 = new JLabel("Introduce tu correo:");
        JTextField textfield3 = new JTextField("Correo",20);

        JButton enviar = new JButton("Enviar");
        JButton borrar = new JButton("Limpiar");

        jFrame.add(label1);
        jFrame.add(textfield1);

        jFrame.add(label2);
        jFrame.add(textfield2);

        jFrame.add(label3);
        jFrame.add(textfield3);

        jFrame.add(enviar);
        jFrame.add(borrar);

        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}