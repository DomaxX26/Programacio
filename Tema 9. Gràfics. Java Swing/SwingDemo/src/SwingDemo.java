import javax.swing.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jFrame = new JFrame("Aplicació Simple Swing");
        jFrame.setSize(475,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Programación GUI con Swing");
        jFrame.add(jLabel);
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
